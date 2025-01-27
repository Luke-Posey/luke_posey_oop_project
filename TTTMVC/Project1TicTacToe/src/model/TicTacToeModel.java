package model;

public interface TicTacToeModel {
    int totalTurns = 0;

    char getPieceAt(int row, int col);

    boolean isEmpty(int row, int col);

    boolean placePieceAt(int row, int col);

    int getPlayerNum(int turns);


}
