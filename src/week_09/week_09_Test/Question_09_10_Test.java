package week_09.week_09_Test;

import week_09.week_09_Classes.Question_09_10_QuadraticEquation;

import java.util.Scanner;

public class Question_09_10_Test {
    public static void main(String[] args) {
        System.out.println("Enter a,b,c :");
        Scanner input =new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        Question_09_10_QuadraticEquation QuadraticEquation = new Question_09_10_QuadraticEquation(a,b,c);

        if (QuadraticEquation.getDiscriminant() > 0){
            System.out.println("The equation has two roots :" + QuadraticEquation.getRoot1() + "and " + QuadraticEquation.getRoot2());
        } else if (QuadraticEquation.getDiscriminant()==0) {
            System.out.println("The equation has one root : "+ QuadraticEquation.getRoot1());
        }else {
            System.out.println("The equation has no real roots");
        }
    }
}
