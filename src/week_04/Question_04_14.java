package week_04;

import java.util.Scanner;

public class Question_04_14 {
    public static void main(String[] args) {
        //Covert letter grade to number
        Scanner input = new Scanner(System.in);
        //Prompt the usr "Enter a letter grade : "
        System.out.println("Enter a letter grade : ");
        //Take the letter from user
        String letter = input.next();

        int valueOfGrade = -1;

        switch(letter.charAt(0)){
            case 'A' :valueOfGrade=4;break;
            case 'B' :valueOfGrade=3;break;
            case 'C' :valueOfGrade=2;break;
            case 'D' :valueOfGrade=1;break;
            case 'F' :valueOfGrade=0;break;
            default:
                System.out.printf("%s is an invalid grade",letter);
        }
        if(valueOfGrade>=0 && valueOfGrade<=4){
            System.out.printf("The numaric value for grade %s is %d",letter,valueOfGrade);
        }


    }
}
