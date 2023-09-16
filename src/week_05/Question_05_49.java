package week_05;

import java.util.Scanner;

public class Question_05_49 {
    public static void main(String[] args) {
        //Count vowels and consonants
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string :");
        String stringWithVowAndCon = input.nextLine();
        int vowels = 0;
        int consonants = 0;



        for (int i = 0; i <=stringWithVowAndCon.length()-1 ; i++) {
            char abc = stringWithVowAndCon.charAt(i);
            if (Character.isLetter(abc)) {
                if (abc == 'A' || abc == 'E' || abc == 'I' || abc == 'O' || abc == 'U' ||
                        abc == 'a' || abc == 'e' || abc == 'ı' || abc == 'o' || abc == 'u') {
                    vowels++;

                } else {
                    consonants++;
                }
            }
        }
        System.out.print("The number of vowels : " + vowels);
        System.out.print("\nThe number of consonants : " + consonants);

    }
}
