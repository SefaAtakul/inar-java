package week_11.Test;

import week_11.Classes.Triangle;

import java.util.Scanner;

public class Question_11_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three side of th a triangle:  ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.println("Enter a color : ");
        String color = input.nextLine();

        System.out.println("Is the triangle is filled ( true / false ) ? : ");
        String filled = input.nextLine();
        boolean isFilled = covertToBoolean(filled);

        Triangle triangle = new Triangle(side1,side2,side3);
        triangle.setColor(color);
        triangle.setFilled(isFilled);
        displayObject(triangle);

    }
    public static boolean covertToBoolean(String isFilled){
        if (isFilled.equalsIgnoreCase("True")){
            return true;
        } else if (isFilled.equalsIgnoreCase("False")) {
            return false;
        }else {
            System.out.println("You entered a wrong input :");
            System.exit(1);
        }
        return false;
    }
    public static void displayObject(Object object){
        if (object instanceof Triangle){
            System.out.println(((Triangle)object).toString());
        }
    }
    
}
