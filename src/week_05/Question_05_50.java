package week_05;

import java.util.Scanner;

public class Question_05_50 {
    public static void main(String[] args) {
        //count uppercase letters for us please
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string,please : ");
        String stringUpperCaseLook = input.nextLine();
        int upperCaseCount = 0 ;



        for (int i = 0; i <=stringUpperCaseLook.length()-1 ; i++) {
            char ch = stringUpperCaseLook.charAt(i);
            int number = ch ;
            if (Character.isLetter(ch)) {
                if (65 <= number && number <= 90) {
                    upperCaseCount++;
                }
            }

        }

        System.out.print("The number of uppercase is : " + upperCaseCount );

    }
}
