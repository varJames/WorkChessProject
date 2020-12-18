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
   public /*Tile[][]*/ boolean getPossibleMoves(ChessBoard test) {
       /*Tile[][] posMove = new Tile[8][8];*/

       var curPos = test.getTile(this.piecePosX, this.piecePosY);
       var newPos = test.getTile(this.piecePosX + 1, this.piecePosY);

       if (curPos.getPiece().getPieceColour() == newPos.getPiece().getPieceColour()) {
           return false;
       }
       return true;
   }
//-
    //setters
    public void setPieceName(Piece.pieceType pieceName) {
        this.pieceName = pieceName;
    }

    public Piece.pieceType setPieceType(Piece.pieceType pieceType) {
        return this.pieceType = pieceType;
    }

    //getters
    public Piece.pieceType getPieceType() {
        return this.pieceType;
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
