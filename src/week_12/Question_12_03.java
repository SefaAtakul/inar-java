package week_12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_12_03 {
    public static void main(String[] args) {
        //ArrayIndexOutOfBoundException
        Scanner input = new Scanner(System.in);
        int [] integers = getRandomNumbers();
        boolean condition = true;
        while (condition) {
            System.out.print("Enter the index of the array :");
            try {
                int indexOfArray = input.nextInt();
                System.out.println("You chose : " + integers[indexOfArray]);
                condition = false ;
            } catch (InputMismatchException ex ) {
                System.out.println("Wrong input .You must enter an integer!" );
            }
            catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Out of Bounds. ! !");
            }
            input.nextLine();
        }


    }
    public static int [] getRandomNumbers( ){
        //Create an array with 100 randomly number
        int [] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array [i] = (int) (Math.random() * 101 + 1);
        }
        return array;
    }

}
