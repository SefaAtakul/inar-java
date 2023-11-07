package week_08;

public class Question_08_18_1 {
    public static void main(String[] args) {
        //Random Shuffle
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        shuffle(m);
    }
    public static void shuffle(int [][] array){
        for (int row = 0; row < array.length; row++) {
            int randomIndex = (int)(Math.random()* array.length);
            int [] temp = array[row];
            array[row]=array[randomIndex];
            array[randomIndex]=temp;

        }
        printArray(array);
    }
    public static void printArray(int [][] array){
        for (int row = 0; row <array.length ; row++) {
            System.out.println(array[row][0]+" "+array[row][1]);

        }
    }
}
