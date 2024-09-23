package com.deepparekh.deepchess.ui

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun ChessBoard(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.size(400.dp)
    ) {
        Row {
            for (file in 8 downTo 1) {
                Column(modifier = Modifier.width(50.dp)) {
                    for (rank in 1..8) {
                        val isDark = (rank % 2) == (file % 2)
                        println("Ranks = $rank, files = $file, isDark = $isDark")
                        Square((rank % 2) == (file % 2))
                    }
                }
            }
        }
    }
}

@Composable
fun Square(isDarkSquare: Boolean) {
    Canvas(modifier = Modifier.size(50.dp)) {
        val squareColor = if (isDarkSquare) Color.DarkGray else Color.LightGray
        drawRect(
            color = squareColor
        )
    }
}

@Preview
@Composable
private fun SquarePreview() {
    Row(modifier = Modifier.size(64.dp)) {
        Square(isDarkSquare = false)
        Spacer(modifier = Modifier.width(12.dp))
        Square(isDarkSquare = true)
    }
}