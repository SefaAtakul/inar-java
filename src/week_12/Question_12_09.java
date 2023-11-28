package week_12;

import week_12.Classes.BinaryFormatException;

import java.util.Scanner;

public class Question_12_09 {
    public static void main(String[] args) {
        //Bin2Dec with binaryException Method
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a binary number : ");

        String binary = input.nextLine();

        try {
            int decimal = binaryToDec(binary);
            System.out.println("The decimal value for binary number " + binary + " is " + decimal );
        }catch (BinaryFormatException ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
    public static int binaryToDec(String binary) throws BinaryFormatException{
        int decimal = 0;
        int exponent = 0;
        for (int i = binary.length()-1; i >= 0 ; i--) {
            char ch = binary.charAt(i);
            decimal +=  binaryCharToDec(ch,exponent);
            exponent++;
        }
        return decimal;
    }
    public static int binaryCharToDec(char ch ,int exponent) throws BinaryFormatException{
        if (ch == '1'){
            return (int) (Math.pow(2,exponent));
        } else if (ch == '0') {
            return 0;
        }else {
            throw new BinaryFormatException();
        }
    }
}
