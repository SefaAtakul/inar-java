package week_06;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Question_06_36 {
    public static void main(String[] args) {
        //Geometry : area of a regular polygon
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sides : ");
        int numberOfSidesIs = input.nextInt();
        System.out.print("Enter the side length : ");
        double lengthOfSideIs = input.nextDouble();

     areaOfPolygonIs(numberOfSidesIs,lengthOfSideIs);




    }
    public static double areaOfPolygonIs(int numberOfSidesIs,double lengthOfSideIs){

        double areaOfPolygon = (numberOfSidesIs * Math.pow(lengthOfSideIs,2))/(4 * Math.tan(Math.PI/numberOfSidesIs));
        System.out.println("The area of the polygon is : " + areaOfPolygon );

        return areaOfPolygon;
    }
}
