package week_08;

import java.util.Scanner;

public class Question_08_26 {
    public static void main(String[] args) {
        //Row Sorting
        double [][] sortedMatrix = rowSorting();
        print(sortedMatrix);

    }
    public static double[][] rowSorting(){
        double [][] matrix = getRow();
        sortMatrix(matrix);



        return matrix;
    }
    public static double [][] getRow(){
        double [][] matrix = new double[3][3];
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row :");
        for (int row = 0; row <matrix.length ; row++) {
            for (int column  = 0; column  < matrix[row].length; column ++) {
                matrix[row][column]= input.nextDouble();

            }

        }
        return matrix;
    }
    public static double [][] sortMatrix(double [][] matrix){
        double [] temporaryArray = new double[3];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {

                temporaryArray[column]=matrix[row][column];

            }
            sort(temporaryArray);

            for (int column1 = 0; column1 < matrix[row].length; column1++) {
                matrix[row][column1]=temporaryArray[column1];

            }
        }
        return matrix;
    }
    public static double [] sort(double [] array){
        double temp = 0;
        for (int row = 0; row < array.length; row++) {
            for (int row1 = row+1; row1 < array.length; row1++) {
                if (array[row]>array[row1]){
                    temp=array[row1];
                    array[row1]=array[row];
                    array[row]=temp;

                }

            }

        }
        return array;
    }
    public static void print(double [][] matrix){
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column]+" " );

            }
            System.out.println();
        }
    }
    }

/*0,15 0,875 0,375
0,55 0,005 0,225
0,30 0,12 0,4*/