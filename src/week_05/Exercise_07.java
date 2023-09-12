package week_05;

import java.util.Scanner;

public class Exercise_07 {
    public static void main(String[] args) {
        //Greatest Common Divisor
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first integer : ");
        int firstNumber = input.nextInt();
        System.out.println("Enter second integer : ");
        int secondNumber = input.nextInt();

        int gcd = 1 ;
        int k = 2 ;
        while(k <= firstNumber && k <= secondNumber){
            if (firstNumber % k == 0 && secondNumber % k == 0)
                gcd = k ;
            k++;
        }
        System.out.println("The greatest common divisor for " + firstNumber + " and " + secondNumber + " is " + gcd);

    }
}
