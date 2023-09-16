package week_05;

import java.util.Scanner;

public class Question_05_47 {
    public static void main(String[] args) {
        //Business : check ISBN-13
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the first 12 digits of an ISBN-13 as a string : ");
        String firstTwelveNumberOfIsbn = input.nextLine();

        int total = 0 ;
        int theLastNumberOfIsbn = 0 ;

        int loopReputationIs=firstTwelveNumberOfIsbn.length();//Reputation value will be length of  Isbn-12
        if (loopReputationIs != 12 ){
            System.out.printf("%s is an invalid input",firstTwelveNumberOfIsbn);
        }else {

            for (int i = 1; i < loopReputationIs; i++) {
                char number = firstTwelveNumberOfIsbn.charAt(i - 1);
                String stringOfNumber = String.valueOf(number);
                int d = Integer.parseInt(stringOfNumber);

                if (i % 2 == 0) {
                    total += d;
                } else {
                    total += 3 * d;
                }


            }
            theLastNumberOfIsbn = 10 - (total % 10);

            if (theLastNumberOfIsbn == 10) {
                System.out.printf("The ISBN-13 number is %s%d", firstTwelveNumberOfIsbn, 0);
            } else {
                System.out.printf("The ISBN-13 number is %s%d", firstTwelveNumberOfIsbn, theLastNumberOfIsbn);
            }
        }
        
    }
}
