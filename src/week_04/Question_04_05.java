package week_04;

import java.util.Scanner;

public class Question_04_05 {
    public static void main(String[] args) {
        //Geometry : Area of a regular polygon
        Scanner input = new Scanner(System.in);
        //Prompt the user Enter the number of sides
        System.out.println("Enter the number of sides : ");
        double sides = input.nextDouble();
        //Prompt the user Enter the side
        System.out.println("Enter the side : ");
        double lengthOfSide = input.nextDouble();
        //Compute the area of sides
        double areaOfSides = (sides * Math.pow(lengthOfSide,2))/4*Math.tan(Math.toRadians(180)/Math.tan(Math.toRadians(180)));
        //Display the result
        System.out.println("The area of he polygon is : " + areaOfSides );


    }
}
