package week_06;

public class Question_06_16 {
    public static void main(String[] args) {
        //number of the days in a year
        printTableOfDaysInYears();
    }
    public static void printTableOfDaysInYears(){
        System.out.printf("%-10s%-15s","Year","Days in year");
        for (int i = 1999; i <= 2020 ; i++) {
            System.out.printf("%-4d%-10s%-3d\n",i," ",numberOfDaysInAYear(i));

        }

    }
    public static int numberOfDaysInAYear(int year){
        if (isLeapYear(year)){
            return 366 ;
        }else {
            return 365;
        }
    }

    public static boolean isLeapYear(int year){
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
            return true;
        }else {
            return false;
        }
    }
}
