package com.innova.innovaPoolingLibrary

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
