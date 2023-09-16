package week_05;

import java.util.Scanner;

public class Question_05_30 {
    public static void main(String[] args) {
        //Financial application : compound value
        Scanner input = new Scanner(System.in);


        double totalAmount = 0 ;

        System.out.print("Enter Money Amount (e.g.,100) : " );
        double moneyAmount = input.nextInt();
        System.out.print("Enter the annual interest rate (e.g.,5) :");
        double annualInterestRate = input.nextInt();
        System.out.print("Enter the number of months (e.g.,6) : " );
        int numberOfMonths = input.nextInt();

        double monthlyInterestRate = annualInterestRate/1200;
        //our loop will execute as numberOfMonths

        for ( int i = 1 ;i <= numberOfMonths ; i++ ){
            totalAmount = (moneyAmount + totalAmount)*(1+monthlyInterestRate);

        }
        System.out.printf("Amount in savings account after %d months : $%.2f", numberOfMonths, totalAmount);

    }
}
