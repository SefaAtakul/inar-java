package week_13.Question_13_05;

public class Question_13_05 {
    public static void main(String[] args) {
        GeometricObject circle1 = new Circle(5);
        circle1.setColor("green");
        circle1.setFilled(true);
        GeometricObject circle2 = new Circle(3);
        circle2.setColor("red");
        System.out.println("The larger of the two circle is : ");
        System.out.println(GeometricObject.max(circle1, circle2));

        System.out.println("-------------------------------------");

        GeometricObject rectangle1 = new Rectangle(15, 12);
        rectangle1.setColor("green");
        GeometricObject rectangle2 = new Rectangle(2, 6);
        rectangle2.setColor("red");
        System.out.println("The larger of the two rectangle is : ");
        System.out.println(GeometricObject.max(rectangle1, rectangle2));


    }
}
