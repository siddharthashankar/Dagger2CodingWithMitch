package com.sid.dagger.dagger2codingwithmitch.di;

import com.sid.dagger.dagger2codingwithmitch.di.auth.AuthModule;
import com.sid.dagger.dagger2codingwithmitch.di.main.MainFragmentBuildersModule;
import com.sid.dagger.dagger2codingwithmitch.di.main.MainModule;
import com.sid.dagger.dagger2codingwithmitch.di.main.MainViewModelsModule;
import com.sid.dagger.dagger2codingwithmitch.ui.auth.AuthActivity;
import com.sid.dagger.dagger2codingwithmitch.di.auth.AuthViewModelsModule;
import com.sid.dagger.dagger2codingwithmitch.ui.auth.main.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(modules = {AuthViewModelsModule.class, AuthModule.class})
    abstract AuthActivity contributeAuthActivity();

    @ContributesAndroidInjector(
            modules = {MainFragmentBuildersModule.class, MainViewModelsModule.class, MainModule.class}
    )
    abstract MainActivity contributeMainActivity();

}