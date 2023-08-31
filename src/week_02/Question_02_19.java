package week_02;

import java.util.Scanner;

public class Question_02_19 {
    public static void main(String[]args){
        //Area of a triangle
        System.out.println("Enter three points for a triangle = ") ;

        Scanner input = new Scanner(System.in) ;
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        //Distance between two point
        double Distance1 = Math.pow((x2-x1),2 )+ Math.pow(y2-y1, 2);
        double totalDistance1 = Math.pow(Distance1, 0.5);

        double Distance2 = Math.pow((x3-x1),2 )+ Math.pow(y3-y1, 2);
        double totalDistance2 = Math.pow(Distance2, 0.5);

        double Distance3 = Math.pow((x3-x2),2 )+ Math.pow(y3-y2, 2);
        double totalDistance3 = Math.pow(Distance3, 0.5);

        double s = ( totalDistance1 + totalDistance2 + totalDistance3) / 2 ;
        double area = Math.pow(s * ( s - totalDistance1) * ( s - totalDistance2 ) * ( s - totalDistance3 ), 0.5) ;


        System.out.println("The area of triangle is  = " + (double) ( (int)( area * 10 ) ) / 10 );


    }
}
