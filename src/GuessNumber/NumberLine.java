package GuessNumber;

import java.util.ArrayList;

public class NumberLine {

    private String[] colors;
    private int maxNumber;

    public NumberLine(int maxNumber) {
        this.maxNumber = maxNumber;
        colors = new String[maxNumber + 1];
        for (int i = 0; i <= maxNumber; i++) {
        colors[i] = Colors.RESET;
        }
    }

    public void showLine() {
        for (int i = 0; i <= maxNumber; i++) {
            System.out.print(colors[i] + i + Colors.RESET + " ");
            if (i % 10 ==0) System.out.println();
        }
        System.out.println();
    }

    public void updateNumber(int number, int difference) {
        if (difference == 0){
            colors[number] = Colors.GREEN;
        }else if (difference <= 5 ) {
            colors[number] = Colors.RED;
        }else if (difference <= 10){
            colors[number] = Colors.ORANGE;
        }else if (difference <= 20){
            colors[number] = Colors.YELLOW;
        }else if (difference <= 40){
            colors[number] = Colors.BLUE;
        }else {
            colors[number] = Colors.RESET;
        }
    }
}
