package controller;

import model.TTTModel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TTTControllerTest {

    @Test
    void getGameWinner() {
        TTTModel model = new TTTModel();
        TTTController controller = new TTTController(model);
        assertEquals(0,controller.getGameWinner());

    };


    @Test
    void isGameOver() {
        TTTModel model = new TTTModel();
        TTTController controller = new TTTController(model);
        controller.placePieceAt(0,0);
        assertTrue(controller.isGameOver());


    }





}
