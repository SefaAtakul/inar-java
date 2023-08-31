package week_03;

import java.util.Scanner;

public class Question_03_13 {
    public static void main(String[] args) {
        //Personal Text Rates
        Scanner input = new Scanner(System.in);
        System.out.println("0- single filler , 1-married jointly or qualifying widow(er) , 2-married separately , 3-head of household)Enter the filing status :");

        int status = input.nextInt();
        //Get taxable amount
        System.out.println("Enter the taxable income :");
        double income = input.nextDouble();


        if (status == 0) {
            if (income <= 8350) {
                System.out.println("Tax is " + income * 0.10);
            } else if (income <= 33950)
                System.out.println("Tax is" + 8350 * 0.10 + (income - 8350 * 0.15));
            else if (income <= 82250)
                System.out.println("Tax is" + 8350 * 0.10 + (33950 - 8350 * 0.15) + (income - 33950) * 0.25);
            else if (income <= 171550)
                System.out.println("Tax is" + 8350 * 0.10 + (33950 - 8350 * 0.15) + (82250 - 33950) * 0.25 + (income - 82250) * 0.28);
            else if (income <= 372951)
                System.out.println("Tax is" + 8350 * 0.10 + (33950 - 8350 * 0.15) + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (income - 171550) * 0.33);
            else if (income > 372951)
                System.out.println("Tax is" + 8350 * 0.10 + (33950 - 8350 * 0.15) + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (income - 171550) * 0.33 + (income - 372951) * 0.35);

            if (status == 1) {
                if (income <= 16700) {
                    System.out.println("Tax is " + income * 0.10);
                }
            } else if (income <= 67900)
                System.out.println("Tax is " + 16700 * 0.10 + (income - 16700) * .15);
            else if (income <= 137050)
                System.out.println("Tax is " + 16700 * 0.10 + (67900 - 16700) * .15 + (income - 67900) * 0.25);
            else if (income <= 208850)
                System.out.println("Tax is " + 16700 * 0.10 + (67900 - 16700) * .15 + (137050 - 67900) * 0.25 + (income - 137050) * 0.28);
            else if (income <= 372950)
                System.out.println("Tax is " + 16700 * 0.10 + (67900 - 16700) * .15 + (137050 - 67900) * 0.25 + (208851 - 137050) * 0.28 + (income - 208851) * 0.33);
            else if (income > 372950)
                System.out.println("Tax is " + 16700 * 0.10 + (67900 - 16700) * .15 + (137050 - 67900) * 0.25 + (208851 - 137050) * 0.28 + (372951 - 208851) * 0.33 + (income - 372951));
        }

        if (status == 2) {
            if (income <= 8350) {
                System.out.println("Tax is " + income * 0.10);
            } else if (income <= 33950) {
                System.out.println("Tax is " + 8350 * 0.10 + (income - 8350) * 0.15);
            } else if (income <= 68525) {
                System.out.println("Tax is " + 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25);
            } else if (income <= 104425) {
                System.out.println("Tax is " + 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (income - 68525) * 0.28);
            } else if (income <= 186475) {
                System.out.println("Tax is " + 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 + (income - 104425) * 0.33);
            } else if (income > 186476) {
                System.out.println("Tax is " + 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 + (186475 - 104425) * 0.33 + (income - 186475) * 0.35);

            }

            if (status == 3) {
                if (income <= 11950) {
                    System.out.println("Tax is " + income * 0.10);
                } else if (income <= 45500) {
                    System.out.println("Tax is " + 11950 * 0.10 + (income - 11950) * 0.15);
                } else if (income <= 68525) {
                    System.out.println("Tax is " + 11950 * 0.10 + (45500 - 11950) * 0.15 + (income - 45500) * 0.25);
                } else if (income <= 104425) {
                    System.out.println("Tax is " + 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (income - 117450) * 0.28);
                } else if (income <= 186475) {
                    System.out.println("Tax is " + 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45000) * 0.25 + (190200 - 117450) * 0.28 + (income - 190200) * 0.33);
                } else if (income > 186476) {
                    System.out.println("Tax is " + 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45000) * 0.25 + (190200 - 117450) * 0.28 + (372950 - 190200) * 0.33 + (income - 372950) * 0.35);
                }

            }
        }
    }
}




