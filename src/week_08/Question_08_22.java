package week_08;

public class Question_08_22 {
    public static void main(String[] args) {
        //Even numbers of 1s
        checkTheEvenNumberOfOnes();

    }
    public static void checkTheEvenNumberOfOnes(){
        int [][] randomMatrix = getTheRandomMatrix();
        printMatrix(randomMatrix);
        checkTheRowsForEvenOnes(randomMatrix);
        checkTheColumnsForEvenOnes(randomMatrix);

    }
    public static int[][]getTheRandomMatrix(){
        int [][] matrix = new int[6][6];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                matrix[row][column]=(int)(Math.random()*2);

            }
        }
        return matrix;
    }
    public static void printMatrix(int [][] matrix){
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column]+" ");

            }
            System.out.println();

        }
    }
    public static boolean checkTheRowsForEvenOnes(int [][] matrix){
        for (int row = 0; row < matrix.length; row++) {
            int numberOfOnes = 0;
            for (int column = 0; column < matrix[row].length; column++) {
                if (matrix[row][column]==1){
                    numberOfOnes++;
                }

            }
            if (numberOfOnes % 2 != 0){
                System.out.println("Every row does not have an even number of 1s");
                return false;
            }

        }
        System.out.println("Every row have an even number of 1s");
        return true;
    }
    public static boolean checkTheColumnsForEvenOnes(int [][] matrix){
        for (int column = 0; column < matrix[0].length; column++) {
            int numberOfOnes = 0;
            for (int row = 0; row < matrix.length; row++) {
                if (matrix[row][column]==1){
                    numberOfOnes++;
                }

            }
            if (numberOfOnes % 2 != 0){
                System.out.println("Every column does not have an even number of 1s");
                return false;
            }

        }
        System.out.println("Every column have an even number of 1s");
        return true;
    }
}
