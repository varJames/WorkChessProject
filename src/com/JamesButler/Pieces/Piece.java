package com.JamesButler.Pieces;

import com.JamesButler.ChessBoard.ChessBoard;
import com.JamesButler.ChessBoard.Tile;

import java.lang.reflect.Array;

abstract public class Piece {

    int piecePosX;
    int piecePosY;

    Piece.pieceColour pieceColour;

    public abstract Piece.pieceType getPieceType();

//Array of possible movements;
    public abstract /*Tile[][]*/ boolean getPossibleMoves(ChessBoard test);

    public enum pieceColour {
        black, white;
    }

    static Piece.pieceType pieceType;
    public enum pieceType {
        Pawn, Knight, Bishop, Rook, Queen, King;
    }

    public Piece(int rowOfArray, int columnsOfArray, Piece.pieceColour pieceColour) {
        piecePosX = rowOfArray;
        piecePosY = columnsOfArray;
        this.pieceColour = pieceColour;
        getPieceType();
    }

    public Piece.pieceColour getPieceColour() {
        return this.pieceColour;
    }

    @Override
    public String toString() {
        return "Piece{" +
                "piecePosX=" + piecePosX +
                ", piecePosY=" + piecePosY +
                ", pieceColour=" + pieceColour +
                '}';
    }

}
