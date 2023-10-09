package week_07;

import java.util.Scanner;

public class Question_07_11 {
    public static void main(String[] args) {
        //Statics:compute deviation
        double [] numbers = getNumbers();
        double deviationOfNumbers = deviation(numbers);
        double meanOfNumbers = mean(numbers);

        System.out.printf("The mean is %.2f",meanOfNumbers);
        System.out.printf("\nThe standard deviation is %.5f",deviationOfNumbers);

    }
    public static double [] getNumbers(){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter ten numbers : ");
        double [] numbers = new  double[10];
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i]= input.nextDouble();

        }
        return numbers ;
    }
    public static double mean (double [] numbers){
        double sumOfNum = 0 ;
        for (int i = 0; i < numbers.length; i++) {
            sumOfNum+=numbers[i];

        }
        return sumOfNum/numbers.length;
    }

    public static double deviation (double [] numbers ){
        double mean = mean(numbers);
        double sum = 0 ;
        for (double number : numbers) {
            sum+=Math.pow((number-mean),2);

        }
        return Math.sqrt(sum/(numbers.length-1));
    }
}

