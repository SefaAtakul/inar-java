package week_03;

import java.util.Scanner;

public class Question_03_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Game :scissor,rock,paper
        System.out.println("scissor (0) , rock (1) , paper (2) :");
        int computer = (int) (Math.random() * 3);
        int user = input.nextInt();


        System.out.print("The computer is ");
        switch (computer) {
            case 0:
                System.out.print(" scissor");
                break;
            case 1:
                System.out.print(" rock");
                break;
            case 2:
                System.out.print(" paper");
        }
        System.out.print(" You are ");
        switch (user) {
            case 0:
                System.out.print(" scissor");
                break;
            case 1:
                System.out.print(" rock");
                break;
            case 2:
                System.out.print(" paper");
                ;
        }
        //Display result
        if (computer == user) {
            System.out.println(" It is draw");
        } else {
            boolean win = (user == 0 && computer == 2 || user == 1 && computer == 0 || user == 2 && computer == 1);
            if (win) {
                System.out.println(" You won !");
            } else System.out.println(" You lose !");


        }
    }
}
