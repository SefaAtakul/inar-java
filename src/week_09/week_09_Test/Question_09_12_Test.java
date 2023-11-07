package week_09.week_09_Test;

import week_09.week_09_Classes.Question_09_11_LinearEquation;

import java.util.Scanner;

public class Question_09_12_Test {
    public static void main(String[] args) {
        //Geometry Intersecting points
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1,y1,x2,y2,x3,y3,x4,y4 : ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        double a = y1 - y2;
        double b = x2 - x1;
        double c = y3 - y4;
        double d = x4 - x3;
        double e = a * x1 - (-b * y1);
        double f = c * x3 - (-d * y3);

        Question_09_11_LinearEquation equation = new Question_09_11_LinearEquation(a,b,c,d,e,f);
        if (equation.isSolvable()) {
            System.out.printf("The intersecting point is at (%.5f  ,  %.5f)\n", equation.getX(), equation.getY());
        } else {
            System.out.println("The two lines are parallel");
        }
    }
}
