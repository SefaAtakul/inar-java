package week_08;

import java.util.Scanner;

public class Question_08_11 {
    public static void main(String[] args) {
        //Game:nine heads and tails
        gameHeadsAndTails();
    }
    public static void gameHeadsAndTails(){
        int number = getNumber();
        String binaryValue = findTheBinaryValueOfNumber(number);
        //String binaryValue =Integer.toBinaryString(number);
        printHeadsAndTails(binaryValue);
    }
    public static int getNumber(){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a number between 0 and 511 : ");
        int number = input.nextInt();
        return number;
    }
    public static String findTheBinaryValueOfNumber(int number){
    int [] numberIs = new int[9];
        String binaryValue ="";
        while (number>0){
            int bit = number % 2 ;
            binaryValue+=bit+binaryValue;
            number/=2;

        }
        for (int i =numberIs.length ; i >0 ; i--) {
            for (int j = binaryValue.length(); j >0 ; j--) {
                if (binaryValue.charAt(j)==1);{

                }


            }

        }
        return binaryValue;


    }
    public static void printHeadsAndTails( String binaryValue){
        char [][] array =new char[3][3];
        int ch =0;
        for (int row = 0; row < array.length; row++) {

            for (int column = 0; column < array[0].length; column++) {
                if (binaryValue.charAt(ch)==0) {
                    array[row][column] = 'H';
                }else {
                    array[row][column] = 'T';
                }
                ch++;
            }
            ch=(row+1)*3;

        }
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array.length; column++) {
                System.out.print(array[row][column]+ " ");

            }
            System.out.println();

        }
    }

}
