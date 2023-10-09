package week_06;

import java.util.Scanner;

public class Question_06_35 {
    public static void main(String[] args) {
        //Geometry:Area of a pentagon
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side of pentagon,please : ");
        double sideOfPentagonIs = input.nextDouble();

        areaOfPentagon(sideOfPentagonIs);

    }
    public static double areaOfPentagon(double sideOfPentagonIs){
        double areaIs = (5 * Math.pow(sideOfPentagonIs,2)) / (4 * Math.tan(Math.PI/5));
        System.out.printf("The area of %4.1f side longed pentagon is %f ",sideOfPentagonIs,areaIs);
        return areaIs;
    }
}
