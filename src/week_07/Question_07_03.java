package week_07;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Question_07_03 {
    public static void main(String[] args) {
        //Occurrence of Integers
        int[] getIntegers = new int[101];
        getIntegersFromUSer(getIntegers);

    }

    public static void getIntegersFromUSer(int[] getIntegers) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integers between 1 and 100 : ");
        for (int i = 0; i < getIntegers.length; i++) {
            int number = input.nextInt();
            getIntegers[number]++;
            if (number == 0) {
                break;
            }
        }
        for (int i = 1; i < getIntegers.length; i++) {
            if (getIntegers[i] != 0) {
                if (getIntegers[i] == 1) {
                    System.out.println(i + " Occurs " + getIntegers[i] + " time");
                } else {
                    System.out.println(i + " Occurs " + getIntegers[i] + " times");
                }

            }

        }
    }
}
