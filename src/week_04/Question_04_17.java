package week_04;

import java.util.Scanner;

public class Question_04_17 {
    public static void main(String[] args) {
        //Days of a month
        int numberOfDays = 30;
        Scanner input = new Scanner(System.in);
        //Take the year from user
        System.out.println("Enter a year : ");
        int year = input.nextInt();
        //Take the first three letter of month from user
        System.out.println("Enter a month : ");
        String month = input.next();

        //Find the leap years
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year /400 == 0 ) ;

        //Display the results
        switch (month){
            case "Jan":numberOfDays=31;break;
            case "Feb":numberOfDays=(isLeapYear)?29:28;break;
            case "Mar": numberOfDays = 31;break;
            case "Apr": numberOfDays = 30;break;
            case "May": numberOfDays = 31;break;
            case "Jun": numberOfDays = 30;break;
            case "Jul": numberOfDays = 31;break;
            case "Agu": numberOfDays = 31;break;
            case "Sep": numberOfDays = 30;break;
            case "Oct": numberOfDays = 31;break;
            case "Nov": numberOfDays = 30;break;
            case "Dec": numberOfDays = 31;break;
            default:
                System.out.println("invalid input!");
        }

        System.out.printf("%s %d has %d days", month, year, numberOfDays);

        }


    }

