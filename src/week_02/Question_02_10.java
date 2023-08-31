package week_02;

import java.util.Scanner;

public class Question_02_10 {
    public static void main(String[]args){
        /*Science calculating energy
        Q=energy t1=initial time t2=final time
         */
        Scanner input = new Scanner (System.in);

        System.out.println("Enter the amount of water in kilograms: ");
        System.out.println("Enter initial the  temperature: ");
        System.out.println("Enter the final temperature: ");

        double m =input.nextDouble();
        double t1 =input.nextDouble();
        double t2 =input.nextDouble();

        double Q = m * ( t2 - t1 ) * 4184 ;

        System.out.println("The energy need is " + Q ) ;
    }
}
