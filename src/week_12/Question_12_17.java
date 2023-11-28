package week_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question_12_17 {
    public static void main(String[] args) throws FileNotFoundException {
        //Game hangman
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a wordlist file pathname fpr Hangman :");
        String filePath = input.nextLine();
        File file = new File(filePath);
        if (!file.exists()){
            System.out.println("Actually we can't find the file dude!");
            System.exit(1);
        }
        Scanner input1 =new Scanner(file);

        ArrayList<String> words = new ArrayList<>();
        while (input1.hasNextLine()){
            words.addAll(Arrays.asList(input1.nextLine().split("\\s+")));//Tricky line
        }
        String wordChosen = words.get((int)(Math.random()*words.size()));
        char [] star = new char[wordChosen.length()];
        Arrays.fill(star,'*');

        boolean gameGoOn = true;
        int guessCounter = 0;

        while (gameGoOn) {
            System.out.print("(Guess) Enter a letter in word " + Arrays.toString(star) + " -> " );
            char guess = input.next().charAt(0);
            if (alreadyShown(guess,star)){
                System.out.println(guess + " is already in the shown part!");
                continue;
            }
            if (doesNotExist(guess,star,wordChosen)){
                System.out.println(guess + " is not in the word!");
                guessCounter++;
                continue;
            }
            for (char index : star) {
                if ((index == '*')) {
                    gameGoOn = true;
                    break;
                }
                gameGoOn = false;
            }
        }
        System.out.println("The word is \"" + wordChosen + "\" . You missed " + ((guessCounter==0)?"none" :( guessCounter + ((guessCounter>1)?" times":" time"))));

    }
    public static boolean doesNotExist(char guess , char [] star ,String wordChosen){
        boolean condition =true;
        for (int i = 0; i < wordChosen.length(); i++) {
        if (guess == wordChosen.charAt(i)){
            star[i] = guess;
            condition = false;
        }

        }
        return condition;
    }
public static boolean alreadyShown (char guess , char [] star){
    for (int i = 0; i < star.length; i++) {
        if (guess == star[i]){
            return true;
        }
    }
    return false;
}

}
