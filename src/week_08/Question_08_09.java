package week_08;

import java.util.Scanner;

public class Question_08_09 {
    public static void main(String[] args) {
        //Game : play a tic-tac-toe game
        playTheGame();
    }
    public static void playTheGame(){
        char  [][] matrixOfXAndO = new char[3][3];
        Scanner input =new Scanner(System.in);
        displayMatrix(matrixOfXAndO);
        System.out.print("Enter a row (0,1 or 2) for player X :");
        int row =input.nextInt();
        System.out.print("Enter a column (0,1 or 2) for player X :");
        int column = input.nextInt();


    }
    public static void displayMatrix(char [][] matrix){

        for (int row = 0; row < matrix.length; row++) {
            System.out.println("-----------------");
            for (int column = 0; column < matrix[row].length; column++) {

                System.out.printf("%s%s","|","    ");

            }
            System.out.print("|");
            System.out.println();


        }
        System.out.print("-----------------\n");
    }
}
