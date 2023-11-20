package week_11.Classes;

public class GeometricObject  {
    private String color ;
    private boolean isFilled;

    public GeometricObject(){
        this.color = "White";
        this.isFilled = false ;
    }
    public GeometricObject(String color, boolean isFilled){
        this.color = color ;
        this.isFilled = isFilled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean getIsFilled(){
        return isFilled;
    }
    public void setFilled(boolean isFilled){
        this.isFilled =isFilled;
    }
    public String toString(){
        return "Color :" + this.color +
                "Triangle is : " +  ((isFilled) ? "" : "not ") + "filled.";
    }


}
