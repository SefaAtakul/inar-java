package week_12;

import week_12.Classes.IllegalTriangleException;
import week_12.Classes.Triangle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_12_05 {
    public static void main(String[] args) {
        //IllegalTriangleException
        Scanner input = new Scanner(System.in);
        boolean condition = true;

        while (condition){
            try {
                System.out.println("Enter three sides of triangle :");
                double side1 = input.nextDouble();
                double side2 = input.nextDouble();
                double side3 = input.nextDouble();

                Triangle triangle = new Triangle(side1, side2, side3);
                System.out.println(triangle);
                condition =false;
            }catch (InputMismatchException ex){
                System.out.println("You must enter double for sides!");
            }catch (IllegalTriangleException ex){
                ex.printStackTrace();
                System.out.println();
            }
            input.nextLine();
        }

    }
}
