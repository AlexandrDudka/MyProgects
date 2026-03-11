package GuessNumber;

import java.util.ArrayList;

public class ScoreManager {

    static int[] bestScore = new int[5];

    public static void addScore(int newScore) {
        for (int i = 0; i < bestScore.length; i++) {
            if (newScore > bestScore[i]){
                for (int j = bestScore.length - 1; j > i; j--) {
                    bestScore[i] = bestScore[j -1];
                }

                bestScore[i] = newScore;
                break;
            }
        }
    }

    public static void showScore() {
        System.out.println("--BEST SCORE--");

        for (int i = 0; i < bestScore.length; i++) {
            System.out.println((i + 1) + ". " + bestScore[i]);
        }
    }
}
