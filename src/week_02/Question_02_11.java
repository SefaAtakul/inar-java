package week_02;

import java.util.Scanner;

public class Question_02_11 {
    public static void main(String[]args){
        //population projection
        System.out.println("Enter the number of years : ") ;
        Scanner input = new Scanner(System.in) ;

    int numberOfYears = input.nextInt();
    int currentPopulation = 312032486 ;
    int secondsOfYears = ( numberOfYears * 365 * 24 * 60 * 60 ) ;

    //Calculating of birth,death and immigrate rates
    double birth = secondsOfYears/7.0 ;
    double death = secondsOfYears/13.0 ;
    double immigrant = secondsOfYears/45.0 ;

    System.out.println("The population in " + numberOfYears + " years " + ( currentPopulation + birth + immigrant - death)  );

    }

}
