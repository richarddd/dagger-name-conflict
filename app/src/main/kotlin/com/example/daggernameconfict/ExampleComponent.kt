package com.example.daggernameconfict

import dagger.Component

@Component(
    modules = [ExampleModule::class]
)
interface ExampleComponent {
    fun inject(app: App)
}