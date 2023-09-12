package week_05;

import java.util.Scanner;

public class Question_05_08 {
    public static void main(String[] args) {
        //Find the highest score
        Scanner input =new Scanner(System.in);
        int number = 1 ;
        int studentNumber =0;
        String nameOfStudents = "";
        int highestScore = 0 ;
        String nameOfHighestStudent ="";

        System.out.print("Enter the number of students = ");
        int numberOfStudents = input.nextInt();
        input.nextLine();

        System.out.println("Enter each student's name's and score ");

        while(number<=numberOfStudents){
            System.out.print("Student Order :");
            studentNumber = input.nextInt();
            input.nextLine();

            System.out.print("Name :");
            nameOfStudents =input.nextLine();

            System.out.print("Score :");
            int score = input.nextInt();
            input.nextLine();

            number++;

            if (score>highestScore){
                highestScore=score;
                nameOfHighestStudent=nameOfStudents;
            }


        }
        System.out.printf("%s with %d score is the highest score student!",nameOfHighestStudent,highestScore);
    }
}
