package week_13.Question_13_10;

import week_13.Question_13_05.GeometricObject;

public class Rectangle_10 extends GeometricObject implements Comparable<Rectangle_10>{
    private double width ;
    private double height;
    public Rectangle_10(){
    };
    public Rectangle_10(double width, double height){
        this.width = width;
        this.height = height;

    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width =width;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height =height;
    }
    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return 2*(width+height);
    }
    public boolean equals(Object o){
        if (o instanceof Rectangle_10) {
            return this.getArea() == ((Rectangle_10) o).getArea();
        } else {
            System.out.println("Wrong instance!");
            return false;
        }
    }

    @Override
    public int compareTo(Rectangle_10 o) {
       if (Rectangle_10.this.getArea() > o.getArea()){
           return 1;
       } else if (Rectangle_10.this.getArea() < o.getArea()) {
           return -1;
       }else {
           return 0;
       }

    }
    @Override
    public String toString() {
        return "Area : " + this.getArea();
    }
}
