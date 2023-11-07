package week_09.week_09_Classes;

public class Question_09_10_QuadraticEquation {
    private double a;
    private double b;
    private double c;

    Question_09_10_QuadraticEquation() {
    }

    ;

    public Question_09_10_QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return Math.pow(b, 2) - (4 * a * c);
    }

    public double getRoot1() {
        if (getDiscriminant() >= 0) {
            return (-b + (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / (2 * a);
        } else {
            return 0;
        }
    }

    public double getRoot2() {
      return (getDiscriminant()>0) ? (-b - (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / (2 * a):0;
    }
}