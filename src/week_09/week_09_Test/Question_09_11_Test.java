package week_09.week_09_Test;

import week_09.week_09_Classes.Question_09_11_LinearEquation;

import java.util.Scanner;

public class Question_09_11_Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a,b,c,d,e,f :");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        Question_09_11_LinearEquation equation = new Question_09_11_LinearEquation(a,b,c,d,e,f);
        System.out.println((equation.isSolvable())?
                "x is " + equation.getX() + " y is " + equation.getY():
                "The equation has no solution");

    }
}
