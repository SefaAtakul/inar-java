package week_08;

import java.util.Scanner;

public class Question_08_06 {
    public static void main(String[] args) {
        //Algebra multiply two matrices
    double [][] matrix1 = new double[3][3];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter matrix1 : ");
        for (int row = 0; row  <matrix1.length ; row ++) {
            for (int column = 0; column < matrix1[row].length; column++) {
                matrix1[row][column]= input.nextDouble();
            }

        }
    double [][] matrix2 = new double[3][3];
        System.out.print("Enter matrix2 :");
        for (int row = 0; row < matrix2.length; row++) {
            for (int column = 0; column < matrix2[row].length; column++) {
                matrix2[row][column]=input.nextDouble();

            }
        }

        double [][] multipliedMatrix =  multiplyTwoMatrices(matrix1,matrix2);
        printMatrices(multipliedMatrix,matrix1,matrix2);
    }
    public static double [][] multiplyTwoMatrices(double [][] matrix1,double [][] matrix2){
        double[][] multipliedMatrix = new double[3][3];
        for (int row = 0; row <multipliedMatrix.length ; row++) {
            for (int column = 0; column < multipliedMatrix[row].length; column++) {
                multipliedMatrix[row][column]=multiplicationRowColumn(row,column,matrix1,matrix2);

            }

        }
        return multipliedMatrix;
    }
    public static double multiplicationRowColumn(int row,int column,double[][] matrix1, double[][] matrix2){
        double result = 0;
        for (int i = 0; i < matrix1.length; i++) {
            result+= ( matrix1[row][i]*matrix2[i][column]);

        }
        return result;
    }
    public static void printMatrices(double [][] multipliedMatrix , double [][] matrix1,double [][] matrix2){
        for (int row = 0; row < multipliedMatrix.length; row++) {
            for (int column = 0; column < multipliedMatrix[row].length; column++) {
                System.out.print(matrix1[row][column]+ " ");

            }

            if (row == 1){
                System.out.print("  *  ");
            }else {
                System.out.print("     ");
            }

            for (int column = 0; column < multipliedMatrix[row].length; column++) {
                System.out.print(matrix2[row][column]+ " ");

            }

            if (row == 1){
                System.out.print("  =  ");
            }else {
                System.out.print("     ");
            }

            for (int column = 0; column < multipliedMatrix[row].length; column++) {
                System.out.printf("%2.1f%s",multipliedMatrix[row][column]," ");

            }
            System.out.println();
        }
    }
}
