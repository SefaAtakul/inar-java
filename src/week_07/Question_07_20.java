package week_07;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_20 {
    public static void main(String[] args) {
        //Revise selection sort
        double [] numbers = getNumbersFromUser();
        reviseSortingOfNumbers(numbers);

    }
    public static double []getNumbersFromUser(){
        Scanner input =new Scanner(System.in);
        double [] numbers  = new double[10];
        System.out.println("Enter ten numbers :");
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i]=input.nextDouble();

        }

        return numbers;
    }
    public static void reviseSortingOfNumbers(double [] numbers){
        for (int i = numbers.length-1; i >= 0 ; i--) {
            //Find the max in the list
            double currentMax =numbers[i];
            int currentMaxIndex = i ;
            for (int j = i-1; j >= 0  ; j--) {
                if (currentMax<numbers[j]){
                    currentMax = numbers[j];
                    currentMaxIndex = j ;
                }

            }
            //Swap numbers[i] with numbers [currentMaxIndex] ıf necessary
            if (currentMaxIndex!=i){
                numbers[currentMaxIndex]=numbers[i];
                numbers[i]=currentMax;
            }

        }
        for (double number : numbers) {
            System.out.print(number + " ");
        }


    }
}
