package week_02;

import java.util.Scanner;

public class Question_02_23 {
    public static void main (String[]args){
        //Cost of driving
        Scanner input = new Scanner(System.in) ;
        System.out.println( " Enter the driving distance : " ) ;
        System.out.println( " Enter miles per gallon : " ) ;
        System.out.println( " Enter price per gallon : " ) ;

        double drivingDistance = input.nextDouble() ;
        double milesPerGallon = input.nextDouble() ;
        double pricePerGallon = input.nextDouble() ;

        //Calculation of costOfDriving
        double costOfDriving =( drivingDistance / milesPerGallon ) * pricePerGallon ;

        System.out.println("The cost of driving is : " +(int) (costOfDriving * 100)/100.0 );



    }
}
