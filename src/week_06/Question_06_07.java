package week_06;

import java.util.Scanner;

public class Question_06_07 {
    public static void main(String[] args) {
        //Financial application: compute the future investment  value
        Scanner input = new Scanner(System.in);
        System.out.print("The Amount İnvested : ");
        double investmentAmount = input.nextDouble();

        System.out.print("Annual interest rate : ");
        double annualInterestRate = input.nextDouble();



        System.out.print("  Years Future Value  ");
        int years = 30;

        printFutureInvesmentValue(investmentAmount, annualInterestRate, years);

    }
public static void printFutureInvesmentValue(double investmentAmount , double annualInterestRate , int years){
        for (int i = 1 ; i<=30 ; i++){
            System.out.printf("\n%4d \t %-10.2f",i,futureInvestmentValue(investmentAmount,annualInterestRate,i));
        }
}
   public static double futureInvestmentValue(double investmentAmount,double annualInterestRate,int i) {
       double monthlyInterestRate = annualInterestRate /1200 ;
       double futureInvestmentValue = investmentAmount * (Math.pow((1 + monthlyInterestRate), (i * 12)));
       return futureInvestmentValue;

    }

}

