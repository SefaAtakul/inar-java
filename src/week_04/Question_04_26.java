package week_04;

import java.util.Scanner;

public class Question_04_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int remainingnewAmount ;
        //Prompt the user "Enter the amount in dollars and cents: "
        System.out.println("Enter the amount in dollars and cents: ");
        //Get amount from user
        String dollars = input.next();
        double amount = Double.parseDouble(dollars);
        int newAmount =(int) (amount * 100) ;

        int dollar = newAmount /100 ;
        System.out.println("Dollars :" + dollar);

        remainingnewAmount = newAmount % 100 ;
        int quarters = remainingnewAmount / 25 ;
        System.out.println(" Quarters :" + quarters);

        remainingnewAmount = remainingnewAmount %25 ;
        int dimes = remainingnewAmount /10 ;
        System.out.println(" Dimes :" + dimes);

        remainingnewAmount =remainingnewAmount % 10 ;
        int nickels = remainingnewAmount /5 ;
        System.out.println(" Nickles :" + nickels);

        remainingnewAmount = remainingnewAmount % 5 ;
        System.out.println(" Pennies :" + remainingnewAmount );





    }
}
