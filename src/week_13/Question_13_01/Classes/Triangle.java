package week_13.Question_13_01.Classes;

public class Triangle extends GeometricObject {
     double side1;
     double side2;
     double side3;


    public Triangle(double side1,double side2,double side3,String color,boolean isFilled){
        super( color, isFilled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getSide1(){
        return side1;
    }
    public void setSide1(double side1){
        this.side1 = side1;
    }
    public double getSide2(){
        return side2;
    }
    public void setSide2(double side2){
        this.side2 = side2;
    }
    public double getSide3(){
        return side3;
    }
    public void setSide3(double side3){
        this.side3 = side3;
    }
    @Override
    public String toString(){
        return "Color: " + color + " and filled: " + isFilled +
                "\nTriangle : side1 : " + side1 +
                "\nTriangle : side2 : " + side2 +
                "\nTriangle : side3 : " + side3;
    }

    @Override
    public double getArea() {
        double perimeter = side1+side3+side2;
        double s = perimeter/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }

    @Override
    public double getPerimeter() {
        return side1+side2+side3;
    }
}
