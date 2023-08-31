package week_02;

import java.util.Scanner;

public class Question_02_07 {
    public static void main(String[]args){
        //Find the number of years
        System.out.println( " Enter the number of minutes : " ) ;
        Scanner input = new Scanner ( System.in ) ;
        int x = input.nextInt();
        int a = ( x/60/24/365 ) ;
        int b = ( x % ( 60 * 24 * 365 ) ) ;
        int c = ( b / ( 60 * 24  ) ) ;
        System.out.println( x + " minutes is approximately " + a + " years and " + c + " days " ) ;
    }
}
