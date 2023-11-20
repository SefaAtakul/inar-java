package week_11.Test;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_14 {
    public static void main(String[] args) {
        ArrayList <Integer> list1 = getListFromUser(1);
        ArrayList <Integer> list2 = getListFromUser(2);
        ArrayList<Integer> unionList = combineLists(list1,list2);
        print(unionList);
    }
    public static ArrayList <Integer> getListFromUser(int listNum){
        Scanner input =new Scanner(System.in);
        ArrayList <Integer> list1 = new ArrayList<>();
        System.out.println("Enter five list  "+listNum + " :");
        for (int i = 0; i <5; i++) {
            list1.add(input.nextInt());
        }
        return list1;
    }
    public static ArrayList <Integer> combineLists(ArrayList<Integer> list1 ,ArrayList<Integer> list2){
        ArrayList<Integer> combinedList = new ArrayList<>();
        combinedList.addAll(list1);
        combinedList.addAll(list2);
        return combinedList;
    }
    public static void print(ArrayList<Integer> list){
        System.out.println("The combined list is : " + list);
    }
}
