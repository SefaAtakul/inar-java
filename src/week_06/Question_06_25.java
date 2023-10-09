package week_06;

import java.util.Scanner;

public class Question_06_25 {
    public static void main(String[] args) {


        //Convert milliseconds to hours,minutes,and seconds
        Scanner input = new Scanner(System.in);
        System.out.println("Enter milliseconds : ");
        long milliSecondsAre = input.nextLong();

        covertMillis(milliSecondsAre);

    }
    public static String covertMillis(long millisSecondsAre){
        String hoursMinutesSeconds ="";

        long totalSeconds = millisSecondsAre / 1000 ;
        long currentSeconds = totalSeconds % 60 ;
        String seconds = String.valueOf(currentSeconds);



        long totalMinutes = totalSeconds / 60 ;
        long currentMinutes = totalMinutes % 60 ;
        String minutes = String.valueOf(currentMinutes);


        long totalHours = totalMinutes / 60 ;
        long currentHours = totalHours % 24 ;
        String hours = String.valueOf(currentHours);

        hoursMinutesSeconds+=hours+":"+minutes+":"+seconds;


        System.out.printf("hours:minutes:seconds: %s",hoursMinutesSeconds);
        return hoursMinutesSeconds;
    }

}
