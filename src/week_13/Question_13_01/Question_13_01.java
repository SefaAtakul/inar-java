package week_13.Question_13_01;

import week_13.Question_13_01.Classes.Triangle;

import java.util.Scanner;

public class Question_13_01 {
    public static void main(String[] args) {
        doTheJob();
    }

    private static void doTheJob() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three sides of the triangle: ");
        int side1 = input.nextInt();
        int side2 = input.nextInt();
        int side3 = input.nextInt();

        System.out.print("Enter the color: ");
        String color = input.next();

        System.out.print("Enter whether it's filled: ");
        boolean filled= input.hasNextBoolean();
        input.close();

        Triangle myTriangle = new Triangle(side1,side2,side3,color,filled);

        System.out.println(myTriangle);
    }
}