package week_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question_12_29 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.print("Enter a file name : ");
        Scanner input1 =new Scanner(System.in);

        String filePath =input1.nextLine();

        File file = new File(filePath);
        StringBuilder page = new StringBuilder();
        try {
            Scanner input = new Scanner(file);
            while (input.hasNext()) {
                String line = input.nextLine();
                page.append(line).append("\n");
            }
            int[] letters = getCountOfLetters(page.toString());
            printCountOfLetters(letters);
        } catch (FileNotFoundException ex) {
            System.out.println("File not found!");
        }
    }

    public static void printCountOfLetters(int[] letters) {
        for (int i = 0; i < letters.length; i++) {
            System.out.println("Number of " + (char) ('A' + i) + "'s : " + letters[i]);
        }
    }

    public static int[] getCountOfLetters(String page) {
        int[] letters = new int[('Z' - 'A') + 1];
        for (int i = 0; i < page.length(); i++) {
            if (Character.isLetter(page.charAt(i))) {
                char currentLetter = Character.toUpperCase(page.charAt(i));
                letters[currentLetter - 'A']++;
            }
        }
        return letters;
    }
        }

