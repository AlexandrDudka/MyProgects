import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userNum = 0;

        System.out.println("Give number ");
        userNum = scanner.nextInt();

        if(userNum <= -1){
            System.out.println("Minus number");
        }else
            System.out.println("plus number");
    }
}

