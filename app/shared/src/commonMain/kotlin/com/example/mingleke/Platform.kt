package com.example.mingleke

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform