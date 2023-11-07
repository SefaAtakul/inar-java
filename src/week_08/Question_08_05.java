package week_08;

import java.util.Scanner;

public class Question_08_05 {
    public static void main(String[] args) {
        //Algebra add two matrices
        double [][] addedMatrix = addTwoMatrix();





    }
    public static double [][] addTwoMatrix() {
        double [][] matrix1  = getMatrix(1);
        double [][] matrix2  = getMatrix(2);
        double [][] sumOfTwoMatrices = addedMatrix(matrix1,matrix2);
        printTheMatrices(sumOfTwoMatrices,matrix1,matrix2);

        return sumOfTwoMatrices;
    }
    public static double [][] getMatrix (double matrix ){
        double [][] matrixIs = new double[3][3];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a matrix ,3*3 for us :");
        for (int row = 0; row < matrixIs.length; row++) {
            for (int column = 0; column < matrixIs[row].length; column++) {
                matrixIs[row][column] = input.nextDouble();

            }

        }
        return  matrixIs;
    }
    public static double [][]addedMatrix(double [][]matrix1,double [][]matrix2){
        double [][] sumOfMatrices = new double[3][3];
        for (int row = 0; row < sumOfMatrices.length; row++) {
            for (int column = 0; column < sumOfMatrices[row].length; column++) {
                sumOfMatrices[row][column]=matrix1[row][column] + matrix2[row][column];

            }

        }
        return sumOfMatrices;
    }
    public static void printTheMatrices(double [][] sumOfMatrices,double [][] matrix1 , double [][] matrix2){
        System.out.println("The matrices are added as follows :");

        for (int row = 0; row < matrix1.length; row++) {
            for (int column = 0; column < matrix1[row].length; column++) {
                System.out.print(matrix1[row][column]+" ");

            }
            if (row == 1) {
                System.out.print("   +   ");
            } else {
                System.out.print("       ");
            }


            for (int column = 0; column < matrix2[row].length; column++) {
                System.out.print(matrix2[row][column]+" ");

            }
            if (row == 1) {
                System.out.print("   =   ");
            } else {
                System.out.print("       ");
            }


            for (int column = 0; column < sumOfMatrices[row].length; column++) {
                System.out.print(sumOfMatrices[row][column]+" ");

            }
            System.out.println();
        }

    }
}
