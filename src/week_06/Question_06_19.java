package week_06;

import java.util.Scanner;

public class Question_06_19 {
    public static void main(String[] args) {
        //The MyTriangle class
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the three side of triangle : ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        double area = 0 ;

        if (isValid(side1,side2,side3)){
            area = computeArea(side1,side2,side3);
            System.out.println("The area of triangle is " + area);
        }else {
            System.out.println("Invalid Input!");
        }


    }
    public static boolean isValid(double side1,double side2,double side3){
        if (side1>0 && side2>0 && side3>0){
            if (side1+side2 > side3 &&
            side1+side3 > side2 &&
            side2+side3 > side1){
                return true;
            }

            }
        return false;
        }
        public static double computeArea(double side1 , double side2 ,double side3){
            double s = (side1 + side2 + side3) / 2;

            double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
            return area;
        }

    }

