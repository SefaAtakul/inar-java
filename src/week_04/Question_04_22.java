package week_04;

import java.util.Scanner;

public class Question_04_22 {
    public static void main(String[] args) {
        //Check substring!!!
        Scanner input = new Scanner(System.in);
        //Take two string from the user
        System.out.println("Enter string s1 :");
        String firstString = input.next();
        System.out.println("Enter string s2 :");
        String secondString = input.next();

        if (firstString.contains(secondString) == true) {
            System.out.println(secondString + " is a substring of " + firstString);
        } else {
            System.out.println(secondString + " is not  substring of " + firstString);
        }
    }
}