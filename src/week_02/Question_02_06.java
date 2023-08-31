package week_02;

import java.util.Scanner;

public class Question_02_06 {
    public static void main(String[]args){
        //Sum the digits in an integer
        System.out.println( " Enter a number between 0 to 1000: " ) ;
        //İnput a number
        Scanner input=new Scanner(System.in) ;
        int x = input.nextInt() ;
        int a = ( x % 10 ) ;
        int b = ( x / 10 ) ;
        int c = ( b % 10 ) ;
        int d = ( b / 10 ) ;

        System.out.println(" The sum of digits is " + ( a+c+d ) ) ;

    }
}
