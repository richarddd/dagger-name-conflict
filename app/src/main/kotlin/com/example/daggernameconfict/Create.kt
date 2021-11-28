package com.example.daggernameconfict

import javax.inject.Inject

class Create @Inject constructor(
    private val dependency: ExampleDependency
) {

    fun greet() = dependency.greet()
}
