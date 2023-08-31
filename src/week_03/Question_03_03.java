package week_03;

import java.util.Scanner;

public class Question_03_03 {
    public static void main (String[]args){
        //Algebra:solve 2*2
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter a, b, c, d, e, f : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();


        /*ax + by = e  and  cx + by = d and x = (ed-bc)/(ad-bc) and  y=(ad-ec)/(ad-bc) */
        double dividing = (a*d-b*c);
        double x = (e*d-b*c)/(a*d-b*c);
        double y = (a*d-e*c)/(a*d-b*c);

        if (dividing==0) {
            System.out.println("The equation has no solution ");
        }
        else{
            System.out.println("x is " + x + "y is " + y );
        }
    }
}
