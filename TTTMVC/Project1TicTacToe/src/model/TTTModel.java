package model;

public class TTTModel extends AbstractTicTacToeModel {

    public int totalTurns = 0;

    @Override
    public char getPieceAt(int row, int col) {
        //gets the row and col of the piece asked.
        return board[row][col];
    }

    @Override
    public boolean isEmpty(int row, int col) {
        // returns if the desired piece is equal to "-" which represents empy
        return board[row][col] == '-';
    }

    @Override
    public boolean placePieceAt(int row, int col) {
        if (isEmpty(row, col)) {

            if (getPlayerNum(totalTurns) == 0){
                board[row][col] = 'x';
                totalTurns++;
                return true;
            }

            else if (getPlayerNum(totalTurns) == 1) {
                board[row][col] = 'o';
                totalTurns++;
                return true;
            }

            else{
                return false;
            }
        }
        return false;
    }

    @Override
    public int getPlayerNum(int totalTurns) {
        return totalTurns % 2;
    }

}
