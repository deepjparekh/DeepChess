package com.deepparekh.deepchess

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform