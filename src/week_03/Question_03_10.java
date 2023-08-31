package week_03;

import java.util.Scanner;

public class Question_03_10 {
    public static void main(String[]args){
        //Game:addition quiz
        Scanner input = new Scanner(System.in);
        //Generate random 2 digit less than 100
        int number1 =(int) (Math.random() * 98 ) + 1;
        int number2 = (int) (Math.random() * 98) + 1;
        int total = number2 + number1 ;
        System.out.println("What is " + number1 + "+ " + number2);
        int guess = input.nextInt();

        if (total == guess){
            System.out.println("You are correct !");
        }else {
            System.out.println("You are Wrong! " +number1 + " + " + number2 + " should be " + total );
        }


    }
}
