package com.JamesButler.Pieces;

import com.JamesButler.ChessBoard.ChessBoard;
import com.JamesButler.ChessBoard.Tile;

import java.lang.reflect.Array;

public class Pawn extends Piece {

    Piece.pieceType pieceName;

    Tile[] test;

    public Pawn(int rowOfArray, int columnsOfArray, Piece.pieceColour pieceColour) {
        super(rowOfArray, columnsOfArray, pieceColour);
        setPieceName(Piece.pieceType.Pawn);
        setPieceType(Piece.pieceType.Pawn);
    }


//Movement
   public /*Tile[][]*/ boolean getPossibleMoves(ChessBoard test, int one, int two) {
       /*Tile[][] posMove = new Tile[8][8];*/

       System.out.println(test.getTile(this.getPiecePosColumn(), this.getPiecePosRow()));
       //x is column //y is row
       var curPos = test.getTile(getPiecePosColumn(), getPiecePosRow());

       //could do getPiecePosColumn()
       var newMove = test.getTile(getPiecePosColumn(), getPiecePosRow() - 1);

       System.out.println(newMove);

       if (test.getTile(newMove.getTilePosX(), newMove.getTilePosY()) == test.getTile(one, two)) {
           return true;
       } else {
           return false;
       }
   }

    @Override
    public boolean getPossibleMoves(ChessBoard test) {
        return false;
    }
    //-
    //getters
    public Piece.pieceType getPieceType() {
        return this.pieceType;
    }

    public int getPiecePosColumn() {
       return this.piecePosX;
    }

    public int getPiecePosRow() {
        return this.piecePosY;
    }

    //setters
    public void setPieceName(Piece.pieceType pieceName) {
        this.pieceName = pieceName;
    }

    public Piece.pieceType setPieceType(Piece.pieceType pieceType) {
        return this.pieceType = pieceType;
    }




//printing logic.
    public int outPutPiecePosX(int getPiecePosX) {
        int x = 1;
        return x += getPiecePosX;
    }

    public int outPutPiecePosY(int getPiecePosY) {
        int x = 1;
        return x += getPiecePosY;
    }
    @Override
    public String toString() {
        return "Pawn{" +
                "pieceName='" + pieceName + '\'' +
                ", piecePosX=" + outPutPiecePosX(piecePosX) +
                ", piecePosY=" + outPutPiecePosY(piecePosY) +
                ", pieceColour=" + pieceColour +
                '}';
    }

}
