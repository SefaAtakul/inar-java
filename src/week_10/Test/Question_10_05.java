package week_10.Test;

import week_10.Classes.PrimeFactors;

import java.util.Scanner;

public class Question_10_05 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a positive integer : ");
        int positiveInteger = input.nextInt();
        PrimeFactors primeFactors = new PrimeFactors(positiveInteger);
        for (int i = 2; i <= positiveInteger ; i++) {
            if (isPrime(i) && positiveInteger % i == 0){
                positiveInteger = positiveInteger / i ;
                primeFactors.push(i);
                i--;
            }
        }
        printIncreasingOrder(primeFactors);
        System.out.println();
        printDecraesingOrder(primeFactors);

        }
        public static boolean isPrime(int positiveInteger){
            for (int i = 2; i <Math.sqrt(positiveInteger) ; i++) {
                if (positiveInteger % i == 0){
                    return false;
                }

            }
            return true;
        }
        public static void printIncreasingOrder(PrimeFactors primeFactors){
            System.out.print("Increased order : ");
            for (int i = 0; i < primeFactors.getSize(); i++) {
                System.out.print(primeFactors.getPrimeFactors()[i]+" ");

            }
        }
        public static void  printDecraesingOrder(PrimeFactors primeFactors){
            System.out.print("Decreasing order : ");
            while (!primeFactors.empty()){
                System.out.print(primeFactors.pop()+" ");
            }
        }
}
