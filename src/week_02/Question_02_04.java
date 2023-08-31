package week_02;

import java.util.Scanner;

public class Question_02_04 {
    public static void main(String[]args) {
        System.out.println( "Enter a number in pounds : ") ;
        //Convert pounds in kilograms
        Scanner input = new Scanner (System.in) ;
        double pounds = input.nextDouble();
        double kilograms = ( pounds * 454 ) / 1000 ;
        System.out.println( pounds +  " pounds is " + kilograms + " kilograms. " );


    }
}
