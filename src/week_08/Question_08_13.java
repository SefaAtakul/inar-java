package week_08;

import java.util.Scanner;

public class Question_08_13 {
    public static void main(String[] args) {
        //Locate the largest element
       int [] largestElement = locateLargest();
        System.out.println("The location of the largest element is at ( "+largestElement[0]+" , "+ largestElement[1]+ " )");

    }
    public static int[] locateLargest(){
        double [][] arrayIs = getArrayFromUser();
        double largestElement = 0;
        int [] largestElementIs = new int[2];
        int largestRowIndex = 0 ;
        int largestColumnIndex = 0;
        for (int row = 0; row < arrayIs.length; row++) {
            for (int column  = 0; column  < arrayIs[row].length; column ++) {
                if (largestElement<arrayIs[row][column]){
                    largestElement=arrayIs[row][column];
                    largestElementIs[0]=row;
                    largestElementIs[1]=column;

                }

            }

        }
        return largestElementIs ;

    }
    public static double [][] getArrayFromUser(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of the array : ");
        int rowIs =input.nextInt();
        int columnIs = input.nextInt();
        System.out.println("Enter the array : ");
        double [][] arrayIs = new double[rowIs][columnIs];
        for (int row = 0; row < arrayIs.length; row++) {
            for (int column = 0; column < arrayIs[row].length; column++) {
                arrayIs[row][column]=input.nextDouble();

            }

        }
        return arrayIs;
    }
}

