package week_08;

import java.util.Scanner;

public class Question_08_25 {
    public static void main(String[] args) {
        //Markov Matrix

        markovMatrix();
    }
    public static void markovMatrix(){
        double [][] matrix = getMatrixFromUser();
        checkTheMatrixWheterIsMarkovOrNot(matrix);
    }
    public static double [][] getMatrixFromUser(){
        double [][] matrix =new double[3][3];
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row : ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column]=input.nextDouble();

            }

        }
        return matrix;
    }
    public static boolean checkTheMatrixWheterIsMarkovOrNot(double [][] matrix){
        for (int column = 0; column < matrix[0].length; column++) {
            double sumOfColumn = 0;
            for (int row = 0; row < matrix.length; row++) {
                if (matrix[row][column] < 0){
                    System.out.println("It is not a Markov!");
                    return false;
                }
                sumOfColumn+=matrix[row][column];

            }
            if (sumOfColumn != 1){
                System.out.println("It is not a Markov!");
                return false;
            }

        }
        System.out.println("It is a Markov matrix!");
        return true;
    }
}
