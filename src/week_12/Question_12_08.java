package week_12;

import week_12.Classes.Hex2DecException;

import java.util.Scanner;

public class Question_12_08 {
    public static void main(String[] args) {
        //HexToDec Exception
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a hex number : " );
        String hex = input.nextLine();

        try{
            int decimal = hex2Dec(hex);
            System.out.println("The decimal value for hex number " + hex + " is " + decimal);
        }catch (Hex2DecException ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
    public static int hex2Dec(String hex) throws Hex2DecException{
        int decimal = 0;
        for (int i = 0; i < hex.length(); i++) {
            char ch = hex.charAt(i);
            decimal = decimal * 16 + hexCharToDec(ch);
        }
        return decimal;
    }
    public static int hexCharToDec(char ch) throws Hex2DecException{
        if (ch >= 'A' && ch <= 'F'){
            return 10 + ch - 'A';
        } else if (Character.isDigit(ch)) {
            return ch - '0';
        }else {
            throw new Hex2DecException();
        }
    }
}
