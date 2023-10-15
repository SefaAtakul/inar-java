package week_07;

import java.util.Scanner;

public class Question_07_30 {
    public static void main(String[] args) {
        //Pattern recognition : consecutive four equal numbers
        int [] numberOfValues = getValuesFromUser();
        checkConsecutiveFour(numberOfValues);

    }
    public static int []getValuesFromUser(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of values : ");
        int numberOfValues = input.nextInt();

        int [] values = new int[numberOfValues];
        System.out.print("Enter the values : ");
        for (int i = 0; i <values.length; i++) {
            values[i] = input.nextInt() ;

        }
        return values;
    }
    public static boolean checkConsecutiveFour(int [] numberOfValues){
        int countOfConsecutive = 0;
        for (int i = 0; i < numberOfValues.length; i++) {
            for (int j = i+1; j <numberOfValues.length ; j++) {
                if (numberOfValues[i]==numberOfValues[j]){
                    countOfConsecutive++;
                }else {
                    countOfConsecutive = 0;
                   continue;
                }

            }
            if (countOfConsecutive!= 4){
                countOfConsecutive = 0;
            }else {
                System.out.print("The list has consecutive fours !");
                return true;
            }

        }
        System.out.print("The list has no consecutive fours !");
        return false;
    }
}
