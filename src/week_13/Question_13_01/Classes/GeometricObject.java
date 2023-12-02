package week_13.Question_13_01.Classes;

import java.util.Date;

public abstract class  GeometricObject {


      boolean isFilled ;
      String color;
     java.util.Date dateCreated;
    public GeometricObject(){
        dateCreated = new java.util.Date();
    };
    public GeometricObject(String color,boolean isFilled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.isFilled = isFilled;
    }


    public boolean isFilled(){
        return isFilled;
    }
    public void setFilled(boolean isFilled){
        this.isFilled = isFilled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public java.util.Date getDateCreated(){
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    @Override
    public String toString(){
        return "created on " + dateCreated + "\ncolor: " + color +
                 " and filled: " + isFilled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}
