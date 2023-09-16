package week_05;

import java.util.Scanner;

public class Question_05_42 {
    public static void main(String[] args) {
        //Financial application : find the sales amount
        final int BASE_SALARY = 5000;

        double commissionRate = 0.08;
        double first5000CommissionRate = 0 ;
        double second5000CommissionRate = 0 ;
        double commission = 0 ;
        double salesAmount =5000 ;


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the commission sought :");
        int commissionSought = input.nextInt();

        for (int i = 0; i <= commissionSought ; i++) {
            if (salesAmount <= 5000){
                first5000CommissionRate +=salesAmount*commissionRate;

        } else if (salesAmount<=10000) {
                commissionRate = 0.10;
                second5000CommissionRate += (salesAmount - 5000) * commissionRate;

            }else {
                commissionRate =0.12;
                commission += first5000CommissionRate + second5000CommissionRate + (salesAmount - 10000) * commissionRate;
            }


        }
        if (salesAmount <= 10_000) {

            salesAmount += 5000;

        } else {

            salesAmount += 0.01;

        }

    }
}