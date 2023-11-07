package week_09.week_09_Classes;

import javax.xml.stream.Location;

public class Question_09_13_Location {

    private int row;
    private int column;
    private double maxValue;
    public Question_09_13_Location(int row, int column, double maxValue){
        this.row=row;
        this.column=column;
        this.maxValue=maxValue;

    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public double getMaxValue() {
        return maxValue;
    }

    public static Location locateLargest(double[][] array){
        int rowMax=0;
        int colMax=0;
        double maxValue=array[0][0];
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if(array[row][col]>maxValue){
                    maxValue=array[row][col];
                    rowMax=row;
                    colMax=col;
                }
            }
        }
        return (Location) new Question_09_13_Location(rowMax,colMax,maxValue);
    }
}

