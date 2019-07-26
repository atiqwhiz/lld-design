package com.whiz.chess.moves;

import com.whiz.chess.entity.Board;
import com.whiz.chess.entity.Position;

public class DiagonalMoveImpl extends MoveService {
    @Override
    public boolean validifyMove(Position source, Position destination, Board board) {
        /**
         * Check validity of move
         */
        return false;
    }
}