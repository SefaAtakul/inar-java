package week_07;

import java.util.Scanner;

public class Question_07_02 {
    public static void main(String[] args) {
        int [] integers = getIntegers();
        int [] reversedIntegers = reverseIntegers(integers);
        displayTheList(reversedIntegers);

        }
        public static int [] getIntegers(){
        Scanner input = new Scanner(System.in);
            System.out.print("Enter 10 integers : ");
            int [] integers =new int[10];

            for (int i = 0; i < integers.length; i++) {
                integers[i] = input.nextInt();
            }
            return  integers;
        }

        public static int [] reverseIntegers(int [] list){
        int [] reversedIntegers =new int[list.length];

            for (int i = 0,j=list.length-1; i <list.length ; i++,j--) {
                reversedIntegers[i] = list[j];
            }
            return reversedIntegers;
        }

        public static void displayTheList(int [] list){
            for (int i = 0; i < list.length; i++) {
                System.out.print(list[i] + " ");
            }

        }


}
