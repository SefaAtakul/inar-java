package week_03;

import java.util.Scanner;

public class Question_03_26 {
    public static void main(String[] args) {
        //Use the && , || and ^
        Scanner input =new Scanner(System.in);
        //Prompt the user Enter an integer
        System.out.println("Enter an integer : ");
        int number = input.nextInt();

        boolean divisibleNumber = ( number%6 ==0) && (number%5==0) ;
        System.out.println("Is "+ number + " divisible 5 and 6 ? " + divisibleNumber );
        boolean deviseOne = (number%6 ==0) || (number%5==0) ;
        System.out.println("Is "+ number + " divisible 5 or 6 ? " + deviseOne );
        boolean noneOf =(number%6 ==0) ^ (number%5==0);
        System.out.println("Is "+ number + " divisible 5 or 6, but not both ? " + noneOf );





        }



    }

