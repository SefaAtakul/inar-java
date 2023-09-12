package week_05;

import java.util.Scanner;

public class Question_05_16 {
    public static void main(String[] args) {
        //Find the factors
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer :");
        int number = input.nextInt();
        int divisor = 2;
        System.out.print("The factors of " + number + " is ");


        while (number != 1) {
            if (number % divisor == 0) {
                System.out.print(divisor + " ");
                number /= divisor;
            } else {
                divisor++;
            }
        }
    }
}
