package week_03;

import java.util.Scanner;

public class Question_03_31 {
    public static void main(String[] args) {
        //Financials: currency exchange
        Scanner input = new Scanner(System.in);
        //Take the exchange rate
        System.out.println("Enter the exchange rate from dollars to RBM :");
        double exchangeRate = input.nextDouble();
        System.out.println("Enter 0 to covert dollars to RBM and 1 vice versa :");
        int covert = input.nextInt();
        if(covert==0){
            System.out.println("Enter the dollar amount:");
            double dollar = input.nextDouble();
            System.out.println(dollar + " is " + dollar * exchangeRate+" yuan" );
        }else{
            System.out.println("Enter the yuan amount:");
            double yuan = input.nextDouble();
            System.out.println(yuan + " is $" + yuan / exchangeRate+" dollars" );
        }



    }
}
