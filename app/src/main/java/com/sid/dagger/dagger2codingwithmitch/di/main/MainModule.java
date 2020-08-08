package com.sid.dagger.dagger2codingwithmitch.di.main;

import com.sid.dagger.dagger2codingwithmitch.network.main.MainApi;
import com.sid.dagger.dagger2codingwithmitch.ui.auth.main.posts.PostRecyclerAdapter;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class MainModule {

    @MainScope
    @Provides
    static MainApi provideMainApi(Retrofit retrofit) {
        return retrofit.create(MainApi.class);
    }

    @MainScope
    @Provides
    static PostRecyclerAdapter provideAdapter(){
        return new PostRecyclerAdapter();
    }
}

