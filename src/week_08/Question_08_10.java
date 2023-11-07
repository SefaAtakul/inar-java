package week_08;

public class Question_08_10 {
    public static void main(String[] args) {
        //Largest row and column
        printTheLargestRowAndColumn();
    }
    public static void printTheLargestRowAndColumn(){
        int [][] randomMatrixWith0And1 = initializeMatrix();
        printRandomMatrix(randomMatrixWith0And1);
        displayTheLargestRowAndColumn(randomMatrixWith0And1);
    }
    public static int [][]initializeMatrix(){
        int [][] randomMatrix = new int[4][4];
        for (int row = 0; row < randomMatrix.length; row++) {
            for (int column = 0; column < randomMatrix[row].length; column++) {
                randomMatrix[row][column]=(int) (Math.random()*2);

            }

        }
        return randomMatrix;
    }
    public static void printRandomMatrix(int [][] randomMatrix){
        for (int row = 0; row < randomMatrix.length; row++) {
            for (int column = 0; column < randomMatrix[row].length; column++) {
                System.out.print(randomMatrix[row][column]);

            }
            System.out.println();

        }
    }
    public static void displayTheLargestRowAndColumn(int [][] randomMatrix){
        //Firs find the largest row with temporary
        int largestRow = 0;
        int largestRowIndex = 0;

        for (int row = 0; row <randomMatrix.length ; row++) {
            int rowIs = 0;
            for (int column = 0; column < randomMatrix[row].length; column++) {
                rowIs += randomMatrix[row][column];

            }
            if (largestRow<rowIs){
                largestRow=rowIs;
                largestRowIndex = row;

            }

        }
        System.out.println("The largest row index = " + largestRowIndex);

        //Next in the same way find the largest column but for loops will change places
        int largestColumn = 0 ;
        int largestColumnIndex = 0 ;
        for (int column = 0; column < randomMatrix[0].length; column++) {//we changed places of loops for to get columns
            int columnIs = 0 ;
            for (int row = 0; row < randomMatrix.length; row++) {
             columnIs += randomMatrix[row][column];

            }
            if (columnIs>largestColumn){
                largestColumn = columnIs;
                largestColumnIndex = column;
            }

        }
        System.out.println("The largest column index = " + largestColumnIndex);
    }
}
