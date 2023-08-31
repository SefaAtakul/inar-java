package week_04;

import java.util.Scanner;

public class Question_04_02 {
    public static void main(String[] args) {
        //Geometry:Great circle distance
        final double radius = 6371.01;
        Scanner input = new Scanner(System.in);
        //Prompt the user Enter the latitude and longitude
        System.out.println("Enter point 1 (latitude and longitude) in degrees : ");
        double latitude1 = Math.toRadians(input.nextDouble());
        double longitude1 = Math.toRadians(input.nextDouble());
        System.out.println("Enter point 2 (latitude and longitude) in degrees : ");
        double latitude2 = Math.toRadians(input.nextDouble());
        double longitude2 = Math.toRadians(input.nextDouble());
        double greatCircleDistance = radius * Math.acos(Math.sin(latitude1)*Math.sin(latitude2)*Math.cos(latitude1)*Math.cos(latitude2)*Math.cos(longitude1-longitude2));
        //Display the result
        System.out.println("The distance between two points is : " + greatCircleDistance );



    }
}
