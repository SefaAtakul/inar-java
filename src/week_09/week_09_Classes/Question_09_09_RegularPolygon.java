package week_09.week_09_Classes;

public class Question_09_09_RegularPolygon {
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;
   public Question_09_09_RegularPolygon(){};

    public Question_09_09_RegularPolygon(int n,double side){
    this.n = n;
    this.side = side;
    }

    public Question_09_09_RegularPolygon(int n , double side , double x, double y){
    this.n = n;
    this.side = side;
    this.x = x;
    this.y = y;
    }
    public int getN(){
        return n;
}
    public void setN(int n){
        this.n = n;
}
    public double getSide(){
        return side;
}
    public void setSide(double side){
        this.side = side;
}
    public double getX(){
        return x;
}

    public double getY() {
        return y;
    }
    public double getPerimeter(){
        return n*side;
    }
    public double getArea(){
        return (n*Math.pow(side,2))/(4*Math.tan(Math.PI/n));
    }
}
