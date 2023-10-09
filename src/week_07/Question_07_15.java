package week_07;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Question_07_15 {
    public static void main(String[] args) {
        //Eliminate the duplicates
        int [] numbers = new int[10];
        getNumbers (numbers);
        eliminateDuplicates(numbers);


    }
    public static int [] getNumbers(int [] numbers ){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers :");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=input.nextInt();

        }
        return numbers;
    }
    public static int [] eliminateDuplicates(int [] numbers){
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j <numbers.length ; j++) {
                if (numbers[i]==numbers[j]){
                    numbers[j]=0;
                }

                }
            if (numbers[i]!=0){
                System.out.print(numbers[i] + " ");
            }

        }
        return numbers;
    }
}
