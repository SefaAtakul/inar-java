package week_08;

import java.util.Scanner;

public class Question_08_02 {
    public static void main(String[] args) {
        //Sum of the major diagonal in a matrix
        double [][] matrix = getMatrixFromUser();
        sumMajorDiagonal(matrix);

    }
    public static double [][] getMatrixFromUser(){
        double [][] matrix = new double[4][4];
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a 4-by-4 matrix row by row :");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix [row][column]=input.nextDouble();

            }

        }
        return matrix;
    }
    public static double sumMajorDiagonal(double [][] matrix){
        double sumOfMajorDiagonal = 0 ;
        for (int row = 0, column = 0; row < matrix.length; row++,column++) {
            sumOfMajorDiagonal += matrix[row][column];

        }
        System.out.print("Sum of the elements in the major diagonal : " + sumOfMajorDiagonal);
        return sumOfMajorDiagonal;

    }
}
