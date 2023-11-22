package week_12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_12_02 {
    public static void main(String[] args) {
        //InputMissMatchException
        Scanner input =new Scanner(System.in);
        System.out.print("Enter two Integers to sum  : " );
        boolean condition = true;
        while (condition) {
            try {
                int number1 = input.nextInt();
                int number2 = input.nextInt();
                System.out.println("Sum of " + number1 + "+" + number2 + " = " + (number1 + number2));
                condition = false;
            } catch (InputMismatchException ex) {
                System.out.println(ex);
                System.out.println("Wrong input!! Please enter Integer :  ");
                input.nextLine();
            }
        }

    }
}
