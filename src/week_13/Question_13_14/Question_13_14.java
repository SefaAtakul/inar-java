package week_13.Question_13_14;

public class Question_13_14 {
    public static void main(String[] args) {
        Rational rational = new Rational(4,2);
        Rational rational1 = new Rational(5,3);

        System.out.println(rational + " + " + rational1 + " = " + rational.add(rational1));
        System.out.println(rational + " - " + rational1 + " = " + rational.subtract(rational1));
        System.out.println(rational + " / " + rational1 + " = " + rational.multiply(rational1));
        System.out.println(rational + " * " + rational1 + " = " + rational.divide(rational1));
        System.out.println(rational1 + " is " + rational1.doubleValue());
    }
}
