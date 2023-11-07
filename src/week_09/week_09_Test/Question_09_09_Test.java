package week_09.week_09_Test;

import week_09.week_09_Classes.Question_09_09_RegularPolygon;

public class Question_09_09_Test {
    public static void main(String[] args) {
        Question_09_09_RegularPolygon RegularPolygon1 = new Question_09_09_RegularPolygon();
        Question_09_09_RegularPolygon RegularPolygon2 = new Question_09_09_RegularPolygon(6,4);
        Question_09_09_RegularPolygon RegularPolygon3 = new Question_09_09_RegularPolygon(10,4,5.6,7.8);

        System.out.println("First RegularPolygon perimeter is : " +RegularPolygon1.getPerimeter() + "   area is : " + RegularPolygon1.getArea() );
        System.out.println("Second RegularPolygon perimeter is : " +RegularPolygon2.getPerimeter() + "   area is : " + RegularPolygon2.getArea() );
        System.out.println("Third RegularPolygon perimeter is : " +RegularPolygon3.getPerimeter() + "   area is : " + RegularPolygon3.getArea() );


    }
}
