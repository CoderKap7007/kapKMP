package org.example.kap

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform