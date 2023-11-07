package week_08;

import java.util.Scanner;

public class Question_08_30 {
    public static void main(String[] args) {
        //Algebra solve linear equations
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a00,a10,a10,a11,b0, and b1 :");
        double [][] a =new double[2][2];
        for (int row = 0; row < a.length; row++) {
            for (int column = 0; column < a[row].length; column++) {
                a[row][column]= input.nextDouble();

            }

        }

        double [] b =new double[2];
        b [0]=input.nextDouble();
        b [1]= input.nextDouble();



        linerrEquation(a,b);

    }

    public static double[] linerrEquation(double[][] a, double[] b){
       double a00 =a[0][0];
       double a01 =a[0][1];
       double a10 =a[1][0];
       double a11 =a[1][1];
       double b0=b[0];
       double b1=b[1];
       double noSolutionIS = a00*a01-a10*a11;
       if (noSolutionIS==0){
           System.out.println("The equation has no solution!");
           System.exit(0);
       }
       double [] solutions = new double[2];
       solutions[0] = (b0*a11-b1*a01) / (a00*a11 - a01*a10);
       solutions[1] = (b1*a00-b0*a10) / (a00*a11 - a01*a10);

        System.out.println("x is " + solutions[0] + " and y is " + solutions[1] );

       return solutions;
    }

}
