package week_04;

import java.util.Scanner;

public class Question_04_08 {
    public static void main(String[] args) {
        //Find the character of an ASCII code
        Scanner input = new Scanner(System.in);
        //Get number from users
        System.out.println("Enter an ASCII code : ");
        int asciiCodeNum = input.nextInt();

        char charOfCode = (char) asciiCodeNum;

        System.out.printf("The character for ASCII code %d is %c", asciiCodeNum, charOfCode);
            }

        }
