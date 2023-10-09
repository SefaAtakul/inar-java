package week_07;


import java.util.Arrays;
import java.util.Scanner;

public class Question_07_19 {
    public static void main(String[] args) {
        //If is the list already sorted return true!
        getTheNumbersFromUser();


    }
    public static int [] getTheNumbersFromUser(){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the numbers : " );
        int countOfNumbers = input.nextInt();
        int [] listOfNumbers = new int[countOfNumbers];
        for (int i = 0; i < listOfNumbers.length; i++) {
            listOfNumbers[i]= input.nextInt();

        }
        controlTheNumbersOrder(listOfNumbers);
        return listOfNumbers;
    }
public static boolean controlTheNumbersOrder( int [] listOfNumbers){
    for (int i = 0; i < listOfNumbers.length; i++) {
        for (int j = i + 1; j <listOfNumbers.length ; j++) {
            if (listOfNumbers[i]>listOfNumbers[j]){
                System.out.print("The list is not sorted!");
                return false;
            }

        }

    }
    System.out.print("The list of numbers is sorted!");
    return true ;
}
}
