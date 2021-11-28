package com.example.daggernameconfict

import dagger.Module
import dagger.Provides

@Module
class ExampleModule {

    @Provides
    fun provideExampleDependency() = ExampleDependency()
}