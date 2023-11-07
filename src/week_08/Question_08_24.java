package week_08;

import java.util.Scanner;

public class Question_08_24 {
    public static void main(String[] args) {
        //Sudoku
        /*
6 3 1 7 4 3 5 8 4
1 7 8 3 7 5 6 4 9
2 5 4 6 8 9 7 3 1
8 2 1 4 3 7 5 9 6
4 9 6 8 5 2 3 1 7
7 3 5 6 6 1 8 2 4
5 8 9 7 1 3 4 6 2
3 1 7 2 4 6 9 8 5
6 4 2 5 9 8 1 3 2
*/
        sudokuGame();
    }
    public static void sudokuGame(){
        int [][] sudoku =getSudoku();
        checkEveryCellWhether1to9(sudoku);
        checkEveryRow(sudoku);
        checkEveyColumn(sudoku);
        checkTheBoxes(sudoku);
    }
    public static int [][] getSudoku(){
        int [][] matrix = new int[9][9];
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a sudoku puzzle solution :");

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column]=input.nextInt();
            }

        }
        return matrix;
    }
    public static boolean checkEveryCellWhether1to9(int [][] matrix){
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (matrix[row][column]<1 || matrix[row][column]>9){
                    System.out.println("Invalid solution!");
                    return false;
                }

            }

        }
        return true;
    }
    public static boolean checkEveryRow(int [][] matrix ){
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                for (int secondColumn = column+1 ; secondColumn <matrix[row].length ; secondColumn++) {

                        if (matrix[row][column]==matrix[row][secondColumn]){
                            System.out.println("Invalid Input!");
                            return false;
                    }
                }
            }
        }
        return true;
    }
    public static boolean checkEveyColumn(int [][] matrix){
        for (int column = 0; column < matrix[0].length; column++) {
            for (int row = 0; row < matrix.length; row++) {
                for (int secondRow = row+1; secondRow <matrix.length ; secondRow++) {

                    if (matrix[row][column]==matrix[secondRow][column]){
                        System.out.println("Invalid Input!");
                        return false;
                    }

                }

            }

        }
        return true;
    }
    public static boolean checkTheBoxes(int [][] matrix){
        for (int row = 0; row <matrix.length ; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (!isValid(row,column,matrix)){
                    return false;
                }

            }
            
        }
        return true;
    }
    public static boolean isValid(int row ,int column , int [][] matrix){
        for (int row1 = (row/3)*3; row1 < (row/3)*3+3; row1++) {
            for (int column1 = (column/3)*3; column1 < (column/3)*3+3; column1++) {
                if (row1!=row && column1!=column && matrix[row][column] == matrix[row1][column1]){
                    return false;
                }

            }

        }
        return true;
    }

}
