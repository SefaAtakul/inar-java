package week_02;

import java.util.Scanner;

public class Question_02_09 {
    public static void main(String[]args){
        //Physics accelerations
        System.out.println("Enter v0,v1 and t :");
        Scanner input = new Scanner(System.in);
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();

        //converting
        double a = ( ( v1 - v0 ) / t ) ;
        System.out.println( " The average acceleration is: " +a) ;
    }

}
