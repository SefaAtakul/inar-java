package week_07;

import java.util.Scanner;

public class Question_07_13 {
    public static void main(String[] args) {
        //Random number chooser

        int [] usersInput = new int[10];
        getExculudeNumbers(usersInput);
        int getRandomNumber = getRandom(usersInput);
        System.out.println("Number generated : " + getRandomNumber);

    }
   public static int[] getExculudeNumbers(int [] userInput){
       Scanner input =new Scanner(System.in);
       System.out.println("Enter ten numbers to exclude from random :");
       for (int i = 0; i < userInput.length; i++) {
           userInput[i] = input.nextInt();
       }
       return userInput;
   }

   public static int getRandom(int...userInput){
       int randomInteger = ((int) (Math.random()*54)+1);


           for (int i = 0; i < userInput.length; i++) {
               if (randomInteger==userInput[i]){
                   randomInteger =((int) (Math.random()*54)+1);
                   break;
               }

       }
           return randomInteger;
   }
}
