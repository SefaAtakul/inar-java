package week_08;

import java.util.Scanner;

public class Question_08_12 {
    public static void main(String[] args) {
        //Financial application: compute tax
        calculateTheFinancialTaxApplication();
    }
    public static void calculateTheFinancialTaxApplication(){
        double [] rates ={0.10,0.15,0.25,0.28,0.33,0.35};

        int [][] brackets = {
                {8350, 33950, 82250, 171550, 372950}, // Single filer
                {16700, 67900, 137050, 20885, 372950}, // Married jointly
                                                        // -or qualifying widow(er)
                {8350, 33950, 68525, 104425, 186475}, // Married separately
                {11950, 45500, 117450, 190200, 372950} // Head of household
        };

        int fillingStatus=getFillingStatus();
        int taxableIncome = getTaxableIncome();
         calculateTheTax(rates,brackets,fillingStatus,taxableIncome);





    }
    public static int getFillingStatus(){
        Scanner input =new Scanner(System.in);
        System.out.print("(0-single filer , 1-married jointly or qualifying widow(er) , 2-married separately ," +
                " 3-head of household ) Enter the filling status :");
        int status = input.nextInt();
        return status;
    }
    public static int getTaxableIncome(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the taxable income :");
        int taxableIncome =input.nextInt();

        return taxableIncome;
        }

        public static double calculateTheTax(double [] rates,int [][] brackets,int fillingStatus,int taxableIncome){
       double tax = 0 ;
            for (int taxRate = 0; taxRate < brackets[fillingStatus].length; taxRate++) {
                if (taxRate==0){
                    if (taxableIncome<brackets[fillingStatus][taxRate]){
                        tax+=taxableIncome*rates[taxRate];
                        break;
                    }
                    tax += brackets[fillingStatus][taxRate] * rates[taxRate];
                }else {
                    if (taxableIncome<brackets[fillingStatus][taxRate]){
                        tax += (taxableIncome - brackets[fillingStatus][taxRate - 1]) * rates[taxRate];
                        break;
                    }
                    tax += (brackets[fillingStatus][taxRate + 1] - brackets[fillingStatus][taxRate]) * rates[taxRate];
                }

            }

                System.out.printf("Tax is $%.2f", tax);

            return tax;
        }

    }

