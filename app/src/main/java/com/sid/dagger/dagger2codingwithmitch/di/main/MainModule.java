package com.sid.dagger.dagger2codingwithmitch.di.main;

import com.sid.dagger.dagger2codingwithmitch.network.main.MainApi;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class MainModule {

    @Provides
    static MainApi provideMainApi(Retrofit retrofit) {
        return retrofit.create(MainApi.class);

    }
}

