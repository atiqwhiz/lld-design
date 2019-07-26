package com.whiz.chess.moves;

import com.whiz.chess.entity.Board;
import com.whiz.chess.entity.Position;
import com.whiz.chess.enums.MoveType;

public abstract class MoveService {

    public boolean validateMove(Position source, Position destination, MoveType moveType, Board board) {
       MoveService moveService = null;
       if (moveType == MoveType.DIAGONAL) {
          moveService = new DiagonalMoveImpl();
          return moveService.validifyMove(source, destination, board);
       } else if (moveType == MoveType.HORIZONTAL) {
          moveService = new HorizontalMoveImpl();
          return moveService.validifyMove(source, destination, board);
       } else if (moveType == MoveType.SQUARE) {
          moveService = new DiagonalMoveImpl();
          return moveService.validifyMove(source, destination, board);
       }
       return false;
    }

    public abstract boolean validifyMove(Position source, Position destination,Board board);

}
