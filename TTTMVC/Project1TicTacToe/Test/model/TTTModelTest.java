package model;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TTTModelTest {

    @Test
    void isEmpty() {
        TTTModel model = new TTTModel();
        assertEquals('-', model.board[0][0]);
    }

    @Test
    void getPieceAt(){
    TTTModel model = new TTTModel();
    model.board[0][0] = 'x';
    assertEquals('x', model.board[0][0]);

    }

    @Test
    void testIsEmptyStartup(){
        TTTModel model = new TTTModel();
        for (int i = 0; i < model.board.length; i++) {
            for (int j = 0; j < model.board[i].length; j++) {
                assertTrue(model.isEmpty(i, j));
            }
        }
    }

    @Test
    void testGetPlayerNumb(){
        TTTModel model = new TTTModel();
        assertEquals(0,model.getPlayerNum(model.totalTurns));
        model.placePieceAt(0,0);
        assertEquals(1,model.getPlayerNum(model.totalTurns));
        model.placePieceAt(0,1);
        assertEquals(0,model.getPlayerNum(model.totalTurns));
        model.placePieceAt(0,2);
        assertEquals(1,model.getPlayerNum(model.totalTurns));


    }
}