package week_04;

import java.util.Scanner;

public class Exercise_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        double radius = input.nextDouble();

        //Find the area of  a circle
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println(area);
        System.out.println(Math.round(area));
        System.out.println(Math.ceil(area));
        System.out.println(Math.floor(area));

    }
}
