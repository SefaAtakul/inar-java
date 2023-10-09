package week_06;

import java.util.Scanner;

public class Question_06_24 {
    public static void main(String[] args) {
        //Current time and date
        printDateAndTime();
    }
    public static void printDateAndTime(){

    }
    public static void printTime(){
        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000 ;

        long currentSeconds = totalSeconds % 60 ;

        long totalMinutes = currentSeconds / 60 ;

        long currentMinutes = totalMinutes % 60 ;

        long totalHours = currentMinutes / 60 ;

        long currentHours = (totalHours + 3) % 24 ;
        System.out.printf("%d%d%d ",currentHours,currentMinutes,currentSeconds);
    }


    }










