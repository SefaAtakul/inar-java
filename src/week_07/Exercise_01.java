package week_07;

import java.util.Scanner;

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items : ");
        int numbersOfValues = input.nextInt();
        //we need to create an array numberOfValues.length size
        double[] numbers =new double[numbersOfValues];
        double sum = 0 ;

        System.out.print("Enter the numbers = ");
        for (int i = 0; i < numbersOfValues; i++) {
            numbers[i] = input.nextDouble();
            sum+=numbers[i];
        }
        double average = sum /numbersOfValues;
        int count = 0 ;
        for (int i = 0; i < numbersOfValues; i++) {
            if (numbers[i]>average){
                count++;
            }
        }
        System.out.println("Average is " + average);
        System.out.println("Number Of the elements above the average is = " + count);
    }
}
