package week_05;

import java.util.Scanner;

public class Question_05_09 {
    public static void main(String[] args) {
        //Find the two highest scores
        Scanner input = new Scanner(System.in);
        String nameOfStudent = "";
        int scoreOfStudent = 0;

        String nameOfHighestScoreStudent = "";
        int highestScoreIs = 0 ;
        String nameOfSecondHighestScoreStudent = "";
        int secondHighestScore = 0 ;

        System.out.print("Enter the number of students :");
        int numberOfStudents = input.nextInt();
        input.nextLine();
        System.out.println("Enter each student's name and score!");

        for (int i = 1 ; i <= numberOfStudents ;i++){
            System.out.print("Enter the name of student :");
            nameOfStudent= input.nextLine();

            System.out.print("Enter the score of student : ");
            scoreOfStudent = input.nextInt();
            input.nextLine();

            if (scoreOfStudent > highestScoreIs){
                secondHighestScore = highestScoreIs;
                nameOfSecondHighestScoreStudent = nameOfHighestScoreStudent;
                highestScoreIs = scoreOfStudent ;
                nameOfHighestScoreStudent = nameOfStudent ;
            } else if (scoreOfStudent>secondHighestScore) {
                secondHighestScore = scoreOfStudent ;
                nameOfSecondHighestScoreStudent = nameOfStudent ;

            }


        }
        System.out.printf("The highest score student with %d is %s",highestScoreIs,nameOfHighestScoreStudent);
        System.out.println("\nThe second highest score "+secondHighestScore+ "is belongs the second highest score student "+nameOfSecondHighestScoreStudent);
    }
}
