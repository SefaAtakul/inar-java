package week_05;

public class Question_05_04 {
    public static void main(String[] args) {
        //Conversion from miles to kilometers
        int miles = 1 ;
        System.out.println("Kilometers        Miles");


        while(miles<=10){
            double kilometers = (miles * 1.609) ;
            System.out.printf("%-8d          %.3f",miles,kilometers);
            System.out.println();
            miles++;
        }
    }
}
