package week_02;

import java.util.Scanner;

public class Question_02_16 {public static void main(String[]args){
    //Geometry side of a hexagon
    Scanner input = new Scanner(System.in) ;
    System.out.println("Enter the side : ") ;
    double side = input.nextDouble();

    //Formula of hexagon
    double areaOfHexagon = ( ( 3 * Math.pow ( 3, 0.5 ) ) / 2 ) * Math.pow(side, 2) ;


    System.out.println("The area of hexagon is : " +(double)((int) (areaOfHexagon *  10000) )/10000 ) ;

    }
}
