package week_07;

import java.util.Scanner;

public class Question_07_14 {
    public static void main(String[] args) {
        int [] numbers = getNumbers();
        int gcdOfNumbers = findTheGcd(numbers);
        System.out.print("The Greatest common divisor is : " + gcdOfNumbers);


    }
    public static int []getNumbers(){
        int [] numbers = new int [5];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five numbers :");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=input.nextInt();
        }
        return numbers;
    }
    public static int findTheGcd(int...numbers){
        int minimumNum = min(numbers);
        int gcd = 1 ;
        boolean isGcd ;
        for (int i = 2; i <minimumNum ; i++) {
            isGcd = true ;
            for (int number : numbers){
                if (number % i != 0){
                    isGcd = false ;
                    break;
                }

        }
            if (isGcd){
                gcd=i;
            }
        }
        return gcd;

    }

    public static int min(int...numbers){
        int min = numbers[0];
        for (int number : numbers) {
            if (min>number){
                min = number ;
            }
        }
        return min;
    }
}
