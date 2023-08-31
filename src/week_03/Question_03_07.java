package week_03;

import java.util.Scanner;

public class Question_03_07 {
    public static void main(String[]args) {
        //Financial application :monetary units
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of money : ");

        double amount = input.nextDouble();

        int remainingAmount = (int) (amount * 100);

        int numberOfDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        int numbersOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        int numberOfPennies = remainingAmount;

        System.out.println("Your amount " + amount + " is consist of : ");
        if(numberOfDollars>1) {
            System.out.println(" " + numberOfDollars + " dollars");
        }
        else{
            System.out.println(" " + numberOfDollars + " dollar");
        }

        if(numbersOfQuarters>1) {
            System.out.println(" " + numbersOfQuarters + " quarters");
        }
        else{
            System.out.println(" " + numberOfDollars + " quarter");
        }


        if(numberOfDimes>1) {
            System.out.println(" " + numberOfDimes + " dimes");
        }
        else{
            System.out.println(" " + numberOfDimes + " dime");
        }


        if(numberOfNickels>1) {
            System.out.println(" " + numberOfNickels + " nickels");
        }
        else{
            System.out.println(" " + numberOfNickels + " nickel");
        }


        if(numberOfPennies>1) {
            System.out.println(" " + numberOfPennies + " pennies");
        }
        else{
            System.out.println(" " + numberOfDollars + " pennie");
        }
    }


    }

