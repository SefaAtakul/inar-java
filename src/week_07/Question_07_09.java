package week_07;

import java.util.Scanner;

public class Question_07_09 {
    public static void main(String[] args) {
        //Find the smallest element
        double [] integers = new double[10];
        getIntegers(integers);
        findTheSmallestInt(integers);
    }
    public static double [] getIntegers(double [] integers ) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers : ");
        for (int i = 0; i < integers.length; i++) {
            integers[i] = input.nextDouble();


        }
        return integers ;
    }
    public static double findTheSmallestInt(double [] integers){
        double smallestInt = integers[0];
        for (int i = 0; i < integers.length; i++) {
            if (smallestInt>integers[i]){
                smallestInt = integers[i] ;
            }

        }
        System.out.println("The minimum number is : " + smallestInt);
        return smallestInt;
    }
}
