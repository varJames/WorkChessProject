package com.JamesButler.ChessBoard;

import com.JamesButler.Pieces.*;

import java.util.Scanner;

public class ChessBoard {

    //scanner
    Scanner uInput = new Scanner(System.in);

    //Array for the chessboard
    Tile[][] chessBoard = new Tile[8][8];

    //Array for the black pieces
    Piece[] blackPiecesArray = new Piece[16];

    //Array for the white pieces
    Piece[] whitePiecesArray = new Piece[16];

    public void fillsBoard() {
        for (int rowOfArray = 0; rowOfArray < 8; ++rowOfArray) {
            for (int columnsOfArray = 0; columnsOfArray < 8; ++columnsOfArray) {
                this.chessBoard[rowOfArray][columnsOfArray] = new Tile(rowOfArray, columnsOfArray, null);
            }
        }
    }

    //add pieces to array though.
    public void testAddArray() {
        int arrayIterationCounter = 0;
        for (int rowOfArray = 0; rowOfArray < 8; ++rowOfArray) {
            for (int columnsOfArray = 0; columnsOfArray < 8; ++columnsOfArray) {
                if (this.chessBoard[rowOfArray][columnsOfArray].getPiece() != null &&
                        this.chessBoard[rowOfArray][columnsOfArray].hasPiece.getPieceColour() == Piece.pieceColour.white) {
                    whitePiecesArray[arrayIterationCounter] = chessBoard[rowOfArray][columnsOfArray].getPiece();
                    /*System.out.println(whitePiecesArray[arrayIterationCounter]);*/
                    this.chessBoard[0][0].getPossibleMoves(this);
                    arrayIterationCounter++;
                }
            }
        }
    }

    public Piece testPrintArray() {
        for (int i = 0; i < whitePiecesArray.length; i++) {
            System.out.println(whitePiecesArray[i]);
        }
        return null;
    }

//MOVeMENT
    public Tile getTile(int x, int y) {
        return chessBoard[x][y];
    }

    public int getUserMoveRow() {
        System.out.print("Please enter how many rowsForwards you'd like to move piece X: ");
        int uInewColumn = this.uInput.nextInt();
        System.out.println("\n");
        return uInewColumn;
    }

    public int getUserMoveColumn() {
        System.out.print("Please enter how many columnsSidewards you'd like to move piece Y: ");
        int uInewRow = this.uInput.nextInt();
        System.out.println("\n");
        return uInewRow;
    }
//chessBoard[7][0] = new Tile(7, 0,
    public void pieceMove(int oldColumn, int oldRow) {
        int newMoveRow = getUserMoveRow();
        int newMoveColumn = getUserMoveColumn();
        /*if (this.chessBoard[oldRow][oldColumn].getPiece().getPossibleMoves(this) == true ) {*/
            //getuserMove
            this.chessBoard[oldRow - newMoveRow][oldColumn - newMoveColumn] = new Tile(oldRow - newMoveRow, oldColumn - newMoveColumn,
                    new Pawn(oldRow - newMoveRow, oldColumn - newMoveColumn, Piece.pieceColour.white));
            this.chessBoard[oldColumn][oldRow] = new Tile(oldColumn, oldRow, null);
       /* } else {

        }*/
    }
//-

//addingAllPieces
    public void addAllPieces() {
        addWhitePawn();
        addWhiteRook();
        addWhiteKnight();
        addWhiteBishop();
        addWhiteQueen();
        addWhiteKing();
        addBlackPawn();
        addBlackRook();
        addBlackKnight();
        addBlackBishop();
        addBlackQueen();
        addBlackKing();
    }

//addingWhitePieces
    public void addWhitePawn() {
        for (int columnsOfArray = 0; columnsOfArray < 8; columnsOfArray++) {
            chessBoard[6][columnsOfArray] = new Tile(6, columnsOfArray,
                            new Pawn(6, columnsOfArray, Piece.pieceColour.white));

        }
    }

    public void addWhiteRook() {
        chessBoard[7][0] = new Tile(7, 0,
                new Rook(7, 0, Piece.pieceColour.white));
        chessBoard[7][7] = new Tile(7, 7,
                new Rook(7, 7, Piece.pieceColour.white));
    }

    public void addWhiteKnight() {
        chessBoard[7][1] = new Tile(7, 1,
                new Knight(7,1, Piece.pieceColour.white));
        chessBoard[7][6] = new Tile(7, 6,
                new Knight(7,6, Piece.pieceColour.white));
    }

    public void addWhiteBishop() {
        chessBoard[7][2] = new Tile(7, 2,
                new Bishop(7,2, Piece.pieceColour.white));
        chessBoard[7][5] = new Tile(7, 5,
                new Bishop(7,5, Piece.pieceColour.white));
    }

    public void addWhiteQueen() {
        chessBoard[7][3] = new Tile(7, 3,
                new Queen(7,3, Piece.pieceColour.white));
    }

    public void addWhiteKing() {
        chessBoard[7][4] = new Tile(7, 4,
                new King(7,4, Piece.pieceColour.white));
    }


//addingBlackPieces
    public void addBlackPawn() {
        for (int columnsOfArray = 0; columnsOfArray < 8; columnsOfArray++) {
            chessBoard[1][columnsOfArray] = new Tile(1, columnsOfArray,
                    new Pawn(1, columnsOfArray, Piece.pieceColour.black));
        }
    }

    public void addBlackRook() {
        chessBoard[0][0] = new Tile(0, 0,
                new Rook(0,0, Piece.pieceColour.black));
        chessBoard[0][7] = new Tile(0, 7,
                new Rook(0,7, Piece.pieceColour.black));
    }

    public void addBlackKnight() {
        chessBoard[0][1] = new Tile(0, 1,
                new Knight(0,1, Piece.pieceColour.black));
        chessBoard[0][6] = new Tile(0, 6,
                new Knight(0,6, Piece.pieceColour.black));
    }

    public void addBlackBishop() {
        chessBoard[0][2] = new Tile(0, 2,
                new Bishop(0,2, Piece.pieceColour.black));
        chessBoard[0][5] = new Tile(0, 5,
                new Bishop(0,5, Piece.pieceColour.black));
    }

    public void addBlackQueen() {
        chessBoard[0][4] = new Tile(0, 4,
                new Queen(0,4, Piece.pieceColour.black));
    }

    public void addBlackKing() {
        chessBoard[0][3] = new Tile(0, 3,
                new King(0,3, Piece.pieceColour.black));
    }



//printing the board methods
    public void printBoard() {
        for (int rowOfArray = 0; rowOfArray < 8; ++rowOfArray) {
            for (int columnsOfArray = 0; columnsOfArray < 8; ++columnsOfArray) {
                System.out.println(chessBoard[rowOfArray][columnsOfArray]);
            }
        }
    }

    public void printSomethingFancy() {
        System.out.print(" ");
        for (int i = 0; i < 8; i++) {
            int x = 1;
            x += i;
            System.out.print(" " + x);
        }
        System.out.println(" ");
        for (int rowOfArray = 0; rowOfArray < 8; ++rowOfArray) {
            int x = 1;
            x += rowOfArray;
            System.out.print(x);
            for (int columnsOfArray = 0; columnsOfArray < 8; ++columnsOfArray) {
                if (chessBoard[rowOfArray][columnsOfArray].isTileOccupied == false) {
                    System.out.print(" x");

                } else {
                    System.out.print(" o");

                }
            }
            System.out.print("\n");
        }
    }

    //testPrint
    public void testPrint(int row, int colum) {
        System.out.println(this.chessBoard[row][colum]);
    }

}
