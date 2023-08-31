package week_03;

import java.util.Scanner;

public class Question_03_15 {
    public static void main(String[] args) {

        //generate random lottery numbers
        int lottery = (int) (Math.random() * 1000);

        //ask user to enter a 3 digit integer and store those numbers
        Scanner numbers = new Scanner(System.in);
        System.out.println("Please enter your lottery number. Three Digits Only");
        int guess = numbers.nextInt();

        // numbers for lottery
        int lotteryDigit1 = lottery % 100;
        int lotteryDigit2 = lottery % 100 / 10;
        int lotteryDigit3 = lottery / 100;

        //get digits from guess
        int guessDigit1 = guess % 100;
        int guessDigit2 = guess % 100 / 10;
        int guessDigit3 = guess / 100;

        //print out lottery numbers
        System.out.println("The lottery numbers are: " + lottery);

        if (guess == lottery)
            System.out.println("Exact Match!!! 10,000$ Prize!!!");
        else if (guessDigit2 == lotteryDigit1
                && guessDigit1 == lotteryDigit2
                && guessDigit3 == lotteryDigit3)
            System.out.println("Matched all numbers!!! 3,000$ Prize!!!");
            //Rule 3
        else if (guessDigit1 == lotteryDigit1
                || guessDigit1 == lotteryDigit2
                || guessDigit1 == lotteryDigit3
                || guessDigit2 == lotteryDigit1
                || guessDigit2 == lotteryDigit2
                || guessDigit2 == lotteryDigit3
                || guessDigit3 == lotteryDigit1
                || guessDigit3 == lotteryDigit2
                || guessDigit3 == lotteryDigit3)
            System.out.println("Matched one number!!! 1,000$ Prize!!!");
        else
            System.out.println("No Match, Better Luck Next Time!");

    }
}

