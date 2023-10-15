package week_07;

import java.util.Scanner;

public class Question_07_26 {
    public static void main(String[] args) {
        //StrictlyIdenticalArrays
      equalityOfLists();
    }
    public static void equalityOfLists(){
        int [] list1 =getList(1);
        int [] list2 =getList(2);
        printEquality(list1,list2);
    }
    public static int [] getList (int  listNumber){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list " + listNumber + ":");
        int sizeOfList =input.nextInt();
        int [] list = new int[sizeOfList];
        for (int i = 0; i < list.length; i++) {
            list[i]=input.nextInt();

        }
        return list;
    }
    public static boolean printEquality (int [] list1 ,int [] list2){
        if (list1.length != list2.length) {
           System.out.print("Two lists are not strictly identical");
            return false;
        } else {
            for (int i = 0; i < list1.length; i++) {
                if (list1[i] != list2[i]) {
                    System.out.print("Two lists are not strictly identical");
                    return false;
                }
            }
        }
        System.out.print("Two lists are strictly identical");
        return true;

    }

    }

