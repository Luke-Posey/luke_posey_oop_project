package controller;


import model.TTTModel;

public class TTTController implements TicTacToeController {
    // make a model
    private TTTModel model;
    // make a controller with model passed through
    public TTTController(TTTModel model) {
        this.model = model;
    }

    @Override
    public char getPieceAt(int row, int col) {
        // just run the model function for get piece at
        return model.getPieceAt(row, col);
    }

    @Override
    public void placePieceAt(int row, int col) {
        // run the model function for place piece
        model.placePieceAt(row, col);

    }

    @Override
    public boolean isGameOver() {
        for (int i = 0; i < 3; i++) { // Row checker
            if (model.getPieceAt(0, i) == model.getPieceAt(1, i) && model.getPieceAt(0, i) == model.getPieceAt(2, i) && model.getPieceAt(0, i) != '-') {
                return true;
            }
            // Column checker
            if (model.getPieceAt(i, 0) == model.getPieceAt(i, 1) && model.getPieceAt(i, 0) == model.getPieceAt(i, 2) && model.getPieceAt(i, 0) != '-') {
                return true;
            } }
        boolean diag1 = model.getPieceAt(0, 0) == model.getPieceAt(1, 1) && model.getPieceAt(0, 0) == model.getPieceAt(2, 0) && model.getPieceAt(0, 0) != '-';
        boolean diag2 = model.getPieceAt(0, 2) == model.getPieceAt(1, 1) && model.getPieceAt(0, 2) == model.getPieceAt(2, 0) && model.getPieceAt(0, 2) != '-';
        return diag1 || diag2;
    }

    @Override
    public int getPlayerNum() {
        return model.getPlayerNum(model.totalTurns);
    }

    public int getGameWinner() {
        return getPlayerNum();
    }
}




