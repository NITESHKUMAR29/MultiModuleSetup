package com.example.notesmodulization.di

import com.example.common_utils.Navigator
import com.example.notesmodulization.navigation.DefaultNavigator
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class MainModule {
    @Provides
    @Singleton
    fun provideNavigator(): Navigator.Provider {
        return DefaultNavigator()
    }

}