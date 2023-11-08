package week_10.Test;

import week_10.Classes.MyInteger;

public class Question_10_03 {
    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(41614161);
        System.out.println("getValue() :" + myInteger.getValue());
        System.out.println("isEven() :" + myInteger.isEven());
        System.out.println("isOdd() : " + myInteger.isOdd());
        System.out.println("isPrime() :" + myInteger.isPrime());
        System.out.println("equals(124) :" + myInteger.equals(124));
        System.out.println("equals(MyInteger(41614161)) : " + myInteger.equals(new MyInteger(41614161)));
        System.out.println("isEven(41614161) static : " + MyInteger.isEven(41614161));
        System.out.println("isOdd(41614161) static : " + MyInteger.isOdd(41614161));
        System.out.println("isPrime(41614161) static : " + MyInteger.isPrime(41614161));
        System.out.println("parseInt(char[]{1, 5, 7}) static : " + MyInteger.parseInt(new char[]{'1','5','7'}));
        System.out.println("parseInt(String 157) static : " + MyInteger.parseInt("157"));
    }
}
