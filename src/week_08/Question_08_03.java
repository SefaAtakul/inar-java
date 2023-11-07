package week_08;

import java.util.Scanner;

public class Question_08_03 {
    public static void main(String[] args) {
        //Multiple-choice test
        char [][] studentsAnswers = getAnswersFromUser();
        char [] answerKey = getTheKey();
        int[] examResults = getExamResults(studentsAnswers, answerKey);
        printResultsInIncreasingOrder(examResults);

    }
    public static char [][] getAnswersFromUser(){
        char [][] studentsAnswers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
        return studentsAnswers;

    }
    public static char [] getTheKey (){
        char [] key =  {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        return key;
    }

    public static int [] getExamResults(char [][] studentAnswers,char []answerKey){
        int [] result = new int[8];
        for (int student = 0; student <studentAnswers.length ; student++) {
            int countOfTrueQuestionsForStudent = 0 ;
            for (int answers = 0; answers <studentAnswers[student].length ; answers++) {
                if (studentAnswers[student][answers]==answerKey[answers]){
                    countOfTrueQuestionsForStudent++;
                }

            }
            result[student]=countOfTrueQuestionsForStudent;
        }
        return result;
    }

    public static void printResultsInIncreasingOrder(int[] examResults){
        int [] students = {0,1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < examResults.length-1; i++) {
            int currentMin = examResults[i];
            int currentMinIndex = i;
            int studentMin = students[i];

            for (int j = i+1; j <examResults.length ; j++) {
                if (currentMin>examResults[j]){
                    currentMin=examResults[j];
                    currentMinIndex=j;
                    studentMin = students[j];
                }

            }
            if (currentMinIndex != i){
                examResults[currentMinIndex]=examResults[i];
                examResults[i]=currentMin;
                students[currentMinIndex]=studentMin;
                students[i]=studentMin;
            }


        }
        for (int i = 0; i < examResults.length; i++) {
            System.out.println("Student " + students[i] + "'s correct count is " + examResults[i]);
        }
    }
}
