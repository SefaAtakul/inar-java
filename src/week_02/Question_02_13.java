package week_02;

import java.util.Scanner;

public class Question_02_13 {
    public static void main(String[]args){

        //Financial application;:compound value
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the monthly saving amount : ");

        double savingAmount=input.nextDouble();
        double interestRate=(1.0+0.00417);

        // After the first month, the value in the account becomes
        double firstMonth= ( savingAmount * interestRate ) ;

        //After the second month, the value in the account becomes
        double secondMonth= ( savingAmount + firstMonth ) * interestRate ;

        //After the third month, the value in the account becomes
        double thirdMonth= ( savingAmount + secondMonth ) * interestRate ;

        //After the fourth month, the value in the account becomes
        double fourthMonth= ( savingAmount + thirdMonth ) * interestRate ;

        //After the fifth month, the value in the account becomes
        double fifthMonth= ( savingAmount + fourthMonth ) * interestRate ;

        //After the sixth month, the value in the account becomes
        double sixthMonth= ( savingAmount + fifthMonth ) * interestRate ;



        System.out.println("After the sixth month,the account value is " +((int)(sixthMonth*100))/100 );

    }
}
