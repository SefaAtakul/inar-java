package week_07;

import java.util.Scanner;

public class Question_07_27 {
    public static void main(String[] args) {
        //Identical Arrays
        isTheListsAreIdentical();
    }
    public static void isTheListsAreIdentical(){
        int [] list1 = getList(1);
        int [] list2 = getList(2);
        printListsIdenticality(list1,list2);
    }
    public static int [] getList(int listNumber){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter list " + listNumber + " : ");
        int sizeOfList = input.nextInt();
        int [] list = new int[sizeOfList];
        for (int i = 0; i < list.length; i++) {
            list [i] = input.nextInt();

        }
return list;
    }
    public static boolean printListsIdenticality(int[] list1,int [] list2){
        int count1 = 1;
        int count2 = 0;
        if (list1.length != list2.length){
            System.out.print("Two lists are not identical !");
            return false;
        }
        for (int i = 0; i < list1.length; i++) {
            for (int j = 1; j <list1.length ; j++) {
                if (list1[i]==list1[j]){
                    count1++;

            }
            }
            for (int j = 0; j < list2.length; j++) {
                if (list1[i]==list2[j]){
                    count2++;
                }

            }
            if (count1==count2){
                System.out.print("Two lists are  identical !");
                return true;
            }else {
                System.out.print("Two lists are not identical !");
                return false;
            }


        }
        System.out.print("Two lists are identical !");
        return true;

    }
}
