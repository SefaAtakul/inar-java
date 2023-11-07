package week_08;

public class Question_08_18 {
    public static void main(String[] args) {
        //A time change the place this is not shuffling
        int [][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        shuffleTheArray(m);
    }
    public static void  shuffleTheArray(int [][] array){
        int tempX = 0;
        int tempY = 0;
        for (int row = 0; row <array.length; row++) {
            for (int secondRow = row+1; secondRow < array[0].length; secondRow++) {
                tempX=array[row][0];
                tempY=array[row][1];
                array[row][0]=array[secondRow][0];
                array[row][1]=array[secondRow][1];
                array[secondRow][0]=tempX;
                array[secondRow][1]=tempY;
            }

        }
        printArray(array);
    }
    public static void printArray(int [][] array){
        for (int row = 0; row < array.length; row++) {
            System.out.println(array[row][0]+" "+array[row][1]);

        }
    }
}
