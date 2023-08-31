package week_04;

import java.util.Scanner;

public class Question_04_11 {
    public static void main(String[] args) {
        //Decimal to hex
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal value (0 to 15) : ");
        int decimal = input.nextInt();

        if (0<=decimal && decimal<=9){
            System.out.printf("The hex value is : %d",decimal);
        } else if (decimal == 10) {
            System.out.printf("The hex value is : A");
            
        } else if (decimal == 11) {
            System.out.printf("The hex value is : B");

        } else if (decimal == 12) {
            System.out.printf("The hex value is : C");

        } else if (decimal == 13) {
            System.out.printf("The hex value is : D");

        } else if (decimal == 14 ) {
            System.out.printf("The hex value is : E" );

        } else if (decimal == 15 ) {
            System.out.printf("The hex value is: F ");

        }else {
            System.out.println("The invalid input!");
        }

    }
}
