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
        // if empty
        if (isEmpty(row, col)) {
            // get the player number and if its 0 thats player x
            if (getPlayerNum(totalTurns) == 0){
                board[row][col] = 'x';
                totalTurns++;
                return true;
            }
            // if its player 1 its player o
            else if (getPlayerNum(totalTurns) == 1) {
                board[row][col] = 'o';
                totalTurns++;
                return true;
            }

            else{
                // if there is already a piece there then it returns false
                return false;
            }
        }
        // if it didnt work it returns false
        return false;
    }

    @Override
    public int getPlayerNum(int totalTurns) {

        // takes in total turns, mods 2 and gives you whos turn it is.
        return totalTurns % 2;
    }

}
