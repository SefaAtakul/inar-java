package week_07;

import java.util.Scanner;

public class Question_07_18 {
    public static void main(String[] args) {
        //Bubble Sort
        getNumbersFromUser();

    }
    public static double [] getNumbersFromUser(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers : ");
        double [] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();

        }

        makeTheBubbleSortingToArray(numbers);
        return numbers ;
    }
    public static void makeTheBubbleSortingToArray(double [] numbers){
        double temp = 0 ;
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j <numbers.length-1 ; j++) {
                if (numbers[i]>numbers[j]) {
                    temp = numbers[j];
                    numbers[j] = numbers [i];
                    numbers[i] = temp;

                }

            }

        }
        for (int i = 0; i < numbers.length-1; i++) {
            System.out.print(numbers[i]+ " ");

        }
    }
}
