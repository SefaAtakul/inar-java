package week_04;

import java.util.Scanner;

public class Question_04_20 {
    public static void main(String[] args) {
        //Process a string
        Scanner input = new Scanner(System.in);
        //Prompt the user "Enter a string"
        System.out.println("Enter a string :");
        String string = input.nextLine();

        System.out.printf("Length of the string : %d \n",string.length());
        System.out.printf("First character of the string : %c ",string.charAt(0));
    }
}
