package week_02;

import java.util.Scanner;

public class Question_02_02 {
    public static void main(String[]args){

        Scanner input= new Scanner (System.in) ;
        /*Compute The Volume Of Cylinder
        Area = radius * radius *pi
        Volume = Area * Length
         */
        double r = input . nextDouble () ;
        double length = input . nextDouble() ;
        double pi = 3.14 ;

        System.out.println( " Enter the radius and length of a cylinder : " ) ;

        double Area = r * r * pi ;
        double volume = Area * length ;

        System.out.println( "The area is " + Area ) ;
        System.out.println( "The volume is " + volume ) ;

    }
}
