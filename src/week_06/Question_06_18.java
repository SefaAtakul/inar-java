package week_06;

import javax.swing.*;
import java.util.Scanner;

public class Question_06_18 {
    public static void main(String[] args) {
        //Check password
        //a password must have at least eight characters
        //a password consists of only letters and digits
        //a password must contain at least two digits

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a password :");
        String password = input.nextLine();



        checkPassword(password);
    }

    public static void checkPassword(String password) {
        if (controlLength(password)
                && controlIfConsistOfLettersAndDigits(password)
                && controlDigitNumber(password)) {
            System.out.print("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
    public static boolean controlLength(String password){
        if (password.length()>=8){
            return true;
        }else {
            return false;
        }
    }

    public static boolean controlIfConsistOfLettersAndDigits(String password){
        for (int i = 0; i < password.length(); i++) {
            if (!(Character.isDigit(password.charAt(i)) ||
                    Character.isLetter(password.charAt(i)))) {
                return false;
            }
        }
        return true;
    }


    public static boolean controlDigitNumber(String password){
        int numberOfDigits = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))){
                numberOfDigits++;
            }

        }
        if (numberOfDigits>=2){
            return true;
        }else {
            return false;
        }
    }
}
