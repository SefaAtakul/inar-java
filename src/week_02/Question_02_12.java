package week_02;

import java.util.Scanner;

public class Question_02_12 {
    public static void main(String[]args) {
        //Physics :finding runway lenght
        Scanner input = new Scanner(System.in);

        System.out.println(" Enter the value of speed and acceleration : ");

        //Formula is lenght=(v*v)/2a
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();
        double lenght = Math.pow(speed, 2) / (2 * acceleration);

        System.out.println(" The minimum runway lenght for this airplane is " + lenght);
    }
}
