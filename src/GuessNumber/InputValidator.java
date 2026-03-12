package GuessNumber;

import java.util.Scanner;

public class InputValidator {
    public static int getInt(Scanner scanner) {
        while(!scanner.hasNextInt()){
            System.out.println("Invalid input. Please enter a number");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
