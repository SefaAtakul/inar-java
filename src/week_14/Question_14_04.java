package week_14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question_14_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size 'n' for ArrayList A :");
        int sizeOfA = input.nextInt();
        System.out.print("Enter " + sizeOfA +" Integers for ArrayList A :");
        ArrayList <Integer> listA = new ArrayList<>();
        for (int i = 0; i < sizeOfA; i++) {
            listA.add(input.nextInt());
        }
        Collections.sort(listA);

        System.out.print("Enter the size 'n' for ArrayList B : ");
        int sizeOfB = input.nextInt();
        System.out.print("Enter " + sizeOfB + " Integers for ArrayList B :");
        ArrayList<Integer> listB =new ArrayList<>();
        for (int i = 0; i < sizeOfB; i++) {
            listB.add(input.nextInt());
        }
        Collections.sort(listB);
        Collections.reverse(listB);

        ArrayList<Integer> listC =new ArrayList<>();
        listC.addAll(listA);
        listC.addAll(listB);
        System.out.println("Merged and sorted ArrayList C : \n" + listC);
    }
}
