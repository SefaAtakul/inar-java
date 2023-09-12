package week_05;

import java.util.Scanner;

public class exercise_01 {
    public static void main(String[] args) {
        //Loops
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name : ");
        String name = input.nextLine();

        int counter = 0;
        while (counter < 100) {
            System.out.println(name.compareTo("Mehmet"));
            counter++;
        }

    }
}
