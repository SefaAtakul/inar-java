package week_02;

import java.util.Scanner;

public class Question_02_05 {
    public static void main(String[]args){
        //Financial application:calculate tips
        System.out.println("Enter the subtotal and a gravity rate:");

        Scanner input = new Scanner(System.in) ;
        double subtotal = input.nextDouble();
        double gravity = input.nextDouble();

        System.out.println("The gravity is" + gravity + "and total is " + (subtotal+gravity)) ;


    }
}
