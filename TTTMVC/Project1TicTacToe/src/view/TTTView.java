package view;

import controller.TTTController;
import model.TTTModel;

import java.util.Scanner;

public class TTTView {

    public static void main(String[] args) {
        TTTModel model = new TTTModel();
        TTTController controller = new TTTController(model);
        Scanner scanner = new Scanner(System.in);
        int x = -1;
        int y = -1;

        while (!controller.isGameOver()) {

            for (int i = 0; i < 3; i++) {
                System.out.print(" " + controller.getPieceAt(i,0));
                for (int j = 1; j < 3; j++) {
                    System.out.print(" | " + controller.getPieceAt(i,j));
                }
                System.out.println();
            }

            if (controller.getPlayerNum() == 0) {
                System.out.println("Player X turn, please enter the x,y value of which you would like to place.");
                System.out.print("x: ");
                x = scanner.nextInt();
                System.out.print("y: ");
                y = scanner.nextInt();
            }
            if (controller.getPlayerNum() == 1) {
                System.out.println("Player o turn, please enter the x,y value of which you would like to place.");
                System.out.print("x: ");
                x = scanner.nextInt();
                System.out.print("y: ");
                y = scanner.nextInt();
            }

            controller.placePieceAt(x,y);


        }
        int winner = controller.getGameWinner();
        System.out.print("The winner is player " + winner + ".");
    }
}
