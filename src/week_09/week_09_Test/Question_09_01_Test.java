package week_09.week_09_Test;

import week_09.week_09_Classes.Question_09_01_Rectangle;

public class Question_09_01_Test {
    public static void main(String[] args) {
        Question_09_01_Rectangle rectangle1 = new Question_09_01_Rectangle(40,4);
        Question_09_01_Rectangle rectangle2 = new Question_09_01_Rectangle(39.5,3.5);


        System.out.println("--Rectangle 1--");
        System.out.println("Width     :" + rectangle1.width);
        System.out.println("Height    :" + rectangle1.height);
        System.out.println("Area      :" + rectangle1.getArea());
        System.out.println("Perimeter :" + rectangle1.getPerimeter());
        System.out.println();
        System.out.println("--Rectangle 2--");
        System.out.println("Width     :" + rectangle2.width);
        System.out.println("Height    :" + rectangle2.height);
        System.out.println("Area      :" + rectangle2.getArea());
        System.out.println("Perimeter :" + rectangle2.getPerimeter());

    }
    }

