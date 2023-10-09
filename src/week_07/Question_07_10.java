package week_07;

import java.util.Scanner;

public class Question_07_10 {
    public static void main(String[] args) {
        //Find the index of smallest element
        double [] numbers = new  double[10];
        getIntegersFromUser(numbers);
        findTheSmallestIndex(numbers);
    }
    public static double [] getIntegersFromUser(double [] numbers){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten number : ");

        for (int i = 0; i < numbers.length ; i++) {
         numbers [i] = input.nextDouble();

        }
        return numbers;
    }
    public static double findTheSmallestIndex (double [] numbers){
        double minElement = numbers[0];
        int index = 0 ;
        for (int i = 0; i < numbers.length; i++) {
            if (minElement > numbers[i]){
                minElement = numbers[i] ;
                index = i ;

            }
        }
        System.out.println("The minimum number is " + minElement + " index " + index);
        return minElement;
    }
}
