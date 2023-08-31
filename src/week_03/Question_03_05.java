package week_03;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Question_03_05 {
    public static void main(String[]args){
        //Find future dates
        Scanner input =new Scanner(System.in);
        //Prompt the user enter the day of week as digit
        System.out.println("Enter today's day as digit (0 for Sunday....6 for Saturday) : ");
        int today =input.nextInt();
        //Prompt the user How many days passed from today?
        System.out.println("Enter the number of days elapsed since today : ");
        int elapsedDays = input.nextInt();
        int futureDayIs = (today + elapsedDays) % 7 ;
        switch (futureDayIs) {
            case 0 :
                System.out.println("Today is "+ today + " and the future day is Sunday " );break;
            case 1 :
                System.out.println("Today is "+ today + " and the future day is Monday "  );break;
            case 2 :
                System.out.println("Today is "+ today + " and the future day is Tuesday "  );break;
            case 3 :
                System.out.println("Today is "+ today + " and the future day is Wednesday "  );break;
            case 4 :
                System.out.println("Today is "+ today + " and the future day is Thursday "  );break;
            case 5 :
                System.out.println("Today is "+ today + " and the future day is Friday "  );break;
            case 6 :
                System.out.println("Today is "+ today + " and the future day is Saturday "  );
        }

    }
}
