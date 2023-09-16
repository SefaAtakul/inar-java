package week_05;

import java.util.Scanner;

public class Question_05_34 {
    public static void main(String[] args) {
        //Game : scissor,rock,paper
        Scanner input = new Scanner(System.in);

        int userWins = 0;
        int computerWins = 0;


        while (Math.abs(userWins - computerWins) < 3) {
            int isComputer = (int) ((Math.random() * 3));

            System.out.println("scissor(0) , rock (1) , paper (2) :");
            int isUser = input.nextInt();
            if (isComputer == 0) {
                System.out.println("The computer is scissor");
            } else if (isComputer == 1) {
                System.out.println("The computer is rock");
            } else {
                System.out.println("The computer is paper");
            }
            if (isUser == 0) {
                System.out.println("You are scissor");
            } else if (isUser == 1) {
                System.out.println("You are rock");
            } else {
                System.out.println("You are paper");
            }
            if ((isUser == 0 && isComputer == 2) || (isUser == 1 && isComputer == 0) || (isUser == 2 && isComputer == 1)) {
                System.out.println("You won the game!");
                userWins++;
            } else if (isUser == isComputer) {
                System.out.println("You draw with computer!");

            } else {
                System.out.println("The computer won the game !");
                computerWins++;
            }
            System.out.println();


        }
        System.out.println("Game is finished ! You : " + userWins + " and the computer is : " + computerWins);
    }
}