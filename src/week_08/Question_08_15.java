package week_08;

import java.util.Scanner;

public class Question_08_15 {
    public static void main(String[] args) {
        //Check the points whether they are in the same line or not
        areThePointsOnTheSameLine();

    }
    public static boolean areThePointsOnTheSameLine(){
        int [][] points = getThePoints();


return true;
    }
    public static int [][] getThePoints(){
        int [][] points = new int[5][2];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five points :");
        for (int row = 0; row < points.length; row++) {
            points[row][0]=input.nextInt();
            points[row][1]=input.nextInt();

        }
        return points;
    }

}
