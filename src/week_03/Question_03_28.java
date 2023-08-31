package week_03;

import java.util.Scanner;

public class Question_03_28 {
    public static void main(String[] args) {
        //Geometry two Rectangles
        Scanner input = new Scanner(System.in);
        //Prompt the user enter the values
        System.out.println("Enter r1's center x-,y-coordinates,width,and height:");
        //Take the width,height and two points of first rectangle
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double width1 = input.nextDouble();
        double height1 = input.nextDouble();

        System.out.println("Enter r2's center x-,y-coordinates,width,and height:");
        //Take the width,height and two points of second rectangle
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double width2 = input.nextDouble();
        double height2 = input.nextDouble();
        if (height2 <= height1 && width2 <= width1 && (x1 - x2) <= width2 / 2 && (y1 - y2) <= height2) {
            System.out.println("r2 is inside r1");
        } else {
            System.out.println("r2 overlaps r1");
        }
    }
}
