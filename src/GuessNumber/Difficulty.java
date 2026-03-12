package GuessNumber;

import java.util.Scanner;

public class Difficulty {
    static int difficultyLevel(Scanner scanner) {
        System.out.println("Choose difficulty level: ");
        System.out.println("1. Easy level");
        System.out.println("2. Medium level");
        System.out.println("3. Hard level");
        System.out.println("4. Impossible level");

        int choise = InputValidator.getInt(scanner);

        switch (choise){
            case 1:
                return 50;
            case 2:
                return 100;
            case 3:
                return 500;
            case 4:
                return 1000;
            default:
                return 100;
        }
    }
}
