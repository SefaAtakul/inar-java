package week_03;

import java.util.Scanner;

public class Question_03_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Random point
        int coordinateX = (int)(Math.random()*(100-300)+100);
        int coordinateY = (int)(Math.random()*(50-150)+50);

        System.out.println("Random coordinate in rectangle centered at (0,0) with windth 100 and height 200 :" +
                "(" + coordinateX + "," +coordinateY + ")");



    }
}
