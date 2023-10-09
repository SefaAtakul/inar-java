package week_06;

import java.util.Scanner;

public class Question_06_06 {
    public static void main(String[] args) {
        //Display patterns
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer for us,please :");
        int number = input.nextInt();
        displayPattern(number);
    }

    public static void displayPattern(int n){
        for(int i=1;i<=n*(n-1);i++){
            for(int j=1;j<=((n*n-1)-i);j++){
                System.out.print("   ");
            }
            for (int l =i;l>=1;l--){
                System.out.print(" "+l+" ");
            }
            System.out.println();
        }
        return;
    }
}
