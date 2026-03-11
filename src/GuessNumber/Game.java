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

            userNum = scanner.nextInt();
            if (userNum > secretNum){
                System.out.println(Colors.RED + "it's too big" + Colors.RESET);
            }else if (userNum < secretNum){
                System.out.println(Colors.YELLOW + "it's too small" + Colors.RESET);
            }else{
                System.out.println(Colors.GREEN + "Congratulation you guess a number :)" + Colors.RESET);
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
}
