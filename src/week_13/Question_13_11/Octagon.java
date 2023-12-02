package week_13.Question_13_11;

import week_13.Question_13_05.GeometricObject;

public class Octagon extends GeometricObject implements Comparable , Cloneable {
    private double side;
    public Octagon(){};
    public Octagon(double side){
        this.side = side;
    }
    public double getSide(){
        return side;
    }
    public void setSide(double side){
        this.side =side;
    }
    public double getArea(){
        return (2+4/Math.sqrt(2)*Math.pow(side,2));
    }
    public double getPerimeter(){
        return side * 8 ;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    @Override
    public int compareTo(Object o) {
        if (Octagon.this.getArea() > ((Octagon)o).getArea()){
            return 1;
        } else if (Octagon.this.getArea() < ((Octagon)o).getArea()) {
            return -1;
        }else {
            return 0;
        }
    }
    public String toString(){
        return "Side : " + side +"\n"+
                "Area is : " + this.getArea() +"\n" +
                "Perimeter is : " + this.getPerimeter();
    }
    public boolean equals(Object o) {
        return this.getArea() == ((Octagon) o).getArea();
    }
}
