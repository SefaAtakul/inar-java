package week_03;

import java.util.Scanner;

public class Question_03_08 {
    public static void main(String[]args){
        //Sort three integers
        Scanner input = new Scanner(System.in);
        //Prompt user to enter three integers
        System.out.println("Enter 3 integers : ") ;
        int integer1 = input.nextInt();
        int integer2 = input.nextInt();
        int integer3 = input.nextInt();

        if ( integer1 > integer2 && integer2 > integer3 ){
            System.out.println(integer1+ " " + integer2 +" " +integer3);
        } else if (integer1 > integer2 && integer1 < integer3 ) {
            System.out.println(integer3 + " " + integer1 + " " + integer2);
        } else if (integer1 < integer2 && integer1 > integer3) {
            System.out.println(integer2 + " " + integer1 + " " + integer3);
        } else if (integer1 > integer3 && integer3 > integer2) {
            System.out.println(integer1 + " " + integer3 + " " + integer2 );
        } else if (integer2 > integer3 && integer3 > integer1) {
            System.out.println(integer2 + " " + integer3 + " " + integer1);
        } else if (integer3 > integer2 && integer2 > integer1) {
            System.out.println(integer3 + " " + integer2 + " " + integer1);

        }


    }
}
