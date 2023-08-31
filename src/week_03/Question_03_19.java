package week_03;

import java.util.Scanner;

public class Question_03_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Compute the perimeter of a triangle
        //prompt the user enter of three edges
        System.out.println("Enter the three edges of a triangle :" );
        //Get the three edges from user
        int edge1 = input.nextInt();
        int edge2 = input.nextInt();
        int edge3 = input.nextInt();

        //Display the result
        if (edge1+edge2>edge3 && edge1+edge3>edge2 && edge2+edge3>edge1){
            System.out.println("The perimeter is " + (edge1+edge2+edge3) );
        }else System.out.println("The input is invalid ");
    }
}
