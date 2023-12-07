package week_13.Question_13_18;

import java.math.BigInteger;

public class Question_13_18 {
    public static void main(String[] args) {
        Rational r = new Rational(BigInteger.ONE, new BigInteger("2"));

        for (BigInteger i = r.getNumerator().add(BigInteger.ONE);
             i.compareTo(new BigInteger("100")) <= 0;
             i = i.add(BigInteger.ONE)) {

            r = r.add(new Rational(i, i.add(BigInteger.ONE)));
        }
        //It may take some minutes to run :))
        System.out.println(r);
    }
    }

