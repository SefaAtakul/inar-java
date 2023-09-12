package week_05;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Question_05_22 {
    public static void main(String[] args) {
        //Financial application :loan amortization schedule
        Scanner input = new Scanner(System.in);
        //Prompt the user enter the Loan amount,number of years and interest rate
        System.out.print("Loan Amount : ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of Years : ");
        double numberOfYears = input.nextDouble();
        System.out.print("Annual Interest Rate :");
        double annualInterestRate = input.nextDouble();

        //balance is initially loanAmount
        double balance = loanAmount;
        double interest;
        double principal;

        double monthlyInterestRate = annualInterestRate / 1200;

        //Calculate the Monthly Payment
        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
        //Find the total payment
        double totalAmount = monthlyPayment * numberOfYears * 12;

        //Prompt monthlyPayment and totalPayment
        System.out.printf("Monthly Payment : %.2f", monthlyPayment);
        System.out.printf("\nTotal Payment : %.2f\n", totalAmount);

        System.out.println("Payment#\t\tInterest\t\tPrincipal\t\tBalance");

        for (int i = 1; i <= numberOfYears * 12; i++) {

            interest = monthlyInterestRate * balance;

            principal = monthlyPayment - interest;

            balance = balance - principal;

            if (numberOfYears == 12 && balance == 0) {
                principal += balance;
                balance = 0;
            }

            System.out.printf("%d\t\t\t\t%.2f\t\t\t%.2f\t\t\t%.2f", i, interest, principal, balance);
            System.out.println();

        }
    }
}
