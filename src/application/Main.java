package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMath;

public class Main {
    public static void main(String[] args) {
        ChessMath chessMath = new ChessMath();
        UI.printBoard(chessMath.getPieces());
    }
}
