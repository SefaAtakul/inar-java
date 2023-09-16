package week_05;

import java.util.Scanner;

public class Question_05_46 {
    public static void main(String[] args) {
        //Reverse a string
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String stringToReverse = input.nextLine();
        String reverse = "";


        int loopReputation =stringToReverse.length();
        for (int i = loopReputation-1; i >=0 ; i--) {
            char abc  = stringToReverse.charAt(i);
            reverse += String.valueOf(abc);

        }
        System.out.printf("The reversed string is : %s",reverse);

    }
}
