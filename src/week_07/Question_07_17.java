package week_07;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_17 {
    public static void main(String[] args) {
        //Sort Students
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the count of students : ");
        int countOfStudents = input.nextInt();
        System.out.println("Enter the name and a score for each student : ");

        getTheNamesAndScores( countOfStudents);


    }
    public static void getTheNamesAndScores(int  countOfStudents){
        String [] nameAndScoresOfStudents = new String[ countOfStudents * 2];//for to get names and scores we multiply with 2
        int [] scoresOfStudents = new int[countOfStudents];
        Scanner input = new Scanner(System.in);
        int index = 0 ;

        for (int i = 0; i < nameAndScoresOfStudents.length; i+=2) {
            System.out.print("Student " + (index+1) + " : ");//We get first indexes names
            nameAndScoresOfStudents[i] = input.nextLine();
            System.out.print("Score : ");
            nameAndScoresOfStudents[i+1] = input.nextLine();
            scoresOfStudents[index] = Integer.parseInt(nameAndScoresOfStudents[i+1]);
            index++;
        }
        java.util.Arrays.sort(scoresOfStudents);
        printNameOfStudentsInDecreasingOrder(nameAndScoresOfStudents,scoresOfStudents);

        }
        public static void printNameOfStudentsInDecreasingOrder(String[] namesAndScoresOfStudents,int[] scoresOfStudents){
            for (int i = scoresOfStudents.length-1; i >=0 ; i--) {
                for (int j = 0; j <namesAndScoresOfStudents.length ; j+=2) {
                    if (namesAndScoresOfStudents[j+1].equals(""+scoresOfStudents[i])){
                        System.out.println(namesAndScoresOfStudents[j]);
                    }

                }

            }
        }

        }
