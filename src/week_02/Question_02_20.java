package week_02;

import java.util.Scanner;

public class Question_02_20 {
    public static void main(String[]args){
        //Financial application = calculate interest
        System.out.println("Enter balance and interest rate ( e.g.,3 for  %3 ) = ");

        Scanner input = new Scanner(System.in) ;
        double balance = input.nextDouble() ;
        double interestRate = input.nextDouble() ;
        double interest = balance * ( interestRate /  1200 ) ;

        System.out.println("The interest is : " + (double) ((int) ( interest * 100000 )) / 100000 ) ;

    }
}
