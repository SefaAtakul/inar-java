package week_02;

import java.util.Scanner;

public class Question_02_03 {
    public static void main(String[]args) {
        System.out.println ( " Enter a value for feet: " ) ;
        Scanner input = new Scanner (System.in) ;
        //Convert feet into meters
        double feet = input.nextDouble() ;
        double meter = (feet * 305)/1000 ;
        System.out.println( feet + " feet is " + meter + "meters " );

    }
}
