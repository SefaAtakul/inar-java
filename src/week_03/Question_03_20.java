package week_03;

import java.util.Scanner;

public class Question_03_20 {
    public static void main(String[] args) {
        //Science windchill temperature
        Scanner input = new Scanner(System.in);
        //prompt the user enter temperature and wind speed
        System.out.println("Enter the temperature in Fahrenheit between -58F and 41F :");
        int temperature = input.nextInt();
        System.out.println("Enter the wind speed( >=2 ) in miles per hour ");
        int windSpeed = input.nextInt();
        double windChillTemperature = 35.74+(0.6215*temperature)+(0.4275*temperature*(Math.pow(windSpeed, 0.16)));

        //Display the result
        if (-58 < temperature && temperature< 41 && windSpeed>=2){
            System.out.println("The wind chill index is : " + windChillTemperature );
        }else System.out.println("The temperature or wind speed is invalid!");

    }
}
