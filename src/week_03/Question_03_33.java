package week_03;

import java.util.Scanner;

public class Question_03_33 {
    public static void main(String[] args) {


    //Financial compare cost
    Scanner input = new Scanner(System.in);
    //Prompt the user Enter the two packages weights and prices
        System.out.println("Enter weight and price for package 1 : ");
    //Get first packages values
    double weight0 = input.nextDouble();
    double price0 = input.nextDouble();
        System.out.println("Enter weight and price for package 2 : ");
    double weight1 = input.nextDouble();
    double price1 = input.nextDouble();

    //Display which alternative is more logical
        if ((price0/weight0)>(price1/weight1)){
        System.out.println("Package 2 has better price.");
    } else if ((price0/weight0)==(price1/weight1)) {
        System.out.println("Two package have the same price.");

    }else {
        System.out.println("Package 1 has better price.");
    }
}
}
