package week_11.Test;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_16 {
    public static void main(String[] args) {
        int number1 =(int)(Math.random()*10);
        int number2 =(int)(Math.random()*10);

        //Create a scanner object to get answers
        Scanner input =new Scanner(System.in);

        //Show the problem to user
        System.out.println("What is the result of ( " + number1 + " + " + number2 + " ) ?" );
        ArrayList<Integer> answers = new ArrayList<>();
        int answer = input.nextInt();
        while(number1+number2 != answer ){

            if (!answers.contains(answer)){ //ı tried at first (answer != answers.get(answers.size - 1)) but ıt criticise one possibility
                answers.add(answer);
                System.out.println("You already entered " + answer);
            }else {
                System.out.println("Wrong answer!Try again.What is ( " + number1 + " + " + number2 +" ) ?" );
            }
        }
        System.out.println("You got it !");
    }
}
