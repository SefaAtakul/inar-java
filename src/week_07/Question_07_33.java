package week_07;

import java.util.Scanner;

public class Question_07_33 {
    public static void main(String[] args) {
        //Simple way of Chinese Zodiac with Arrays
        String [] ChineseZodiac = {"Monkey","Rooster","Dog","Pig","Rat","Ox","Tiger","Rabbit","Dragon","Snake","Horse","Sheep"};
        getYearAndPrintZodiac(ChineseZodiac);

    }
    public static void getYearAndPrintZodiac(String [] ChineseZodiac){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a year : ");
        int year = input.nextInt();
        System.out.println(year + "is a year of " + ChineseZodiac[year % 12] + " in Zodiac !!!");
    }
}
