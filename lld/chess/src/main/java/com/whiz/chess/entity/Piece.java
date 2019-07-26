package com.whiz.chess.entity;

import com.whiz.chess.enums.Color;
import com.whiz.chess.enums.MoveType;
import com.whiz.chess.enums.PieceType;
import lombok.Getter;


@Getter
public abstract class Piece {
    public Color color;
    public Position position;
    public PieceType pieceType;
    public MoveType [] moveTypes;

    public void setPosition(Position position) {
        this.position = position;
    }
    protected abstract void setMoveTypes();
    protected abstract void setPieceType();
    protected abstract void setColor(Color color);
}
