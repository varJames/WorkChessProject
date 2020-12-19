package com.JamesButler.Pieces;

import com.JamesButler.ChessBoard.ChessBoard;

public class Knight extends Piece {

    Piece.pieceType pieceName;

    public Knight(int rowOfArray, int columnsOfArray, Piece.pieceColour pieceColour) {
        super(rowOfArray, columnsOfArray, pieceColour);
        setPieceName(Piece.pieceType.Knight);
        setPieceType(Piece.pieceType.Knight);
    }

//Movement
public /*Tile[][]*/ boolean getPossibleMoves(ChessBoard test, int one, int two) {
    /*Tile[][] posMove = new Tile[8][8];*/

    //x is column //y is row
    var curPos = test.getTile(this.piecePosX, this.piecePosY);

    //could do getPiecePosColumn()
    /*var allowedMove = test.getTile();*/ //the logic Not done.

    if (true) {

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
        return "Knight{" +
                "pieceName='" + pieceName + '\'' +
                ", piecePosX=" + outPutPiecePosX(piecePosX) +
                ", piecePosY=" + outPutPiecePosY(piecePosY) +
                ", pieceColour=" + pieceColour +
                '}';
    }

}
