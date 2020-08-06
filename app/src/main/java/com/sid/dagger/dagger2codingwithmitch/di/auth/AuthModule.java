package com.sid.dagger.dagger2codingwithmitch.di.auth;

import com.sid.dagger.dagger2codingwithmitch.network.auth.AuthApi;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public abstract class AuthModule {

    @Provides
    static AuthApi provideSessionApi(Retrofit retrofit){
        return retrofit.create(AuthApi.class);
    }
}
