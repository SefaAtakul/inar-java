package week_04;

import java.util.Scanner;

public class Question_04_23 {
    public static void main(String[] args) {
        //Financial application : payroll
        Scanner input =new Scanner(System.in);
        //Get informations from user
        System.out.print("Enter employee's name :");
        String employeeName = input.nextLine();

        System.out.print("Enter number of hours worked in a week : ");
        double numberOfHours = input.nextDouble();

        System.out.print("Enter hourly pay rate : ");
        double hourlyPayRate = input.nextDouble();;

        System.out.print("Enter federal tax withholding rate : ");
        double federalTaxRate = input.nextDouble();

        System.out.print("Enter state tax withholding rate : ");
        double stateTaxRate = input.nextDouble();

        //note the usefulness of setting variables here
        double grossPay = hourlyPayRate * numberOfHours;
        double fedWithholding = grossPay * federalTaxRate;
        double stateWithholding = grossPay * stateTaxRate;
        double totalDeduction = fedWithholding + stateWithholding;
        double netPay = grossPay - totalDeduction;

        System.out.printf("Employee's Name : %s\n"+
                           "Hours Worked : %.1f\n"+
                           "Pay Rate : $%4.2f\n"+
                            "Gross Pay : $%3.1f\n"+
                            "Deduction : \n"+
                            "       Federal withholding (%3.1f%%) : $%4.2f\n"+
                            "       State Withholding (%3.1f%%) : $%4.2f\n"+
                            "   Total Deduction : $%4.2f\n" +
                        "Net Pay : $%4.2f", employeeName, numberOfHours,
                hourlyPayRate, grossPay, (int) (federalTaxRate * 100) / 1.0, fedWithholding,
                (int) (stateTaxRate * 100) / 1.0, stateWithholding, totalDeduction, netPay);

    }
}
