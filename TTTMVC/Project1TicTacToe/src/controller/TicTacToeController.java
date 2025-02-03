package controller;

public interface TicTacToeController {

    char getPieceAt(int row, int col);

    void placePieceAt(int row, int col);

    boolean isGameOver();

    int getPlayerNum();

    int getGameWinner();

}
