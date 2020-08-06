package com.sid.dagger.dagger2codingwithmitch.di;

import androidx.lifecycle.ViewModelProvider;

import com.sid.dagger.dagger2codingwithmitch.viewmodels.ViewModelProviderFactory;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ViewModelFactoryModule {

    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProviderFactory viewModelFactory);
}
