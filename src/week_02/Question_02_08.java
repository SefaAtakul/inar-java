package week_02;

import java.util.Scanner;

public class Question_02_08 {
    public static void main(String[]args){
        //Show current time java
        Scanner input = new Scanner (System.in) ;

        //Obtain milliseconds since midnight,Jan 1,1970
        long totalMilliseconds = System.currentTimeMillis() ;

        //Obtain total seconds since midnight,Jan 1,1970
        long totalSeconds = ( totalMilliseconds/1000 ) ;

        //Compute the current second in the minute of hour
        long currentSeconds = ( totalSeconds % 60 ) ;

        // Obtain the total minutes
        long totalMinutes = ( totalSeconds / 60 ) ;

        // Compute the current minute in the hour
        long currentMinutes = totalMinutes % 60;

        //Obtain the total hours
        long totalHours = ( totalMinutes / 60) ;

        //Compute the current hour
        long currentHours = ( (totalHours+3) % 24) ;

        //Display result
        System.out.println("Current time is  " + currentHours + ":"+ currentMinutes +":" + currentSeconds +"GMT");


    }
}
