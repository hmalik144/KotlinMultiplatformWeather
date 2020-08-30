package com.appttude.h_mal.shared

expect fun platformName() : String

fun createApplicationScreenMessage() : String {
    return "Kotlin Rocks on ${platformName()}"
}