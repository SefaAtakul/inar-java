package week_11.Test;

import week_11.Classes.MyStack;

import java.util.Collections;
import java.util.Scanner;

public class Question_11_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five strings : ");
        MyStack myStack = new MyStack();
        myStack.add(input.nextLine());
        myStack.add(input.nextLine());
        myStack.add(input.nextLine());
        myStack.add(input.nextLine());
        myStack.add(input.nextLine());
        System.out.println(myStack);
        System.out.println("Displaying them in reverse order ..");
        Collections.reverse(myStack);
        System.out.println(myStack);
    }
    }

