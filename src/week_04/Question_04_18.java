package week_04;

import java.util.Scanner;

public class Question_04_18 {
    public static void main(String[] args) {
        //Student major and status
        Scanner input = new Scanner(System.in);
        //Prompt the user "Enter two characters :"
        System.out.println("Enter two characters :");
        String characters = input.next();
        characters = characters.toUpperCase();

        if (characters.charAt(0) == 'M') {
            switch (characters.charAt(1)) {
                case '1':
                    System.out.println("Mathematics Freshman");
                    break;
                case '2':
                    System.out.println("Mathematics sophomore");
                    break;
                case '3':
                    System.out.println("Mathematics junior");
                    break;
                case '4':
                    System.out.println("Mathematics senior");
                    break;
            }

        } else if (characters.charAt(0) == 'C') {
            switch (characters.charAt(1)) {
                case '1':
                    System.out.println("Computer Science Freshman");
                    break;
                case '2':
                    System.out.println("Computer Science sophomore");
                    break;
                case '3':
                    System.out.println("Computer Science junior");
                    break;
                case '4':
                    System.out.println("Computer Science senior");
                    break;

            }

        } else if (characters.charAt(0) == 'I') {
            switch (characters.charAt(1)) {
                case '1':
                    System.out.println("Information Technology Freshman");
                    break;
                case '2':
                    System.out.println("Information Technology sophomore");
                    break;
                case '3':
                    System.out.println("Information Technology junior");
                    break;
                case '4':
                    System.out.println("Information Technology senior");
                    break;


            }
        }
    }
}

