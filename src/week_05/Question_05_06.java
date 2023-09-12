package week_05;

public class Question_05_06 {
    public static void main(String[] args) {
        //Conversion from miles to kilometers
        int miles = 1 ;
        double milesToKilometers ;

        int kilometers = 20 ;
        double kilometersToMiles ;

        System.out.println("Miles     Kilometers    " + "   |   Kilometers         Miles ");

        for (miles = 1 ; miles <=10 ; miles++){
            milesToKilometers = miles * 1.609 ;
            kilometersToMiles = kilometers/1.609 ;
            System.out.printf("%-5d      %-10.3f      |"+
                    "   %-10d         %5.3f\n",miles,milesToKilometers,kilometers,kilometersToMiles);

            kilometers=kilometers+5;
        }



    }
}
