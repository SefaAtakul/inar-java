package week_03;

import java.util.Scanner;

public class Question_03_11 {
    public static void main(String[] args) {
        //Fİnd the number of the days in a month
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the month as integer :");
        int month = input.nextInt();
        System.out.println("Enter the year as integer: ");
        int year = input.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            switch (month % 12) {
                case 0: System.out.println("January 31");break;
                case 1: System.out.println("February 28 ");break;
                case 2: System.out.println("March 31 ");break;
                case 3: System.out.println("April 30 ");break;
                case 4: System.out.println("May 31 ");break;
                case 5: System.out.println("June 30 ");break;
                case 6: System.out.println("July 31");break;
                case 7: System.out.println("August 31 ");break;
                case 8: System.out.println("September 30 ");break;
                case 9: System.out.println("October 31 ");break;
                case 10: System.out.println("November 30 ");break;
                case 11: System.out.println("December 31 ");
            }
        }else{
                switch (month % 12) {
                    case 0: System.out.println("January 31");break;
                    case 1: System.out.println("February 28 ");break;
                    case 2: System.out.println("March 31 ");break;
                    case 3: System.out.println("April 30 ");break;
                    case 4: System.out.println("May 31 ");break;
                    case 5: System.out.println("June 30 ");break;
                    case 6: System.out.println("July 31");break;
                    case 7: System.out.println("August 31 ");break;
                    case 8: System.out.println("September 30 ");break;
                    case 9: System.out.println("October 31 ");break;
                    case 10: System.out.println("November 30 ");break;
                    case 11: System.out.println("December 31 ");
                }
            }
        }

    }
