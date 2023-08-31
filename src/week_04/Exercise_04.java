package week_04;

import java.util.Scanner;

public class Exercise_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min,mid,max ;
        //Prompt the user Enter three number
        System.out.println("Enter three number");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        int intTempMax =Math.max(num1,num2);
        max =Math.max(intTempMax,num3);

        int intTempMin =Math.min(num1,num2);
        min =Math.max(intTempMax,num3);


        System.out.printf("The numbers are %d,%d,%d \n",num1,num2,num3);
        System.out.printf("The max number is %d",max);

    }
}
