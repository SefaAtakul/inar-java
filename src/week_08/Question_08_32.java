package week_08;

import java.util.Scanner;

public class Question_08_32 {
    public static void main(String[] args) {
        //Geometry : Area of a triangle
        areaOfATriangle();

    }
    public static void areaOfATriangle(){
        double [][] pointsOfTriangle = getPoints();
        double s = getS(pointsOfTriangle);
        double area = calculateTheArea(pointsOfTriangle,s);

        if (area != 0) {
            printArea(area);
        } else {
            System.out.println("The three points are on the same line");
        }

    }
    public static double [][] getPoints(){
        double [][] points =new double[3][2];
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the points of triangle x1,y1,x2,y2,x3,y3 :");
        for (int row = 0; row < points.length; row++) {
            for (int colums = 0; colums < points[row].length; colums++) {
                points[row][colums]= input.nextDouble();

            }

        }
        return points;
    }
    public static double calculateTheArea(double [][] points,double s){
        double distanceSide1 = Math.sqrt(Math.pow(points[1][0]-points[0][0],2)+Math.pow(points[1][1]-points[0][1],2));
        double distanceSide2 = Math.sqrt(Math.pow(points[2][0]-points[0][0],2)+Math.pow(points[2][1]-points[0][1],2));
        double distanceSide3 = Math.sqrt(Math.pow(points[2][0]-points[1][0],2)+Math.pow(points[2][1]-points[1][1],2));
        double area = Math.sqrt(s*(s-distanceSide1)*(s-distanceSide2)*(s-distanceSide3));
        if (isOnTheSameLine(points)) {
            return 0;
        }

        return area;
    }
    public static double getS(double [][] points){
        double distanceSide1 = Math.sqrt(Math.pow(points[1][0]-points[0][0],2)+Math.pow(points[1][1]-points[0][1],2));
        double distanceSide2 = Math.sqrt(Math.pow(points[2][0]-points[0][0],2)+Math.pow(points[2][1]-points[0][1],2));
        double distanceSide3 = Math.sqrt(Math.pow(points[2][0]-points[1][0],2)+Math.pow(points[2][1]-points[1][1],2));
        double s = (distanceSide1+distanceSide2+distanceSide3)/2;
        return s;
    }
    public static void printArea(double area) {
        //if (area == 0) {
        //  System.out.println("The three points are on the same line");
        //} else {
        System.out.printf("The area of the triangle is %.2f", area);
        //}
    }
    public static boolean isOnTheSameLine(double[][] points) {
        double x0 = points[0][0];
        double y0 = points[0][1];
        double x1 = points[1][0];
        double y1 = points[1][1];
        double x2 = points[2][0];
        double y2 = points[2][1];

        return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) == 0;
    }

}
