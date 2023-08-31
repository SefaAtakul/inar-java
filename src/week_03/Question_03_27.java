package week_03;

import java.util.Scanner;

public class Question_03_27 {
    public static void main(String[] args) {
        //Geometry : Points in triangle
        Scanner input = new Scanner(System.in);
        //Prompt the user enter 2 points
        System.out.println("Enter a point's x- and y-coordinates : ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        //Check the point isn in rectangle or not
        boolean withinRec = (Math.pow(Math.pow(x, 2), 0.5)<=200                                                                                                              && Math.pow(Math.pow(y, 2), 0.5)<=100);

        //Display the result
        if (withinRec=true){
            System.out.println("Point ("+ x + ","+ y + ") is in the Rectangle");
        }else {
            System.out.println("Point (" + x + "," + y + ") is  notin the Rectangle");
        }


    }
}
