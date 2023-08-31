package week_04;

import java.util.Scanner;

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String s = input.next();
        String name = input.next();
        String surname = input.next();
        System.out.printf("The name and surname is : %s %s",name,surname);
        System.out.printf("The first char of name and surname : %c %c",name.charAt(0),surname.charAt(0));
    }
}
