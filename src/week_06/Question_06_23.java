package week_06;

import java.util.Scanner;

public class Question_06_23 {
    public static void main(String[] args) {
        //Occurrences of a specified character
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string,please :");
        String isString = input.nextLine();
        System.out.print("Enter a character that you want to count : ");
        char willBeCountIs = input.next().charAt(0);
        charCount(isString,willBeCountIs);


    }
    public static int charCount(String isString,char willBeCount){
        int count = 0 ;
        for (int i = 0; i < isString.length(); i++) {
            if (isString.charAt(i)==willBeCount){
                count++;
            }

        }
        System.out.println(count);
        return count;
    }
}
