package week_03;

import com.sun.source.doctree.SystemPropertyTree;

import java.util.Scanner;

public class Question_03_09 {
    public static void main(String[]args){
        //Business : check ISBN-10 (International Standard book number
        Scanner input = new Scanner(System.in);
        //prompt the user Enter the first digits of ISBN
        System.out.println("Enter the first 9 digits of an ISBN as integer :");
        int isbn = input.nextInt();
        int d1 = isbn % 10 ;
        int remaining = isbn / 10 ;
        int d2 = remaining % 10 ;
        int remaining1 = remaining / 10 ;
        int d3 = remaining1 % 10 ;
        int remaining2 =remaining1 / 10 ;
        int d4 = remaining2 % 10 ;
        int remaining3 = remaining2 / 10 ;
        int d5 = remaining3 % 10 ;
        int remaining4 = remaining3 / 10 ;
        int d6 = remaining4 % 10 ;
        int remaining5 = remaining4 /10 ;
        int d7 = remaining5 % 10 ;
        int remaining6 = remaining5 / 6 ;
        int d8 = remaining6 % 10 ;
        int remaining7 = remaining6 / 10 ;
        int d9 = remaining7 % 10 ;

        System.out.println(d1+ " "+ d2 + "" + d3+" " + d4);




    }
}
