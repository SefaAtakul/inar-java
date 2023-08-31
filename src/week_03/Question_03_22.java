package week_03;

import java.util.Scanner;

public class Question_03_22 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        //Point in a circle
        System.out.println("Enter a point with two coordinates : ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        //Second point(x1,y1) is (0,0)

        double distance = Math.pow(Math.pow((x2-0), 2) + Math.pow(y2-0, 2), 0.5);

        System.out.print("Point is ( " + x2 + " , " + y2 + " ) " ) ;
        if (distance <= 10){
            System.out.print("Point is in the circle ");
        }else {
            System.out.print("Point is not in the circle ");
        }


    }
}
