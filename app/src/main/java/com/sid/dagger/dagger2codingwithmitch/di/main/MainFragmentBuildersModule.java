package com.sid.dagger.dagger2codingwithmitch.di.main;

import com.sid.dagger.dagger2codingwithmitch.ui.auth.main.profile.ProfileFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MainFragmentBuildersModule {

    @ContributesAndroidInjector
    abstract ProfileFragment contributeProfileFragment();
}
