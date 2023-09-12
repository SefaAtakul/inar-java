package week_05;

import java.util.Scanner;

public class Question_05_02 {
    public static void main(String[] args) {
        //Addition question of ten numbers
        Scanner input = new Scanner(System.in);
        long startTime = System.currentTimeMillis();
        int numberOfQuestions = 0 ;
        int correctAnswers = 0 ;
        int wrongAnswers = 0 ;
        while(numberOfQuestions<10){
            int firstNumber =(int)(Math.random()*15)+1;
            int secondNumber =(int)(Math.random()*15)+1;
            System.out.println("What is " + firstNumber + " + " + secondNumber + " ?");
            int answer = input.nextInt();
            if (answer == (firstNumber+secondNumber)){
                System.out.println("You are correct!");
                correctAnswers++;

            }else {
                System.out.println("Your answer is wrong.\n" +
                        firstNumber+" + " + secondNumber + " Should be " + (firstNumber+secondNumber));
                wrongAnswers++;

            }
            numberOfQuestions++;
        }
        long finishTime = System.currentTimeMillis();
        int testTimeİs = (int)((finishTime-startTime)/1000);

        System.out.printf("The correct number is --> %d\n"+
                "Test time is --> %d seconds ",correctAnswers,testTimeİs);

    }
}
