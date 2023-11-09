package week_10.Test;

import week_10.Classes.MyRectangle2D;

public class Question_10_13 {
    public static void main(String[] args) {
        MyRectangle2D r1 = new MyRectangle2D(2,2,5.5,4.9);
        System.out.println("Rectangle :");
        System.out.println("---------------------------------");
        System.out.println("Area :" + r1.getArea());
        System.out.println("Perimeter : " + r1.getPerimeter());
        System.out.println("Contains the point (3,3) : " +r1.contains(3,3));
        System.out.println("Does not contain the rectangle with points (4,5,10.5,3.2) : " + r1.contains(new MyRectangle2D(4,5,10.5,3.2)));
        System.out.println("Does not overlap the rectangle with points (3,5,2.3,5,4) : " + r1.overlaps(new MyRectangle2D(3,5,2.3,5.4)));


    }
}
