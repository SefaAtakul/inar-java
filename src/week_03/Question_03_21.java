package week_03;

import javax.print.attribute.standard.MediaSize;
import java.util.Scanner;

public class Question_03_21 {
    public static void main(String[] args) {
        //Science: Day of the week
        Scanner input = new Scanner(System.in);
        //Prompt the user Enter the year,month and the day
        System.out.println("Enter the year :");
        int year = input.nextInt();
        System.out.println("Enter month 1-12 :");
        int month = input.nextInt();
        System.out.println("Enter the day of the month (1-31):");
        int day = input.nextInt();
        //Find the century of year
        int yearOfCentury = year % 100 ;
        //Find the century
        int century = year/100 ;
        //Find the day of the week
        int dayOfTheWeek = (day+(26*(month+1)/10)+yearOfCentury+(yearOfCentury/4)+(century/4)+5*century)%7;
        System.out.println(dayOfTheWeek);
        //Display the result
        switch(dayOfTheWeek){
            case 0 : System.out.println("Day of the week is Saturday");break;
            case 1 : System.out.println("Day of the week is Sunday");break;
            case 2 : System.out.println("Day of the week is Monday");break;
            case 3 : System.out.println("Day of the week is Tuesday");break;
            case 4 : System.out.println("Day of the week is Wednesday");break;
            case 5 : System.out.println("Day of the week is Thursday");break;
            case 6 : System.out.println("Day of the week is Friday");


        }

    }
}
