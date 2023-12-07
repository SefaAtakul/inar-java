package week_13.Question_13_15;

import week_13.Question_13_14.Rational;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Rational_15 extends Number implements Comparable<Rational_15> {
    private BigInteger numerator;
    private BigInteger denominator;

    public Rational_15() {
        this(new BigInteger("0"), new BigInteger("1"));
    }

    public Rational_15(BigInteger numerator, BigInteger denominator) {
        BigInteger gcd = numerator.gcd(denominator);
        this.denominator = denominator.divide(gcd).abs();

        //this.denominator = denominator;
        this.numerator = ((this.denominator.compareTo(new BigInteger("0")) == 1) ? new BigInteger("1") : new BigInteger("-1")).multiply((numerator.divide(gcd)));

    }

    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue() {

        BigDecimal numer = new BigDecimal(this.numerator);
        BigDecimal deNumer = new BigDecimal(this.denominator);
        BigDecimal oldResult = numer.divide(deNumer, 2, RoundingMode.DOWN);
        return oldResult.doubleValue();

    }


    public BigInteger getNumerator() {
        return this.numerator;
    }

    public BigInteger getDenominator() {
        return this.denominator;
    }

    public void setNumerator(BigInteger numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(BigInteger denominator) {
        this.denominator = denominator;
    }

    public Rational_15 add(Rational_15 secondRational) {
        BigInteger n = this.numerator.multiply(secondRational.getDenominator()).add(this.denominator.multiply(secondRational.getNumerator()));
        BigInteger d = this.denominator.multiply(secondRational.getDenominator());
        return new Rational_15(n, d);
    }

    public Rational_15 subtract(Rational_15 secondRational) {
        BigInteger n = numerator.multiply(secondRational.getDenominator()).subtract(denominator.multiply(secondRational.getNumerator()));
        BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new Rational_15(n, d);
    }

    public Rational_15 multiply(Rational_15 secondRational) {
        BigInteger n = numerator.multiply(secondRational.getNumerator());
        BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new Rational_15(n, d);
    }

    public Rational_15 divide(Rational_15 secondRational) {
        BigInteger n = numerator.multiply(secondRational.getDenominator());
        BigInteger d = denominator.multiply(secondRational.numerator);
        return new Rational_15(n, d);
    }

    @Override
    public String toString() {
        if (denominator.equals(new BigInteger("1"))) {
            return numerator + " ";
        } else {
            return numerator + "/" + denominator;
        }
    }

    @Override
    public boolean equals(Object o) {
        if ((this.subtract((Rational_15) (o))).getNumerator().equals(new BigInteger("0"))) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int compareTo(Rational_15 o) {
        if (this.subtract(o).getNumerator().compareTo(new BigInteger("0")) == 1) {
            return 1;
        } else if (this.subtract(o).getNumerator().compareTo(new BigInteger("0")) == 0) {
            return 0;
        } else {
            return -1;
        }
    }
}
