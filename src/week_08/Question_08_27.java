package week_08;

import java.util.Scanner;

public class Question_08_27 {
    public static void main(String[] args) {
        //Column Sorting
        columnSorting();
    }
    public static void columnSorting(){
        double [][] matrix = getMatrix();
        sortColumns(matrix);
        print(matrix);
    }
    public static double [][] getMatrix(){
        double [][] matrix = new double[3][3];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row : ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column]= input.nextDouble();

            }

        }
        return matrix;

    }
    public static double [][] sortColumns(double [][] matrix ){
        double [] temporaryColumn = new double[3];

        for (int column  = 0; column  < matrix[0].length; column ++) {
            for (int row = 0; row < matrix.length; row++) {
                temporaryColumn[row]=matrix[row][column];

            }
            sort(temporaryColumn);


            for (int row = 0; row < matrix.length; row++) {
                matrix[row][column]=temporaryColumn[row];

            }

        }
        return matrix;
    }
    public static double [] sort(double [] matrix){
        double temporary = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int secondRow = row+1; secondRow < matrix.length; secondRow++) {
                if (matrix[row]>matrix[secondRow]){
                    temporary=matrix[row];
                    matrix[row]=matrix[secondRow];
                    matrix[secondRow]=temporary;
                }

            }

        }
        return matrix;

    }
    public static void print(double [][] matrix){
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();

        }
    }
}
