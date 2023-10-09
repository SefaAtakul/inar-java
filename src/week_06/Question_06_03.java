package week_06;

import java.util.Scanner;

public class Question_06_03 {
    public static void main(String[] args) {
        //Palindrome integer
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer :");
        int number = input.nextInt();
        reverse(number);
        isPalindrome(number);
    }
    public static int reverse(int n){
        int remainder = 0 ;
        int reversedNum = 0;
        do {
            remainder = n % 10 ;
            reversedNum =reversedNum*10+remainder;
            n/=10;
        }while (n != 0);
        return (reversedNum);

    }

    public static boolean isPalindrome(int n){
        if (n==reverse(n)){
            System.out.print(n + " is Palindrome!");
            return (true);
        }else{
            System.out.println(n + " is not Palindrome!");
            return (false);
        }

    }
}
