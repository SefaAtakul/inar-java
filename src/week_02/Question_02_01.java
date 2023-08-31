package week_02;

import java.util.Scanner;

public class Question_02_01 {
    public static void main(String[]args){
        //Convert a Celsius to Fahrenheit
        //Create a scanner object
        Scanner input=new Scanner(System.in);
        double celsius=input.nextDouble();

        double Fahrenheit = ( ( 9.0 / 5 ) * celsius + 32) ;

        System.out.println( celsius + " Celsius is " +Fahrenheit + "Fahrenheit" ) ;

    }
}
