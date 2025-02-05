package view;





import controller.TTTController;
import model.TTTModel;

import java.util.Scanner;

public class TTTView {

    public static void main(String[] args) {

        //Create the model, view, scanner, x and y values, and the winner string.
        TTTModel model = new TTTModel();
        TTTController controller = new TTTController(model);
        Scanner scanner = new Scanner(System.in);
        int x = -1;
        int y = -1;
        String winner = "";
        // while the game is not over
        while (!controller.isGameOver()) {

            //loop through to get the pieces, and add a seperator
            for (int i = 0; i < 3; i++) {
                System.out.print(" " + controller.getPieceAt(i,0));
                for (int j = 1; j < 3; j++) {
                    System.out.print(" | " + controller.getPieceAt(i,j));
                }
                System.out.println();
            }
            // if the player is player 0, player 0 is x, other than the winenr value
            if (controller.getPlayerNum() == 0) {
                System.out.println("Player X turn, please enter the x,y value of which you would like to place.");
                // get the x and y value, it goes from the top left corner.
                System.out.print("x: ");
                x = scanner.nextInt();
                System.out.print("y: ");
                y = scanner.nextInt();
            }
            // player 1 is o
            if (controller.getPlayerNum() == 1) {
                System.out.println("Player o turn, please enter the x,y value of which you would like to place.");
                System.out.print("x: ");
                // get the x and y values, starts in the top left corner.
                x = scanner.nextInt();
                System.out.print("y: ");
                y = scanner.nextInt();
            }
            // place the piece. it wont go to the next turn if there is already a piece there.
            controller.placePieceAt(x,y);


        }
        if (controller.getGameWinner() == 0) {
            // this is weird, but after they take their turn, the total turns is still incremented so its easier to compare o now = 0
             winner = "o";
        }
        if (controller.getGameWinner() == 1) {
            // winner x = player 1 now.
             winner = "x";
        }
        // print the winner and end game
        System.out.print("The winner is player " + winner + ".");
    }
}
