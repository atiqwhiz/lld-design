package com.whiz.chess.moves;

import com.whiz.chess.entity.Board;
import com.whiz.chess.entity.Position;

public class TwoStepForwardVerticleImpl extends VerticleMoveImpl {

    @Override
    public boolean validifyMove(Position source, Position destination, Board board) {
       return false;
    }
}
