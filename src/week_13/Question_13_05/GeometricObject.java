package week_13.Question_13_05;

import java.util.Date;

public abstract class GeometricObject {
    private String color;
    private boolean isFilled;
    private Date whenCreated;

    protected GeometricObject() {
        this.whenCreated = new Date();
    }

    protected GeometricObject(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
        this.whenCreated = new Date();
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.isFilled;
    }

    public void setFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }

    public Date getWhenCreated() {
        return this.whenCreated;
    }
    public double getArea(){
        return 0;
    }
    public double getPerimeter(){
        return 0;
    }

    @Override
    public String toString() {
        return "Created on " + this.whenCreated + "\ncolor : " + this.color +
                " and filled : " + this.isFilled;
    }

    public static GeometricObject max
            (GeometricObject obj1,GeometricObject obj2){
        if(obj1.getArea() > obj2.getArea()){
            return obj1;
        } else if (obj1.getArea() < obj2.getArea()) {
            return obj2;
        }else {
            return obj1;
        }
    }
}