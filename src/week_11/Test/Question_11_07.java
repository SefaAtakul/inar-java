package week_11.Test;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_07 {
    public static void main(String[] args) {

        ArrayList<Integer> integers = getListFromUser();
        System.out.print("Before revolution of Shuffle : ");
        print(integers);
        System.out.print("\nAfter revolution of Shuffle  :");
        shuffle(integers);
        print(integers);

    }
    public static ArrayList<Integer> getListFromUser(){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter a list of integers that ends with zero (0) : ");
        int value;
        do {
            value = input.nextInt();
            if (value != 0){
                list.add(value);
            }
        }while (value != 0);
        return list;
    }
    public static void print(ArrayList<Integer> integers){
        for (Integer integer: integers
             ) {
            System.out.print(integer + " ");
            
        }
    }
    public static void shuffle(ArrayList<Integer> integers){
        java.util.Collections.shuffle(integers);
    }
}
