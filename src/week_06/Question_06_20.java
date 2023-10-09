package week_06;

import java.util.Scanner;

public class Question_06_20 {
    public static void main(String[] args) {
        //Count the lettres in a string
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string,please :");
        String stringIs = input.nextLine();
        countLetters(stringIs);


    }
    public static int countLetters(String stringIs){
        int count = 0;
        for (int i = 0; i < stringIs.length(); i++) {
            if (Character.isLetter(stringIs.charAt(i))){
                count++;
            }
        }
        System.out.print("The number of letters in the string : "+ stringIs + " : " +count);
            return count;
        }

}
