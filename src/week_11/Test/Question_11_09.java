package week_11.Test;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int sizeOfArray = input.nextInt();
        int [][] array = getArrayFromUser(sizeOfArray);
        printArray(array);
        ArrayList <Integer> largestRow = getLargestRow(array);
        ArrayList<Integer> largestColumn = getLargestColumn(array);
        System.out.println("The largest row index :" + largestRow);
        System.out.println("The largest column index :" + largestColumn);


    }
    public static int [][] getArrayFromUser(int size ){
        int [][] array =new int[size][size];
        for (int row = 0; row <size ; row++) {
            for (int column = 0; column < size; column++) {
               array[row][column]=(int)(Math.random()*2);

            }

        }
        return array;
    }
    public static void printArray(int [][] array){
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array.length; column++) {
                System.out.print(array[row][column] + " ");
            }
            System.out.println();
        }
    }

    public static ArrayList<Integer> getLargestRow(int [][] array){
        ArrayList<Integer> maxIndexesOfRows = new ArrayList<>();
        int maxCountOfRow = 0;
        for (int row= 0; row <array.length  ; row++) {
            int countOfRow = 0;
            for (int column = 0; column < array[row].length; column++) {
                if (array[row][column] == 1){
                    countOfRow++;
                }
            }
            if (countOfRow > maxCountOfRow){
                maxCountOfRow = countOfRow ;
            }
        }
        for (int row = 0; row < array.length; row++) {
            int countOfCurrentRow = 0;
            for (int column = 0; column < array[row].length; column++) {
                if (array[row][column]==1){
                    countOfCurrentRow++;
                }

            }
            if (countOfCurrentRow == maxCountOfRow){
                maxIndexesOfRows.add(row);
            }
        }
return maxIndexesOfRows;
    }
    public static ArrayList<Integer> getLargestColumn(int [][] array ){
        ArrayList <Integer> maxIndexesOfColumn = new ArrayList<>();
        int maxCountOfColumn = 0;
        for (int column = 0; column < array[0].length; column++) {
            int countOfColumn = 0;
            for (int row = 0; row < array.length; row++) {
                if (array[row][column] == 1){
                    countOfColumn++;
                }
            }
            if (countOfColumn > maxCountOfColumn){
                maxCountOfColumn = countOfColumn;
            }
        }
        for (int column = 0; column < array[0].length; column++) {
            int countOfColumn = 0;
            for (int row = 0; row < array.length; row++) {
                if (array[row][column] == 1){
                    countOfColumn++;
                }
            }
            if (countOfColumn == maxCountOfColumn){
                maxIndexesOfColumn.add(column);
            }
        }
return maxIndexesOfColumn;
    }
}
