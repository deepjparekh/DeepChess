package com.deepparekh.deepchess.pieces

import androidx.compose.ui.unit.IntOffset
import org.jetbrains.compose.resources.DrawableResource

interface Piece {
    val color: PieceColor
    val image: DrawableResource
    val position: IntOffset


    /**
     * @param otherPieces : other pieces on board to compute the available moves for current piece.
     * @return : list of positions that current piece can move to.
     * **/
    fun getAvailableMoves(otherPieces: List<Piece>): List<IntOffset>
}

enum class PieceColor {
    WHITE, BLACK
}