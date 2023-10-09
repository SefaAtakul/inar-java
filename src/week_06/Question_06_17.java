package week_06;

import java.util.Scanner;

public class Question_06_17 {
    public static void main(String[] args) {
        //Display matrix of 0s and 1s
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n :");
        int nOfMatrix = input.nextInt();

        printMatrix(nOfMatrix);

    }
    public static void printMatrix(int nOfMatrix){

        int count = 0 ;

        for (int i = 1; i <= nOfMatrix ; i++) {
            for (int j = 1; j <=nOfMatrix ; j++) {
                count = (int) (Math.random() * 2);
                System.out.print(count+" ");
            }
            System.out.println();

            }

        }

    }

