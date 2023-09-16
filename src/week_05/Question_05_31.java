package week_05;

import java.util.Scanner;

public class Question_05_31 {
    public static void main(String[] args) {
        //Financial application : compute CD value

        Scanner input = new Scanner(System.in);

        double totalCdValue = 0 ;

        System.out.print("Enter the initial deposit of amount :");
        double amount = input.nextDouble();
        System.out.print("Enter annual percentage yield : ");
        double yieldPercentage = input.nextDouble();
        System.out.print("Enter maturity period (number of months): ");
        int numberOfMonths = input.nextInt();

        System.out.print("Month\tCD Value");

        for (int i = 1 ; i <= numberOfMonths ; i++){
            totalCdValue = (totalCdValue+amount)+(amount*yieldPercentage/1200);
            System.out.printf("\n\t%d\t%.2f",i,totalCdValue);

        }
    }
}
