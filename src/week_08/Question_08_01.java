package week_08;

import java.util.Scanner;

public class Question_08_01 {
    public static void main(String[] args) {
        //Sum elements column by column
        double [][] matrix = getArrayFromUser();
        printSumOfColumns(matrix);
    }
    public static double [][] getArrayFromUser(){
        double [][] matrix = new double[3][4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-4 matrix row by row :");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column <matrix[row].length; column++) {
                matrix [row][column] = input.nextDouble();

            }

        }
return matrix;
    }

    public static void printSumOfColumns(double [][] matrix){

        for (int column  = 0; column  < matrix[0].length; column ++) {
            double totalOfColumn = 0;
            for (int row = 0; row < matrix.length; row++) {
                totalOfColumn += matrix [row][column];

            }
            System.out.println("Sum of the elements at column " + column + " is " + totalOfColumn);

        }

    }
}
