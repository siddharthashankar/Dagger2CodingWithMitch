package com.sid.dagger.dagger2codingwithmitch.di;

import com.sid.dagger.dagger2codingwithmitch.AuthActivity;
import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector
    abstract AuthActivity contributeAuthActivity();

    @Provides
    static String someStrings(){
        return "this is a first inject tested by sid";
    }
}