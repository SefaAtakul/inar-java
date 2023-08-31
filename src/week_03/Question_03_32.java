package week_03;

import java.util.Scanner;

public class Question_03_32 {
    public static void main(String[] args) {
        //Geometry points position
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three points for p0,p1 and 2 : ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double xYEquation = (x1-x0)*(y2-y0)-(x2-x0)*(y1-y0);
        //Display the result
        if (xYEquation>0){
            System.out.println("(" + x2 + "," + y2 + ") p2 is on the left side of the line from (" + x0 + "," + y0 + ") to (" + x1 + "," + y1 +")" );
        } else if (xYEquation==0) {
            System.out.println("(" + x2 + "," + y2 +") p2 is n the same line ("+ x0 + "," + y0 + ") to (" + x1 + "," + y1 +")" );

        }else System.out.println("(" + x2 + "," + y2 + ") p2 is on the right side of the line from (" + x0 + "," + y0 + ") to (" + x1 + "," + y1 +")" );

    }
}
