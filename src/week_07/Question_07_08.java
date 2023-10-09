package week_07;

import java.util.Scanner;

public class Question_07_08 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter ten values of double type : ");
        double [] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i]=input.nextDouble();

        }
        System.out.println("The average value : " + average(array));

    }
    public static int average(int [] array){
        int sum = 0 ;
        for(int number : array){
            sum+=number;
        }
        int average = sum / array.length;
        return average;
    }
    public static double average(double[] array) {
        double sum = 0;
        for (double number : array) {
            sum += number;
        }
        double average = sum / array.length;
        return average;
    }
}
