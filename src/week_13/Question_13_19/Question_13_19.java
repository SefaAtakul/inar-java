package week_13.Question_13_19;

import week_13.Question_13_15.Rational_15;
import week_13.Question_13_18.Rational;

import java.math.BigInteger;
import java.util.Scanner;

public class Question_13_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        String[] decimal = input.next().split("[.]");

        Rational r = new Rational(new BigInteger(decimal[0] + decimal[1]),
                new BigInteger(String.valueOf((int) Math.pow(10, decimal[1].length()))));

        System.out.println("The fraction number is " + r);
    }
}