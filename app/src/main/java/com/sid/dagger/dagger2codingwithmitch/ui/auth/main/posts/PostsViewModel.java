package com.sid.dagger.dagger2codingwithmitch.ui.auth.main.posts;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import com.sid.dagger.dagger2codingwithmitch.SessionManager;
import com.sid.dagger.dagger2codingwithmitch.network.main.MainApi;

import javax.inject.Inject;

public class PostsViewModel extends ViewModel {

    private static final String TAG = "PostsViewModel";

    private final SessionManager sessionManager;
    private final MainApi mainApi;

    @Inject
    public PostsViewModel(SessionManager sessionManager, MainApi mainApi) {
        this.sessionManager = sessionManager;
        this.mainApi = mainApi;
        Log.d(TAG, "PostsViewModel: viewmodel is working...");

    }


}
