package week_04;

import java.util.Scanner;

public class Question_04_06 {
    public static void main(String[] args) {
        //Random points on a circle
        Scanner input = new Scanner(System.in);
        final double radius = 40 ;
        //Generate three random points on a circle centered on(0,0) with radius 40
        double pointX1 = radius * Math.cos( (Math.random() * 90) );
        double pointY1 = radius * Math.sin( Math.random() * 90) ;
        double pointX2 = radius * Math.cos( (Math.random() * 90) );
        double pointY2 = radius * Math.sin( Math.random() * 90) ;
        double pointX3 = radius * Math.cos( (Math.random() * 90) );
        double pointY3 = radius * Math.sin( Math.random() * 90) ;

        //Find the distances between points
        double line1 =Math.sqrt(Math.pow(pointX2-pointX1,2)+Math.pow(pointY2-pointY1,2));
        double line2 =Math.sqrt(Math.pow(pointX3-pointX2,2)+Math.pow(pointY3-pointY2,2));
        double line3 =Math.sqrt(Math.pow(pointX1-pointX3,2)+Math.pow(pointY1-pointY3,2));

        //Find the angles of triangle
        double angel1 = Math.acos((Math.pow(line1,2)-Math.pow(line2,2)-Math.pow(line3,2))/(-2*line2*line3));
        double angel2 = Math.acos((Math.pow(line2,2)-Math.pow(line1,2)-Math.pow(line3,2))/(-2*line1*line3));
        double angel3 = Math.acos((Math.pow(line3,2)-Math.pow(line2,2)-Math.pow(line1,2))/(-2*line1*line2));

        System.out.printf("The three angles are %f %f %f ",angel1,angel2,angel3);



    }
}
