package week_13;

import week_13.Question_13_14.Rational;

import java.util.Scanner;

public class Question_13_21 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a,b,c : ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        Rational aRational = new Rational(a);
        Rational bRational = new Rational(b);
        Rational cRational = new Rational(c);

        Rational h = new Rational(bRational.multiply(new Rational(-1)).longValue(),
                aRational.multiply(new Rational(2)).longValue());
        Rational k = aRational.multiply(h.multiply(h)).add(bRational.multiply(h)).add(cRational);

        System.out.println("h is " + h + ", k is " + k);
    }
}
