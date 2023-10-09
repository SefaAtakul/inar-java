package week_06;

import java.util.Scanner;

public class Question_06_37 {
    public static void main(String[] args) {
        //Format an integer
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number  : ");
        int number = input.nextInt();
        System.out.print("Enter the width : ");
        int width = input.nextInt();

        String formattedVersion = formatTheNumber(number,width);
        System.out.println("The formatted version is : " + formattedVersion);

    }
    public static String formatTheNumber(int number , int width){
        String formattedVersionIs = "";
        int lengthOfNumber = String.valueOf(number).length();
        if (width>lengthOfNumber) {
            for (int i = 0; i < width - lengthOfNumber; i++) {

                formattedVersionIs += "0";
            }
            formattedVersionIs += String.valueOf(number);

        }else {
            return String.valueOf(number);
        }

     return formattedVersionIs;
    }
}
