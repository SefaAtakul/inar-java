package week_03;

import java.util.Scanner;

public class Question_03_18 {
    public static void main(String[] args) {
        //cost of shipping
        Scanner input = new Scanner(System.in);
        //Prompt the user weight of package
        System.out.println("Enter the weight of the package (in pounds ) :");
        //Get the weight from user
        double weight = input.nextDouble();
        //Display the shipping cost
        if (weight>0 && weight<1){
            System.out.println("Shipping cost of package is " + (weight * 3.5));
        } else if (1<weight && weight<3) {
            System.out.println("Shipping cost of package is " + (weight *5.5));

        } else if (3<weight && weight<10) {
            System.out.println("Shipping cost of package is " + (weight *8.5));

        } else if (10<weight && weight<20) {
            System.out.println("Shipping cost of package is " + (weight *10.5));

        }else System.out.println("The package cannot be shipped.");


    }
}
