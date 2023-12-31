package week_11.Classes;

import week_11.Classes.GeometricObject;

public class Triangle extends GeometricObject {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
    public Triangle(){

    }
    public Triangle(double side1 , double side2 , double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getSide1(){
        return side1;
    }

    public double getSide2(){
        return side2;
    }

    public double getSide3(){
        return side3;
    }

    public double getArea(){
        double s = (side1 + side2 + side3) / 2;
        return Math.pow(s * (s - side1) *
                (s - side2) * (s - side3), 0.5);
    }
    public double getPerimeter(){
        return (side1+side2+side3);
    }
    public String toString(){
        return "Triangle  : Side1 : " + this.side1 + " \n Side 2 : " + this.side2 + "\n Side3 : " + this.side3
                + "\nArea : " + this.getArea() +
                "\nPerimeter : " + this.getPerimeter() +
                "\n" + super.toString();
    }
}
