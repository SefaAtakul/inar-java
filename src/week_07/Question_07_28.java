package week_07;

import java.util.Scanner;

public class Question_07_28 {
    public static void main(String[] args) {
        //Math:Combinations
        int[] integers = getIntegersFromUser();
        displayTheCombinationOfIntegers(integers);
    }

    public static int[] getIntegersFromUser() {
        Scanner input = new Scanner(System.in);
        int[] integers = new int[10];
        System.out.print("Enter ten numbers : ");
        for (int i = 0; i < integers.length; i++) {
            integers[i] = input.nextInt();

        }
        return integers;
    }

    public static void displayTheCombinationOfIntegers(int[] integers) {
        for (int i = 0; i < integers.length; i++) {
            for (int j = 1; j < integers.length; j++) {
                if (i != j) {
                    System.out.println(integers[i] + " " + integers[j]);

                }

            }
        }
    }
}