package week_05;

import java.util.Scanner;

public class Question_05_03 {
    public static void main(String[] args) {
        //Conversion from kilograms to pounds
        System.out.println("Kilograms          Pounds");
        int kilograms = 1 ;


        for (kilograms = 1; kilograms <= 199;kilograms++,kilograms++ ){
            double pounds = (kilograms * 2.2);

            System.out.println(kilograms+  "                  " + (double)(int)(pounds*10)/10);
        }
    }
}
