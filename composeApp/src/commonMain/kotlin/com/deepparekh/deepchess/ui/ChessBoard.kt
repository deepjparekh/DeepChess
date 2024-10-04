package com.deepparekh.deepchess.ui

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun ChessBoard() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Row {
            for (file in 8 downTo 1) {
                Column(modifier = Modifier.weight(1f)) {
                    for (rank in 1..8) {
                        val isDark = (rank % 2) == (file % 2)
                        Square(isDark)
                    }
                }
            }
        }
    }
}

@Composable
fun Square(isDarkSquare: Boolean) {
    Canvas(modifier = Modifier.aspectRatio(1f)) {
        val squareColor = if (isDarkSquare) Color.DarkGray else Color.LightGray
        drawRect(
            color = squareColor
        )
    }
}