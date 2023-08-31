package week_04;

import java.util.Scanner;

public class Question_04_21 {
    public static void main(String[] args) {
        //Check SSN "xxx-xx-xxxx"
        Scanner input = new Scanner(System.in);
        //Prompt the user "Enter a SSN
        System.out.println("Enter a SSN : ");
        String ssn = input.nextLine();
        //To determine the places of '-'
        int firstIndexOfHypen = ssn.indexOf('-');

        int lastIndexOfHypen = ssn.lastIndexOf('-');


        String firstPartOfSSN = ssn.substring(0, firstIndexOfHypen);

        String secondPartOfSSN = ssn.substring(firstIndexOfHypen+1, lastIndexOfHypen);

        String lastPartOfSSN = ssn.substring(lastIndexOfHypen+1);


        if ((ssn.length() == 11)
                && (firstPartOfSSN.length() == 3)
                && (secondPartOfSSN.length() == 2)
                && (lastPartOfSSN.length() == 4)) {


            if ((Character.isDigit(firstPartOfSSN.charAt(0))
                    && (Character.isDigit(firstPartOfSSN.charAt(1)))
                    && (Character.isDigit(firstPartOfSSN.charAt(2)))
                    && (Character.isDigit(secondPartOfSSN.charAt(0)))
                    && (Character.isDigit(secondPartOfSSN.charAt(1)))
                    && (Character.isDigit(lastPartOfSSN.charAt(0)))
                    && (Character.isDigit(lastPartOfSSN.charAt(1)))
                    && (Character.isDigit(lastPartOfSSN.charAt(2)))
                    && (Character.isDigit(lastPartOfSSN.charAt(3))))) {


                System.out.printf("%s is a valid social security number",ssn);


            } else {

                System.out.printf("%s is an invalid social security number",ssn);

            }

        } else {

            System.out.printf("%s is an invalid social security number",ssn);

        }
    }
}
