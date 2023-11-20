package week_11.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question_11_11 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = getListOfNumbers();
        System.out.println("Before sorting..");
        printList(numbers);
        sort(numbers);
        System.out.println("\nAfter sorting..");
        printList(numbers);


    }
    public static ArrayList<Integer> getListOfNumbers(){
        ArrayList <Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a list of integers ending with 0 :");
        int value;
        do {
            value = input.nextInt();
            if (value != 0){
                list.add(value);
            }
        }while (value !=0 );
        return list;
    }
    public static void printList(ArrayList <Integer> arrayList){
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
    }
    public static void sort(ArrayList<Integer> list) {
        Collections.sort(list);
    }
}
