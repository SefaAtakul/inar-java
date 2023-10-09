package week_06;

import java.util.Scanner;

public class Question_06_04 {
    public static void main(String[] args) {
    //Display an integer reversed
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer :");
        int theNumberReverse = input.nextInt();
        reverse(theNumberReverse);
    }
    public static void reverse(int theNumberReverse){
        int remainder = 0 ;
        int reverse = 0 ;
        while (theNumberReverse!=0) {
            remainder = theNumberReverse % 10;
            reverse = reverse * 10 + remainder;
            theNumberReverse = theNumberReverse / 10;
        }
        System.out.printf("The reversed number is %d ",reverse);

    }
}
