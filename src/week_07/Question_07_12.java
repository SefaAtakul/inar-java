package week_07;

import java.util.Scanner;

public class Question_07_12 {
    public static void main(String[] args) {
        //Reverse an array without copying
        int [] numbers = new int[10];
        getNumbers(numbers);
        reviseTheNumbers(numbers);
        printRevisedNumbers(numbers);

    }
    public static int [] getNumbers(int [] numbers){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers :");
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i]=input.nextInt() ;

        }
        return numbers;
    }
    public static int [] reviseTheNumbers(int [] numbers){
        int temp = 0 ;
        for (int i = 0,j=numbers.length-1; i < numbers.length; i++,j--) {
            if (i >= j) {//The important point for stop loop
                break;
            }

               temp = numbers[j];
               numbers[j]=numbers[i];
               numbers[i]=temp ;



        }
        return numbers ;
    }
    public static void printRevisedNumbers(int [] numbers){
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");

        }
    }
}
