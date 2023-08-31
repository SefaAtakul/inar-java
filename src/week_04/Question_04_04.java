package week_04;

import java.util.Scanner;

public class Question_04_04 {
    public static void main(String[] args) {
        //Geometry : Area of a hexagon
        Scanner input = new Scanner(System.in);
        //Prompt the user Enter the side
        System.out.println("Enter the side of hexagon : ");
        double sideOfHexagon = input.nextDouble();
        //Find the area of hexagon
        double areaOfHexagon = (6 * Math.pow(sideOfHexagon,2)) /( 4 * Math.tan(Math.PI/6));
        //Display the result
        System.out.println("The area of hexagon : " + (double)(int)(areaOfHexagon*100)/100);


    }
}
