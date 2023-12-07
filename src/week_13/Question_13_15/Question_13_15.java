package week_13.Question_13_15;

import java.math.BigInteger;

public class Question_13_15 {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("4");
        BigInteger b = new BigInteger("8");
        BigInteger c = new BigInteger("1");
        BigInteger d = new BigInteger("3");
        Rational_15 r1 = new Rational_15(a, b);
        Rational_15 r2 = new Rational_15(c, d);

        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        System.out.println(r2 + " is " + r2.doubleValue());
    }
}
