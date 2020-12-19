package com.JamesButler.TheProgramsBrain;

import com.JamesButler.ChessBoard.ChessBoard;
import com.JamesButler.ChessBoard.Tile;
import com.JamesButler.Pieces.Piece;

import java.util.Scanner;

public class Main {
    //scanner for Main Class
    Scanner uInput = new Scanner(System.in);

    public static void main(String[] args) {

        init();

    }

    public static void init() {
        ChessBoard chessBoard = new ChessBoard();

        chessBoard.fillsBoard();
        chessBoard.addAllPieces();

        /*chessBoard.printBoard();
        chessBoard.printSomethingFancy();

        System.out.println("After adding piece");
        chessBoard.printSomethingFancy();

        chessBoard.printBoard();

        chessBoard.testAddArray();
        chessBoard.testPrintArray();*/


        chessBoard.printSomethingFancy();
        chessBoard.pieceMove(6, 6);

        chessBoard.printSomethingFancy();

        chessBoard.testAddWhiteToArray(); //or black.
        chessBoard.testPrintWhiteArray(); //prints white pieces array.

        /*chessBoard.testPrint(7, 7);*/

    }
//test1
}
