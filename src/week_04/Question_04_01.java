package week_04;

import java.util.Scanner;

public class Question_04_01 {
    public static void main(String[] args) {
        //Geometry :area of a pentagon
        Scanner input = new Scanner(System.in);
        //Prompt the user Enter the vertex
        System.out.println("Enter the length from the center to a vertex : " );
        double lengthVertex = input.nextDouble();
        //Fİnd the side and area of pentagon
        double sideOfPentagon = 2*lengthVertex*Math.sin(Math.PI/5);
        double areaOfPentagon = (5*Math.pow(sideOfPentagon,2))/(4*Math.tan(Math.PI/5));

        System.out.println("The area of a pentagon is : " +(double)((int)(areaOfPentagon*100))/100);


    }


}
