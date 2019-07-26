package com.whiz.chess.entity;

import com.whiz.chess.enums.Color;
import com.whiz.chess.enums.MoveType;
import com.whiz.chess.moves.MoveService;

public class Game {
    MoveService moveService;
    private Board board;
    Player p1;
    Player p2;
    private Color turnColor;

    public Game(Player p1,Player p2) {
        board = new Board();
        this.p1 = p1;
        this.p2 = p2;
        turnColor = Color.WHITE;
    }

    public ResponseData makeTurn(Position source, Position destination) {
        Spot sourceSpot = board.getSpot(source);
        Spot destinationSpot = board.getSpot(source);
        //check spot validatiy
        //check move validity


        isValidMove(sourceSpot, destinationSpot);

        return null;
    }

    private boolean isValidMove(Spot sourceSpot, Spot destinationSpot) {

        MoveType[] moveTypes = sourceSpot.getPiece().moveTypes;
        for (MoveType moveType : moveTypes) {
            if (moveService.validateMove(sourceSpot.getPosition(), destinationSpot.getPosition(), moveType, board)) {
                //execute the move and return the piece status
                return true;
            }
        }
        return false;
    }
}
