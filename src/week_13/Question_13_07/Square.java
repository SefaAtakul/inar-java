package week_13.Question_13_07;

import week_13.Question_13_05.GeometricObject;

public class Square extends GeometricObject implements Colorable {
    private double side;

    public Square() {
        this(1);
    }

    public Square(double side) {
        this.side = side;
    }


    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public double getPerimeter() {
        return 4 * this.side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

}
