package GuessNumber;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Menu {
    public static void startMenu() {
        Scanner scanner = new Scanner(System.in);
        int choise;

        do {
            System.out.println(Colors.GREEN + "1. Start game" + Colors.RESET);
            System.out.println(Colors.BLUE + "2. Rules" + Colors.RESET);
            System.out.println(Colors.YELLOW + "3. Best score" + Colors.RESET);
            System.out.println(Colors.RED + "4. Exit" + Colors.RESET);
            choise = InputValidator.getInt(scanner);

            switch (choise){
                case 1 -> Game.startGame();
                case 2 -> Rules.rules();
                case 3 -> ScoreManager.showScore();
                case 4 -> System.out.println("Goodbye!!");
            }
        }while(choise != 4);
    }
}
