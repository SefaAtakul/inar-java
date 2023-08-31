package week_03;

import java.util.Scanner;

public class Question_03_29 {
    public static void main(String[] args) {
        //Geometry two circles
        Scanner input = new Scanner(System.in);
        //Take circles x,y and r
        System.out.println("Enter circle1's center x-,y-coordinates,and radius1 : ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double r1 = input.nextDouble();
        System.out.println("Enter circle2's center x-,y-coordinates,and radius2 : ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double r2 = input.nextDouble();

        double distance = Math.pow(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2), 0.5);

        if (distance + r2 <= r1) {
            System.out.println("circle2 is inside circle1");
        } else {
            System.out.println("circle2 overlaps circle1");

        }
    }
}
