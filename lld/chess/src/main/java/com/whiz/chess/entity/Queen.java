package com.whiz.chess.entity;

import com.whiz.chess.enums.Color;
import com.whiz.chess.enums.MoveType;
import com.whiz.chess.enums.PieceType;

public class Queen extends Piece {

    @Override
    protected void setMoveTypes() {
        moveTypes = new MoveType[]{MoveType.VERTICLE, MoveType.HORIZONTAL, MoveType.DIAGONAL};
    }

    @Override
    protected void setPieceType() {
        pieceType = PieceType.KING;
    }

    @Override
    protected void setColor(Color color) {
        this.color = color;
    }
}
