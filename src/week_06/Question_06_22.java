package week_06;

import java.util.Scanner;

public class Question_06_22 {
    public static void main(String[] args) {
        //Math: approximate the square root
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer for us,please :");
        long number = input.nextLong();
        double sqrOfNumber =squartOfnumber(number);
        squartOfnumber(number);

        System.out.print("The approximated square root of "+number+" is " + Math.round(sqrOfNumber));
    }
    public static double squartOfnumber(long number) {
        double approximateSqr = 6;
        double nextGuess = 0;

        do {
            nextGuess = (approximateSqr + number / approximateSqr) / 2;
            approximateSqr = nextGuess;
        } while (Math.abs(nextGuess - approximateSqr) == 0.000000001E-10);



        return approximateSqr;
    }

}
