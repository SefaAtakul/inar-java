package week_05;

public class Question_05_27 {
    public static void main(String[] args) {
        //Display leap years
        //at first start a for leap and in for leap find the leap years with ıf block

        int count = 0 ;

        for (int year = 101 ; year <= 2100 ; year ++ ){
            if (year % 4 == 0 && year % 100 !=0 || year % 400 == 0){
                System.out.print((count % 10 == 0)?"\n"+year+ " ":year+" ");
                count++;
            }
        }
        //İf block will find the leap years and will prompt with 10 values per lines
        //For loop will execute between 101-2100
    }
}
