package week_07;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_31 {
    public static void main(String[] args) {
        //Merge two sorted lists
        int [] list1 = getLists(1);
        int [] list2 = getLists(2);
        int [] mergedArray = getTheMergedList(list1,list2);
        System.out.print("The merged list is :"+ Arrays.toString(mergedArray));
    }
    public static int [] getLists (int  list){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter list" + list + " : ");
        int sizeOfList = input.nextInt();
        int [] listIs = new int[sizeOfList];
        for (int i = 0; i < listIs.length; i++) {
            listIs[i] = input.nextInt();
        }
        return listIs;
    }
    public static int [] getTheMergedList(int [] list1 , int [] list2){
        int [] newArray = new int[list1.length+list2.length];
        for (int i = 0; i < newArray.length; i++) {
            if (i<list1.length) {
                newArray[i] = list1[i];
            }else {
                newArray[i] = list2[i-list1.length];
            }
        }
        System.out.println("Before merge : " + Arrays.toString(newArray));

        java.util.Arrays.sort(newArray);

        return newArray;
    }
}
