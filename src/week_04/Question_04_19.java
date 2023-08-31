package week_04;

import java.util.Scanner;

public class Question_04_19 {
    public static void main(String[] args) {
        //Business: check ISBN-10
        Scanner input = new Scanner(System.in);
        //Prompt the user "Enter the first 9 digits of an ISBN as integer :"
        System.out.println("Enter the first 9 digits of an ISBN as integer : ");
        String nineDigitOfIsbn = input.next();


        if (nineDigitOfIsbn.length() != 9) {

            System.out.println("invalid input!");
            System.exit(1);

        }

        //Separate tne number and find the 10 number of Isbn
        int firstNumber = nineDigitOfIsbn.charAt(8);
        int secondNumber = nineDigitOfIsbn.charAt(7);
        int thirdNumber = nineDigitOfIsbn.charAt(6);
        int fourthNumber = nineDigitOfIsbn.charAt(5);
        int fifthNumber = nineDigitOfIsbn.charAt(4);
        int sixthNumber = nineDigitOfIsbn.charAt(3);
        int seventhNumber = nineDigitOfIsbn.charAt(2);
        int eighthNumber = nineDigitOfIsbn.charAt(1);
        int ninthNumber = nineDigitOfIsbn.charAt(0);
        //find the 10th number of ISBN
        int tenthNumber = ((firstNumber*1)+(secondNumber*2)+(thirdNumber*3)+(fourthNumber*4)+(fifthNumber*5)+(sixthNumber*6)+(seventhNumber*7)+(eighthNumber*8)+(ninthNumber*9))%11;
        if (tenthNumber%10==0){
            System.out.printf("The ISBN-10 number is %s%c",nineDigitOfIsbn,'X');
        }else {
            System.out.printf("The ISBN-10 number is %s%d",nineDigitOfIsbn,tenthNumber);

    }
}
}
