package controller;


import model.TTTModel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TTTControllerTest {

    @Test
    void getGameWinner() {
        TTTModel model = new TTTModel();
        TTTController controller = new TTTController(model);
        controller.placePieceAt(0,0);
        controller.placePieceAt(0,1);
        controller.placePieceAt(1,0);
        controller.placePieceAt(1,1);
        controller.placePieceAt(2,0);
        assertEquals(1,controller.getGameWinner());
       for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 3; j++) {
               model.board[i][j] = '-';
           }
       }
       model.totalTurns = 0;
        controller.placePieceAt(0,0);
        controller.placePieceAt(0,1);
        controller.placePieceAt(1,0);
        controller.placePieceAt(1,1);
        controller.placePieceAt(2,2);
        controller.placePieceAt(2,1);
        assertEquals(0,controller.getGameWinner());


    };


    @Test
    void isGameOver() {
        TTTModel model = new TTTModel();
        TTTController controller = new TTTController(model);
        controller.placePieceAt(0,0);
        controller.placePieceAt(0,1);
        controller.placePieceAt(1,0);
        controller.placePieceAt(1,1);
        controller.placePieceAt(2,0);
        assertTrue(controller.isGameOver());

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                model.board[i][j] = '-';
            }
        }
        model.totalTurns = 0;
        assertFalse(controller.isGameOver());


    }





}
