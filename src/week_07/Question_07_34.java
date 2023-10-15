package week_07;


import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Question_07_34 {
    public static void main(String[] args) {
        //Sort characters in a string
        char [] newStr = getTheStringFromUser();
       sortNewString(newStr);

        System.out.print(Arrays.toString(newStr));


    }
    public static char [] getTheStringFromUser(){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a string to sort : ");
        String newInput = input.nextLine();
        newInput = newInput.toLowerCase(Locale.ROOT);


        char [] newStr = new char[newInput.length()];
        //we will assign the value of string to array with CharAt Method in a loop
        for (int i = 0; i < newStr.length; i++) {
            newStr[i] = newInput.charAt(i);

        }
        return newStr;
    }
    public static String [] sortNewString (char [] newStr){
        //in a loop we will compare all the chars digit values and change the indexes of them in order
       char temp = 0;
        for (int i = 0; i < newStr.length; i++) {
        int i1 = newStr[i];
            for (int j =i + 1; j < newStr.length ; j++) {
                int i2 = newStr[j];
                if (i1 > i2 ){
                    temp =  newStr[j];
                    newStr[j]=newStr[i];
                    newStr[i]=temp;
                    
                }
              temp = 0;
            }

        }
        String [] newString = new String[newStr.length];
        for (int i = 0; i < newStr.length; i++) {
            newString[i]=Character.toString(newStr[i]);

        }
        return newString;

    }

}
