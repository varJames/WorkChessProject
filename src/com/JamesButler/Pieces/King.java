package com.JamesButler.Pieces;

import com.JamesButler.ChessBoard.ChessBoard;

public class King extends Piece {

    Piece.pieceType pieceName;

    public King(int rowOfArray, int columnsOfArray, Piece.pieceColour pieceColour) {
        super(rowOfArray, columnsOfArray, pieceColour);
        setPieceName(Piece.pieceType.King);
        setPieceType(Piece.pieceType.King);
    }

//Movement
    public /*Tile[][]*/ boolean getPossibleMoves(ChessBoard test) {
        return false;
    }
//-
    public void setPieceName(Piece.pieceType pieceName) {
        this.pieceName = pieceName;
    }

    public Piece.pieceType setPieceType(Piece.pieceType pieceType) {
        return this.pieceType = pieceType;
    }

    public Piece.pieceType getPieceName() {
        return pieceName;
    }

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
        return "King{" +
                "pieceName='" + pieceName + '\'' +
                ", piecePosX=" + outPutPiecePosX(piecePosX) +
                ", piecePosY=" + outPutPiecePosY(piecePosY) +
                ", pieceColour=" + pieceColour +
                '}';
    }
}
