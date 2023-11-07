package week_08;

import java.util.Scanner;

public class Question_08_14 {
    public static void main(String[] args) {
        //Explore matrix
        int[][] matrixIs = getMatrixFromUSer();
        displayTheRandomMatrix(matrixIs);
        checkRowColumnAndDiagonalsForSameNumbers(matrixIs);
    }

    public static int[][] getMatrixFromUSer() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of square matrix : ");
        int lengthOfMatrix = input.nextInt();
        int[][] matrix = new int[lengthOfMatrix][lengthOfMatrix];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 2);

            }

        }
        return matrix;
    }

    public static void displayTheRandomMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column]);

            }
            System.out.println();

        }
    }

    public static void checkRowColumnAndDiagonalsForSameNumbers(int[][] matrix) {
        checkTheRows(matrix);
        checkTeColumns(matrix);
        checkTheMajorDiagonalToRight(matrix);
        checkTheMajorDiagonalToLeft(matrix);
        checkTheSubDiagonalsToRight(matrix);
    }

    public static void checkTheRows(int[][] matrix) {
        int countOfRowsNotIncludeSameNumbers = 0;

        for (int row = 0; row < matrix.length; row++) {
            int check0 = 0;
            int check1 = 0;
            for (int column = 0; column < matrix[row].length; column++) {
                if (matrix[row][column] == 0) {
                    check0++;
                } else {
                    check1++;
                }


            }
            if (check0 == matrix.length) {
                System.out.println("All 0s on row " + row);
            } else if (check1 == matrix.length) {
                System.out.println("All 1s on row " + row);
            } else {
                countOfRowsNotIncludeSameNumbers++;
            }

        }
        if (countOfRowsNotIncludeSameNumbers == matrix.length) {
            System.out.println("No same numbers on a row");
        }
    }

    public static void checkTeColumns(int[][] matrix) {
        int countOfColumnsNotIncludeSameNumbers = 0;

        for (int column = 0; column < matrix[0].length; column++) {
            int check0 = 0;
            int check1 = 0;
            for (int row = 0; row < matrix.length; row++) {
                if (matrix[row][column] == 0) {
                    check0++;
                } else if (matrix[row][column] == 1) {
                    check1++;
                }
            }
                if (check0 == matrix.length) {
                    System.out.println("All 0s on column " + column);
                } else if (check1 == matrix.length) {
                    System.out.println("All 1s on column " + column);
                } else {
                    countOfColumnsNotIncludeSameNumbers++;
                }



        }
        if (countOfColumnsNotIncludeSameNumbers == matrix.length) {
            System.out.println("No same numbers on a column");
        }

    }
        public static void checkTheMajorDiagonalToRight ( int[][] matrix){
            int check0 = 0;
            int check1 = 0;
            for (int row = 0, column = 0; row < matrix.length; row++, column++) {
                if (matrix[row][column] == 0) {
                    check0++;
                } else {
                    check1++;
                }

            }
            if (check0 == matrix.length) {
                System.out.println("All 0s on major diagonal ,left to right");
            } else if (check1 == matrix.length) {
                System.out.println("All 1s on major diagonal,left to right ");
            } else {
                System.out.println("No same numbers on major diagonal,left to right!");
            }


        }
        public static void checkTheMajorDiagonalToLeft ( int[][] matrix){
            int check0 = 0;
            int check1 = 0;
            for (int row = matrix.length - 1, column = matrix.length - 1; row > 0; row--, column--) {
                if (matrix[row][column] == 0) {
                    check0++;
                } else {
                    check1++;
                }

            }
            if (check0 == matrix.length) {
                System.out.println("All 0s on major diagonal,right to left ");
            } else if (check1 == matrix.length) {
                System.out.println("All 1s on major diagonal,right to left ");
            } else {
                System.out.println("No same numbers on major diagonal,right to left!");
            }

        }
        public static void checkTheSubDiagonalsToRight ( int[][] matrix){
            int check0 = 0;
            int check1 = 0;
            for (int row = 0, column = 1; row < matrix.length - 1; row++, column++) {
                if (matrix[row][column] == 0) {
                    check0++;
                } else {
                    check1++;
                }

            }
            if (check0 == matrix.length - 1) {
                System.out.println("All 0s on the sub diagonal");
            } else if (check1 == matrix.length - 1) {
                System.out.println("All 1s on the sub diagonal");

            } else {
                System.out.println("No same numbers on the sub diagonal");
            }


        }
    }

