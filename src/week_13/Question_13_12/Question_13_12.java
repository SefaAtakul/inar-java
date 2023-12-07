package week_13.Question_13_12;

import week_13.Question_13_05.Circle;
import week_13.Question_13_05.GeometricObject;
import week_13.Question_13_10.Rectangle_10;

public class Question_13_12 {
    public static void main(String[] args) {
        GeometricObject[] array = getArray();
        double totalArea = sumArea( array);
        System.out.printf("The total area of geometric objects : %3.2f ",totalArea);

    }
    public static GeometricObject [] getArray(){
        GeometricObject [] geometricObject =new GeometricObject[4];
        geometricObject[0] = new Rectangle_10(4,5);
        geometricObject[1] = new Rectangle_10(3,4);
        geometricObject[2] = new Circle(5);
        geometricObject[3] = new Circle(6);
        return geometricObject;
    }
    public static double sumArea(GeometricObject [] geometricObject){
        double sumOfGeos = 0;
        for (int i = 0; i < 4; i++) {
            sumOfGeos += geometricObject[i].getArea();
        }
        return sumOfGeos;
    }
}
