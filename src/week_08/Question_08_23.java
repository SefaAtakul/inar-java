package week_08;

import java.util.Scanner;

public class Question_08_23 {
    public static void main(String[] args) {
        //Game :find the flipped cell
        playTheFlippedGame();
    }
    public static void playTheFlippedGame(){
        int [][] randomMatrix=getMatrix();
        System.out.println();
        findTheFlippedCell(randomMatrix);
    }
    public static int [][] getMatrix(){
        int [][] matrix =new int[6][6];
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a 6-by-6 matrix row by row :");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column <matrix[row].length ; column++) {
                int number = input.nextInt();
                if (isAvaibleNumber(number)){
                    matrix[row][column]=number;
                }else {
                    column--;
                }

            }

        }

        return matrix;
    }
    public static boolean isAvaibleNumber(int number){
        return number==0 || number == 1 ;
    }
   public static void findTheFlippedCell(int [][] matrix){
        int rowOfUnevenCell = findTheUnevenRow(matrix);
       int columnOfUnevenCell = findTheUnevenColumn(matrix);
       System.out.println("The flipped cell is at ( " + rowOfUnevenCell + " , " + columnOfUnevenCell + " )");

   }
   public static int findTheUnevenRow(int [][] matrix){
        int rowOfUnevenCell = 0;
       for (int row = 0; row < matrix.length; row++) {
           int countOfOne = 0;
           for (int column = 0; column < matrix[row].length; column++) {
               if (matrix[row][column]==1){
                   countOfOne++;
               }
           }
           if (countOfOne % 2 != 0){
               rowOfUnevenCell =row;
               return rowOfUnevenCell;
           }


       }
       return rowOfUnevenCell;
   }
   public static int findTheUnevenColumn(int [][] matrix){
        int columnOfUnevenCell=0;
       for (int column = 0; column < matrix[0].length; column++) {
           int numberOfOnes = 0;
           for (int row = 0; row < matrix.length; row++) {
               if (matrix[row][column]==1){
                   numberOfOnes++;
               }

           }
           if (numberOfOnes % 2 != 0){
               columnOfUnevenCell=column;
               return columnOfUnevenCell;

           }

       }
       return columnOfUnevenCell;
   }
}
/*1 1 1 0 1 1
1 1 1 1 0 0
0 1 0 1 1 1
1 1 1 1 1 1
0 1 1 1 1 0
1 0 0 0 0 1
*/