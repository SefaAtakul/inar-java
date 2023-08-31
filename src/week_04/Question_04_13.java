package week_04;

import java.util.Scanner;

public class Question_04_13 {
    public static void main(String[] args) {
        //Vowel or consonant
        char charOfLetter;
        //Take a letter from user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter :");
        String letter = input.nextLine();

        if (letter.length() > 1) {
            System.out.printf("%s is an invalid input", letter);
            System.exit(1);
        }

        if ((letter.charAt(0) >= 65 && letter.charAt(0) <= 90)
                || (letter.charAt(0) >= 97 && letter.charAt(0) < 122)) {

            charOfLetter = Character.toLowerCase(letter.charAt(0));

            if ((int) (charOfLetter) == 97 || (int) (charOfLetter) == 101 || (int) (charOfLetter) == 105 || (int) (charOfLetter) == 111 || (int) (charOfLetter) == 117) {
                System.out.printf("%s is a vowel", letter);

            } else {

                System.out.printf("%s is a consonant", letter);
            }

        } else {

            System.out.printf("%s is an invalid input", letter);
        }
    }
}
