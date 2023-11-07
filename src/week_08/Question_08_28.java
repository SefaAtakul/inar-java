package week_08;

import java.util.Scanner;

public class Question_08_28 {
    public static void main(String[] args) {
        //Strictly identical arrays
        isTheArraysIdentical();
    }
    public static void isTheArraysIdentical(){
       int [][] array1 =getTheArray();
       int [][] array2 =getTheArray2();
       isIdenticalArrays(array1,array2);

    }
    public static int [][] getTheArray(){
        int [][] array = new int [3][3];
        Scanner input =new Scanner(System.in);
        System.out.print("Enter list one :");
        for (int row = 0; row <array.length ; row++) {
            for (int column = 0; column < array[row].length; column++) {
                array[row][column]=input.nextInt();

            }

        }
        return array;
    }
    public static int [][] getTheArray2(){
        int [][] array = new int [3][3];
        Scanner input =new Scanner(System.in);
        System.out.print("Enter list two :");
        for (int row = 0; row <array.length ; row++) {
            for (int column = 0; column < array[row].length; column++) {
                array[row][column]=input.nextInt();

            }

        }
        return array;
    }
    public static boolean isIdenticalArrays(int [][] array1,int [][] array2){
        if (array1.length==array2.length){
            for (int row = 0; row < array1.length; row++) {
                for (int column = 0; column < array1[row].length; column++) {
                    if (array1[row][column]==array2[row][column]){
                        continue;
                    }else {
                        System.out.println("The two arrays are not strictly identical!");
                        return false;
                    }

                }

            }
        }else {
            System.out.println("The two arrays are not strictly identical!");
            return false;
        }
        System.out.println("The two arrays are  strictly identical!");
        return true;
    }
}
