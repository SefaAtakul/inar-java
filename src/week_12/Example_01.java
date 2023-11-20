package week_12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example_01 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        boolean isBoolean =true;

        do {
            try {
                System.out.println("Enter an ınteger : ");
                int number = input.nextInt();
                System.out.println("The number You Entered :" + number);
                isBoolean = false;
            }catch (InputMismatchException ex){
                System.out.println("Try again.The program required an ınteger!");
              input.nextLine();
            }
        }while (isBoolean);
    }
}
