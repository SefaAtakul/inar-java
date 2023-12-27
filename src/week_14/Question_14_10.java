package week_14;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Stack;

public class Question_14_10 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        Stack<Integer> numbers = new Stack<>();
        System.out.println("Post fix expression : ");
        String expression = input.nextLine();
        String [] array = expression.split(" ");

        for (int i = 0; i < array.length; i++) {
            if (Character.isDigit(array[i].charAt(0))){
                numbers.push(Integer.parseInt(array[i]));
            }else {
                int b = numbers.pop();
                int a = numbers.pop();
                switch (array [i]){
                    case "+" -> numbers.push(a + b);
                    case "-" -> numbers.push(a - b);
                    case "/" -> numbers.push(a / b);
                    case "*" -> numbers.push(a * b);
                    default -> {
                        System.out.println("Wrong input!");
                        throw new RuntimeException("Wrong operator!");
                    }
                }
            }

        }
        int result = numbers.pop();
        System.out.println("Output : " + result);
        System.out.printf("Explanation : ((%s%s%s) %s %s) = %d", array[0],
                array[2], array[1], array[4], array[3], result);
    }
}
