package week_05;

import java.util.Scanner;

public class Question_05_17 {
    public static void main(String[] args) {
        //Display Pyramid
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the number of line : ");
            int numberOfLines = input.nextInt();




            for (int i = 1; i <= numberOfLines; i++) {

                for (int j = 1; j <= numberOfLines - i; j++) {

                    System.out.print("   ");

                }

                for (int k = i; k >= 1; k--) {

                    System.out.print(" " + k + " ");

                }

                for (int l = 2; l <= i; l++) {

                    System.out.print(" " + l + " ");

                }

                System.out.println();
            }

    }
}
