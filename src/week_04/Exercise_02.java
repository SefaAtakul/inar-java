package week_04;

import java.util.Scanner;

public class Exercise_02 {
    public static void main(String[] args) {
        //Write a code that calculate the long side of a triangle
        Scanner input = new Scanner(System.in);
        //Prompt the user Enter two side of triangle
        System.out.println("Enter two side of triangle :");
        double firstSide = input.nextDouble();
        double secondSide = input.nextDouble();
        double hypotenuse = Math.sqrt(Math.pow(firstSide, 2)+Math.pow(secondSide, 2));
        System.out.println("Long side of triangle is : " + hypotenuse + " :)");

    }
}
