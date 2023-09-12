package week_05;

import java.util.Scanner;

public class Question_05_14 {
    public static void main(String[] args) {
        //Compute the greatest common divisor
        Scanner input = new Scanner(System.in);
        int greatestCommonDivisor = 1;

        System.out.print("Enter the first integer :");
        int firstNumberIs =input.nextInt();
        System.out.print("Enter the second integer :");
        int secondNumberIs = input.nextInt();

        if (secondNumberIs>firstNumberIs){
            int temp = firstNumberIs;
            firstNumberIs=secondNumberIs;
            secondNumberIs=temp;
        }

        for (int i =1;i<=secondNumberIs;i++){
            if (firstNumberIs%i==0 && secondNumberIs%i==0){
                greatestCommonDivisor = i ;
            }
        }
        System.out.printf("The greatest common divisor for %d and %d is %d",firstNumberIs,secondNumberIs,greatestCommonDivisor);
    }
}
