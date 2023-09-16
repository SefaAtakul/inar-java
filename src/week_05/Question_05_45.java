package week_05;

import java.util.Scanner;

public class Question_05_45 {
    public static void main(String[] args) {
        //Statics : compute mean and standard deviation
        Scanner input = new Scanner(System.in);

        double number = 0.0;
        double sumOfNumbers = 0;
        double squareOfSumOfNumbers = 0 ;
        int count  = 0;
        System.out.print("Enter ten numbers : ");
        do {
            number= input.nextDouble();
            sumOfNumbers+=number;
            squareOfSumOfNumbers+=Math.pow(number,2);
            count++;

        }while (count < 10);

        double mean = sumOfNumbers / count ;

        double standardDeviation = (squareOfSumOfNumbers-(Math.pow(sumOfNumbers,2)/count))/count-1;

        System.out.printf(" The mean is %.2f \nThe standard deviation is %.5f",mean,standardDeviation);


    }
}
