package com.sid.dagger.dagger2codingwithmitch.di.main;

import androidx.lifecycle.ViewModel;

import com.sid.dagger.dagger2codingwithmitch.di.ViewModelKey;
import com.sid.dagger.dagger2codingwithmitch.ui.auth.main.profile.ProfileViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class MainViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(ProfileViewModel.class)
    public abstract ViewModel bindProfileViewModel(ProfileViewModel profileViewModel);
}
