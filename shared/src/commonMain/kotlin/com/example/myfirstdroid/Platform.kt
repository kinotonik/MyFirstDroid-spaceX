package com.example.myfirstdroid

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform