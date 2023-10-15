package week_07;

import java.util.Scanner;

public class Question_07_25 {
    public static void main(String[] args) {
        //Algebra:solve the quadratic equations
        double [] coefficientsOfQuad = getQuadratic();
        double [] roots = new double[2];
        findTheRealRoots(coefficientsOfQuad,roots);
    }
    public static double[] getQuadratic (){
        Scanner input = new Scanner(System.in);
        double [] array = new double[3];
        System.out.println("Enter a,b,c : ");
        for (int i = 0; i < array.length; i++) {
            array[i]=input.nextInt();


        }
       return array;
    }
    public static void findTheRealRoots(double[] eqn,double [] roots ){
        //in coefficient array 0 is a 1 is b and 2 is c;
        //calculation of discriminants
        double discriminant = Math.pow(eqn[1],2)-(4*eqn[0]*eqn[2]);

        if (discriminant>0){
            roots[0] = (-eqn[1] + Math.sqrt(discriminant)) / 2 * eqn[0];
            roots[1] = (-eqn[1] - Math.sqrt(discriminant)) / 2 * eqn[0];
            System.out.println("The number of real roots : 2");
            System.out.println("The roots of equation : " + (int)roots[0] + " " + (int)roots[1] );
        } else if (discriminant == 0) {
            roots[0] = (-eqn[1]) / (2 * eqn[0]);
            System.out.println("The number of real root : 1");
            System.out.println("The roots of equation : " + (int)roots[0] );
        }else {
            System.out.println("The equation has no roots!");
        }


    }
}
