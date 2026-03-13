package GuessNumber;

import java.util.Random;
import java.util.Scanner;

public class Game {
    static int generateNumber(int max) {
        Random random = new Random();
        return random.nextInt(max) + 1;
    }

    public static void startGame() {
        Scanner scanner = new Scanner(System.in);
        boolean numIsGuessed = false;

        int maxNumber = Difficulty.difficultyLevel(scanner);
        int secretNum = generateNumber(maxNumber);
        int userNum;
        int maxAttempts;

        switch (maxNumber){
            case 50 -> maxAttempts = 6;
            case 100 -> maxAttempts = 10;
            case 500 -> maxAttempts = 15;
            case 1000 -> maxAttempts = 20;
            default -> maxAttempts = 10;
        }

        for (int score = maxAttempts; score > 0; score--) {

            System.out.println("Attempts " + score + " of " + maxAttempts);
            System.out.println("Guess a number between 1 and " + maxNumber);

            userNum = InputValidator.getInt(scanner);
            int difference = Math.abs(secretNum - userNum);
            boolean win = showDifference(difference);

            if(win){
                numIsGuessed = true;

                int finalScore = score * 10;
                ScoreManager.addScore(finalScore);

                break;
            }
        }
        if (!numIsGuessed) {
            System.out.println("Attempts are over. Game finished.");
            System.out.println("The number was: " + secretNum);
        }
    }

    public static boolean showDifference(int difference) {
        if (difference == 0){
            System.out.println("Congratulation you guess a number :)");
            return true;
        }else if (difference <= 5 ) {
            System.out.println(Colors.RED + "Very hot" + Colors.RESET);
        }else if (difference <= 10){
            System.out.println(Colors.RED + "Hot" + Colors.RESET);
        }else if (difference <= 20){
            System.out.println(Colors.YELLOW + "Warm" + Colors.RESET);
        }else if (difference <= 40){
            System.out.println(Colors.BLUE + "Cold" + Colors.RESET);
        }else {
            System.out.println(Colors.BLUE + "Very cold" + Colors.RESET);
        }
        return false;
    }
}
