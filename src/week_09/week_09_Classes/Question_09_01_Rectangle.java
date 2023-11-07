package week_09.week_09_Classes;

public class Question_09_01_Rectangle {
    //The rectangle class

    public double height = 1;

    public double width = 1;

 Question_09_01_Rectangle(){

 };

 public Question_09_01_Rectangle(double newHeight, double newWidth){
    height = newHeight;

    width = newWidth;
}
public double getArea (){
        return (width*height);
}

public double getPerimeter(){
    return (width+height)*2;
}
double setHeight(double newHeight){
   return   height = newHeight;
}
double setWidth(double newWidth){
     return width = newWidth;
}
}
