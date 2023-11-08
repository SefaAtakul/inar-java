package week_10.Test;

import week_10.Classes.PrimeFactors;

public class Question_10_06 {
    public static void main(String[] args) {
        //Prime numbers
        PrimeFactors stackOfIntegers = new PrimeFactors(120);
        for (int i = 2; i < 120; i++) {
            if (isPrime(i)) {
                stackOfIntegers.push(i);
            }
        }
        while (!stackOfIntegers.empty()) {
            System.out.print(stackOfIntegers.pop() + " ");
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
