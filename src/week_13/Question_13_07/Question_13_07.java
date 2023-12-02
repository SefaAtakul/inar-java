package week_13.Question_13_07;

import week_11.Classes.Triangle;
import week_13.Question_13_05.Circle;
import week_13.Question_13_05.GeometricObject;

public class Question_13_07 {
    public static void main(String[] args) throws IllegalArgumentException {
        GeometricObject[] geometricObjects = new GeometricObject[5];
        geometricObjects[0] = new Circle(5);
        geometricObjects[1] = new Circle(4);
        geometricObjects[2] = new Circle(7);
        geometricObjects[3] = new Square(2);
        geometricObjects[4] = new Square(6);

        for (int i = 0; i < geometricObjects.length; i++) {

            System.out.println("Area of Geometric Object in the index " + i + " is : "
                    + geometricObjects[i].getArea());
            if (geometricObjects[i] instanceof Colorable) {
                ((Colorable) geometricObjects[i]).howToColor();
            }
        }
    }

}
