package week_03;

import java.util.Scanner;

public class Question_03_23 {
    public static void main(String[] args) {
        //Geometry:Point in a rectangle
        Scanner input =new Scanner(System.in);
        //Prompt the user enter x and y of a point
        System.out.println("Enter a point with two coordinates :");
        //Take the points from user
        int x = input.nextInt();
        int y = input.nextInt();

        //Display the result
        if((-5<=x && x <=5) && (-2.5<=y && y<=2.5)){
            System.out.println("Point ( " + x + "," + y + " ) is in the rectangle");
        }else System.out.println("Point ( " + x + "," + y + " ) is not in the rectangle");

    }
}
