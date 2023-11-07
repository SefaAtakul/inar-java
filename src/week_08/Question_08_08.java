package week_08;

import java.util.Scanner;

public class Question_08_08 {
    public static void main(String[] args) {
        //
        double [][] pointsIs = getThePoints();
        double shortestDistance = findTheShortestDistance(pointsIs);
        printTheClosestPairs(pointsIs,shortestDistance);
    }
    public static double [][] getThePoints(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of points : ");
        int numberOfPoints = input.nextInt();
        System.out.print("Enter " + numberOfPoints+" points :");
        double [][] points = new double[numberOfPoints][2];
        for (int rows = 0; rows < points.length; rows++) {
            points[rows][0]=input.nextDouble();
            points[rows][1]=input.nextDouble();

        }
        return points;
    }
    public static double findTheShortestDistance(double [][] points){
        double closestDistance = 0;
        for (int point = 0; point < points.length - 1; point++) {
            double x1 = points[point][0];
            double y1 = points[point][1];
            for (int secondPoint = point + 1; secondPoint < points.length; secondPoint++) {
                double x2 = points[secondPoint][0];
                double y2 = points[secondPoint][1];
                double currentDistance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
                if (point == 0) {
                    closestDistance = currentDistance;
                } else {
                    if (closestDistance > currentDistance) {
                        closestDistance = currentDistance;
                    }
                }
            }
        }
        return closestDistance;
    }

    public static void printTheClosestPairs(double [][] points , double shortedDistance){
        for (int row = 0; row < points.length-1; row++) {
           double x1 = points[row][0];
            double y1 = points[row][1];
            for (int secondRow = 1; secondRow < points.length; secondRow++) {
                double x2 = points[secondRow][0];
                double y2 = points[secondRow][1];
                double distance =  Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
                if (shortedDistance == distance){
                    System.out.println("The closest two points are (" +x1+", "+y1 + ") and ("+x2 + ", "+y2 + ")"  );
                }
            }

        }
        System.out.print("Their distance is " + shortedDistance);

    }

}
