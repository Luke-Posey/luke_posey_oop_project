package controller;

import model.TTTModel;

public class TTTController implements TicTacToeController {

    private TTTModel model;
    public TTTController(TTTModel model) {
        this.model = model;
    }

    @Override
    public char getPieceAt(int row, int col) {
        return model.getPieceAt(row, col);
    }

    @Override
    public void placePieceAt(int row, int col) {
        model.placePieceAt(row, col);

    }

    @Override
    public boolean isGameOver() {
        String x = "xxx";
        String o = "ooo";
        String topRow = String.valueOf(this.getPieceAt(0,0) + this.getPieceAt(0,1) + this.getPieceAt(0,2));
        String middleRow = String.valueOf(this.getPieceAt(1,0) + this.getPieceAt(1,1) + this.getPieceAt(1,2));
        String bottomRow = String.valueOf(this.getPieceAt(2,0) + this.getPieceAt(2,1) + this.getPieceAt(2,2));
        String leftCol = String.valueOf(this.getPieceAt(0,0) + this.getPieceAt(1,0) + this.getPieceAt(2,0));
        String middleCol = String.valueOf(this.getPieceAt(0,1) + this.getPieceAt(1,1) + this.getPieceAt(2,1));
        String rightCol = String.valueOf(this.getPieceAt(0,2) + this.getPieceAt(1,2) + this.getPieceAt(2,2));
        String DiagOne = String.valueOf(this.getPieceAt(0,0) + this.getPieceAt(1,1) + this.getPieceAt(2,2));
        String DiagTwo = String.valueOf(this.getPieceAt(0,2) + this.getPieceAt(1,1) + this.getPieceAt(2,0));
        if (topRow.equals(x) | topRow.equals(o)){
            return true;
        }
        if (middleRow.equals(x) | middleRow.equals(o)){
            return true;
        }
        if (bottomRow.equals(x) | bottomRow.equals(o)){
            return true;
        }
        if (leftCol.equals(x) | leftCol.equals(o)){
            return true;
        }
        if (middleCol.equals(x) | middleCol.equals(o)){
            return true;
        }
        if (rightCol.equals(x) | rightCol.equals(o)){
            return true;
        }
        if (DiagOne.equals(x) | DiagTwo.equals(x)){
            return true;
        }
        if (DiagOne.equals(o) | DiagTwo.equals(o)){
            return true;
        }
        return false;
    }

    @Override
    public int getPlayerNum() {
        return model.getPlayerNum(model.totalTurns);
    }

    public int getGameWinner() {
            return getPlayerNum();
    }
}
