package week_05;

import java.util.Scanner;

public class Question_05_21 {
    public static void main(String[] args) {
        //Financial application: compare loans with various interest rates
        Scanner input = new Scanner(System.in);
        //Take the loan amount and  of years from user
        System.out.print("Loan Amount :");
        double loanAmount = input.nextDouble();
        System.out.print("Number of years :");
        double numberOfYears = input.nextDouble();

        double interestRate= 5.0;

        double monthlyInterestRate = 0;

        double monthlyPayment = 0;

        double totalPayment = 0;

        System.out.println("Interest Rate   Monthly Payment   Total Payment");

        while (interestRate<=8){

            monthlyInterestRate =interestRate/1200;
            monthlyPayment = ((loanAmount * monthlyInterestRate) / (1 - ((1) / Math.pow((1 + monthlyInterestRate), (numberOfYears * 12)))));
            totalPayment = monthlyPayment * numberOfYears * 12;System.out.printf("%8.3f%%       %8.2f         %8.2f", interestRate, monthlyPayment, totalPayment);

            System.out.println();

            interestRate += (1.0 / 8);

        }
        }


    }

