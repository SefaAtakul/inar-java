package week_03;

import java.util.Scanner;

public class Question_03_12 {
    public static void main(String[] args) {
        //Palindrome Numbers
        Scanner input = new Scanner(System.in);

        //Prompt the user Enter a three digit integer
        System.out.println("Enter three digit integer : ");
        int threeDigitInt = input.nextInt();
        int digit1 = threeDigitInt / 100;
        int remaining = threeDigitInt % 100;
        int digit2 = remaining / 10;
        int digit3 = remaining % 10;
        if (digit1 == digit3) {
            System.out.println(threeDigitInt + " is a palindrome");

        } else {
            System.out.println(threeDigitInt + " is not a palindrome");

        }
    }
}