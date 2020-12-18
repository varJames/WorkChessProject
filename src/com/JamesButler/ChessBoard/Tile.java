package com.JamesButler.ChessBoard;

import com.JamesButler.Pieces.Piece;

public class Tile {

    int tilePosX;
    int tilePosY;

    boolean isTileOccupied;

    enum tileColour {
        black, white;
    }

    Piece hasPiece;

    tileColour tileColour;

    public Tile(int rowOfArray, int columnsOfArray, Piece setPiece) {
        tilePosX = rowOfArray + 1;
        tilePosY = columnsOfArray + 1;
        this.tileColour = setTileColour();
        this.hasPiece = setPiece;
        this.isTileOccupied = isTileOccupied();
    }

    public tileColour setTileColour() {
        int test = getTilePosX() + getTilePosY();
        return test % 2 == 1 ? tileColour.black : tileColour.white;
    }

    public Boolean isTileOccupied() {
        if (this.getPiece() == null) {
            return false;
        } else {
            return true;
        }
    }

    //getters
    public int getTilePosX() {
        return tilePosX;
    }

    public int getTilePosY() {
        return tilePosY;
    }

    public Piece getPiece() {
        return this.hasPiece;
    }

//MOVeMENT
    public /*Tile[][]*/ boolean getPossibleMoves(ChessBoard test) {
       return getPiece().getPossibleMoves(test);
    }
//-
    //setters
    public void setTilePosX(int tilePosX) {
        this.tilePosX = tilePosX;
    }

    public void setTilePosY(int tilePosY) {
        this.tilePosY = tilePosY;
    }

    @Override
    public String toString() {
        return "Tile{" +
                "tilePosX=" + tilePosX +
                ", tilePosY=" + tilePosY +
                ", tileColour=" + tileColour +
                ", isOccupied=" + isTileOccupied +
                ", hasPiece=" + hasPiece +
                '}';
    }


}
