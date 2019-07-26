package com.whiz.chess.entity;

public class Board {

    private Spot [][] board;

    public Board(){
        board = new Spot[8][8];
    }

    public Spot getSpot(Position position){

        if(position.getRow()<0||position.getRow()>7||position.getCol()<0||position.getCol()>7){
            throw new IllegalArgumentException("Invalid access of spots");
        }
        return board[position.getRow()][position.getCol()];
    }
}
