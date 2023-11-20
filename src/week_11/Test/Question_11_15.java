package week_11.Test;

import java.util.Scanner;

public class Question_11_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of the points : ");
        int numberOfPoints = input.nextInt();

        double [] xOfPoints = new double[numberOfPoints];
        double [] yOfPoints = new double[numberOfPoints];

        System.out.println("Enter the coordinates : ");
        for (int i = 0; i < numberOfPoints-1; i++) {
            xOfPoints[i] = input.nextDouble();
            yOfPoints[i] = input.nextDouble();
        }
        double area = 0;
        for (int i = 0; i < numberOfPoints-1; i++) {
            area += xOfPoints[i] * yOfPoints[i + 1] - yOfPoints[i] * xOfPoints[i + 1];
        }
        area += xOfPoints[numberOfPoints - 1] * yOfPoints[0] - yOfPoints[numberOfPoints - 1] * xOfPoints[0];

        area = 0.5 * Math.abs(area);
        System.out.println("The total area is " + area);
    }
}
