package week_02;

import java.util.Scanner;

public class Question_02_14 {
    public static void main (String[]args){
        //Health application : Computing BMA"Body mass index
        Scanner input = new Scanner(System.in) ;
        System.out.println( " Enter weight in pounds : " );
        System.out.println( " Enter height in inches :" ) ;
        double weight = input.nextDouble();
        double height = input.nextDouble();
        double BMI = ( weight * 0.4535923 ) / ( Math.pow( height * 0.0254, 2 ));

        System.out.println("BMI is " + BMI ) ;

    }
}
