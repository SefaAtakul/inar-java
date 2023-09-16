package week_05;

import java.util.Scanner;

public class Question_05_51 {
    public static void main(String[] args) {
        //Longest common prefix
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first string : ");
        String firstString = input.nextLine();
        System.out.print("Enter the second string : ");
        String secondString = input.nextLine();
        int length = 0;
        int count = 0 ;
        String prefix = "";

        if (firstString.length()<= secondString.length()) {
            length += firstString.length();
        }else {
            length+=secondString.length();
        }

        for (int i = 0; i < length-1 ; i++) {
            char ch =firstString.charAt(i);
            char ch2 =secondString.charAt(i);
            if (ch == ch2){
                count++;
            }else {
                break;
            }
        }
        prefix =firstString.substring(0,count);
        if (count!= 0){
            System.out.println("The common prefix is " + prefix);
        }else {
            System.out.println(firstString+" and "+secondString+" have no common prefix");
        }

    }
}
