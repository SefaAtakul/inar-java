package week_06;

import java.util.Scanner;

public class Question_06_05 {
    public static void main(String[] args) {
        //Sort three numbers
        Scanner input =new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        displaySortedNumbers(number1 ,number2 , number3);
    }
    public static void displaySortedNumbers(double num1 ,double num2 , double num3){
        double max = Math.max(Math.max(num1,num2),num3);

        double min = Math.min(Math.min(num1,num2),num3);

        double mid = (num1+num2+num3)-(max+min);

        System.out.print(min + " " + mid + " " + max );
    }
}
