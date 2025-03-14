package model;

import java.util.Arrays;

public abstract class AbstractTicTacToeModel implements TicTacToeModel {

    // '-' means that the space is empty.  You decide what player 1 and 2 is.
    public char[][] board;

    protected AbstractTicTacToeModel() {
        board = new char[3][3];
        for (char[] chars : board) {
            Arrays.fill(chars, '-');
        }
    }









}
