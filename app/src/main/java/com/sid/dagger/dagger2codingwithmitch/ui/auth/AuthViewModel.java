package com.sid.dagger.dagger2codingwithmitch.ui.auth;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.ViewModel;

import com.sid.dagger.dagger2codingwithmitch.SessionManager;
import com.sid.dagger.dagger2codingwithmitch.models.User;
import com.sid.dagger.dagger2codingwithmitch.network.auth.AuthApi;

import javax.inject.Inject;

import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

public class AuthViewModel extends ViewModel {

    private static final String TAG = "AuthViewModel";

    //inject
    private final SessionManager sessionManager;
    private final AuthApi authApi;

    @Inject
    public AuthViewModel(AuthApi authApi,SessionManager sessionManager){
        this.authApi = authApi;
        this.sessionManager = sessionManager;
        Log.d(TAG,"AuthViewModel: viewModel is working...");
    }

    public LiveData<AuthResource<User>> observeAuthState(){
        return sessionManager.getAuthUser();
    }

    public void authenticateWithId(int userId){
      Log.d(TAG,"attemptLogin: attempting to login.");
      sessionManager.authenticateWithId(queryUserId(userId));
    }

    private LiveData<AuthResource<User>> queryUserId(int userId){
        return LiveDataReactiveStreams.fromPublisher(
                authApi.getUser(userId)
                        .onErrorReturn(new Function<Throwable, User>() {
                            @Override
                            public User apply(Throwable throwable) throws Exception {
                                User errorUser = new User();
                                errorUser.setId(-1);
                                return errorUser;
                            }
                        })
                        .map(new Function<User, AuthResource<User>>() {
                            @Override
                            public AuthResource<User> apply(User user) throws Exception {
                                if(user.getId() == -1){
                                    return AuthResource.error("Could not authenticate", null);
                                }
                                return AuthResource.authenticated(user);
                            }
                        })
                        .subscribeOn(Schedulers.io()));
    }

}
