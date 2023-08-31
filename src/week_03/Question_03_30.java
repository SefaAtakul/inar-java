package week_03;

import java.util.Scanner;

public class Question_03_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Current Time
        System.out.println("Enter the time zone offset to GMT :");
        int GMT = input.nextInt();

        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000 ;

        long currentSecond = totalSeconds % 60 ;

        long totalMinutes = totalSeconds / 60 ;

        long currentMinutes = totalMinutes % 60 ;

        long totalHours = totalMinutes / 60 ;

        long currentHour = totalHours + GMT % 24 ;


        if (currentHour<=12){
            System.out.println("Current time is " + currentHour + " : " + currentMinutes + " : " + currentSecond + " AM");
        }else {
            System.out.println("Current time is " + currentHour % 12 + " : " + currentMinutes + " : " + currentSecond + " PM ");

        }
    }
}
