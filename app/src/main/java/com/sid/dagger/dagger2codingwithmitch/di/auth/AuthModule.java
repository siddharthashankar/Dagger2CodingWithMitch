package com.sid.dagger.dagger2codingwithmitch.di.auth;

import com.sid.dagger.dagger2codingwithmitch.models.User;
import com.sid.dagger.dagger2codingwithmitch.network.auth.AuthApi;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public abstract class AuthModule {

    @AuthScope
    @Provides
    static AuthApi provideSessionApi(Retrofit retrofit){
        return retrofit.create(AuthApi.class);
    }

    @AuthScope
    @Provides
    @Named("auth_user")
    static User someUser(){
        return  new User();
    }
}
