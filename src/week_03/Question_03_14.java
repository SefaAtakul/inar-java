package week_03;

import java.util.Scanner;

public class Question_03_14 {
    public static void main(String[]args){
        //Game:heads or tails
        Scanner input =new Scanner(System.in);
        System.out.println("Guess the flip of coin (0 represents head and 1 represents tail): ");
        int guess = input.nextInt();

        //Generate a random digit 0 or 1
        int headsOrTail = (int)(Math.random()*1);
        //Compare guess with random digit
        if(headsOrTail==guess){
            System.out.println("Your guess is correct");
        } else System.out.println("Your guess is incorrect");

    }
}
