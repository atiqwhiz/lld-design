package com.whiz.chess.entity;

import com.whiz.chess.enums.Color;
import com.whiz.chess.enums.MoveType;
import com.whiz.chess.enums.PieceType;

public class King extends Piece {

    @Override
    protected void setMoveTypes() {
        moveTypes = new MoveType[]{MoveType.SQUARE};
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
