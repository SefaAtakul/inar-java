package week_11.Test;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_13 {
    public static void main(String[] args) {
        ArrayList <Integer> integers = getIntegers();
        print(integers);
        removeDuplicates(integers);
        System.out.println("\n"+integers.toString());
    }
    public static ArrayList <Integer> getIntegers(){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.print("Enter ten integers : ");
        int value = 0 ;
        do {
            int number = input.nextInt();
            arrayList.add(number);
           value++;
        }while (value != 10);
        return arrayList;
    }
    public static void print (ArrayList<Integer> arrayList){
        for (int a = 0; a < arrayList.size(); a++) {
            System.out.print(arrayList.get(a) + " ");

        }
    }
    public static void removeDuplicates(ArrayList<Integer> arrayList){
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = i+1; j <arrayList.size() ; j++) {
                if (arrayList.get(i).equals(arrayList.get(j))){
                    arrayList.remove(j);
                }
            }
        }
    }
}
