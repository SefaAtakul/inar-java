package week_02;


import java.util.Scanner;

public class Question_02_22 {
    public static void main(String[]args){
        //Financial application :monetary units
        Scanner input = new Scanner(System.in) ;
        System.out.println("Enter the amount of money : ") ;

        double amount = input.nextDouble() ;

        int remainingAmount = (int) ( amount * 100 ) ;

        int numberOfDollars = remainingAmount / 100 ;
        remainingAmount = remainingAmount % 100 ;

        int numbersOfQuarters = remainingAmount / 25 ;
        remainingAmount = remainingAmount % 25 ;

        int numberOfDimes = remainingAmount / 10 ;
        remainingAmount = remainingAmount % 10 ;

        int numberOfNickels = remainingAmount / 5 ;
        remainingAmount = remainingAmount % 5 ;

        int numberOfPennies = remainingAmount ;

        System.out.println("Your amount is consist of  " ) ;
        System.out.println((numberOfDollars + " dollars") ) ;
        System.out.println(numbersOfQuarters + " quarters " ) ;
        System.out.println(numberOfDimes + " dimes " ) ;
        System.out.println(numberOfNickels + " nickels " ) ;
        System.out.println(numberOfPennies + "pennies");




    }
}
