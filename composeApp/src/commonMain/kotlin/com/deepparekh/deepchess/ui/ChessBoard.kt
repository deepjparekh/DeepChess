package com.deepparekh.deepchess.ui

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun ChessBoard(modifier: Modifier = Modifier) {
    BoxWithConstraints {  }
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
            for (file in 8 downTo 1) {
                Column(modifier = Modifier.weight(1f)) {
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
    Canvas(modifier = Modifier.fillMaxSize()) {
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