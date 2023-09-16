package week_05;

import java.util.Scanner;

public class Question_05_37 {
    public static void main(String[] args) {
        //Decimal to binary
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal value :");

        int decimalNumber = input.nextInt();

        int quotient = decimalNumber ;

        String binaryNumber = "";

        String remainder = "";

        while(quotient != 0){
            remainder = Integer.toString(quotient%2);
            quotient = quotient / 2 ;
            binaryNumber =remainder.concat(binaryNumber);
        }
        System.out.printf("The binary value of decimal  %d is: %s ",decimalNumber,binaryNumber );
    }

}
