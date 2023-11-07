package week_09.week_09_Test;

import java.util.Random;

public class Question_09_04_Test {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[50];
        for (int i = 0; i < 50; i++) {
            numbers[i] = random.nextInt(100);
        }
        System.out.println("Random Numbers Are:\n");
        for (int i = 1; i <= 50; i++) {
            if (i % 10 == 0) {
                System.out.printf("%3d\n", numbers[i - 1]);
            } else {
                System.out.printf("%3d", numbers[i - 1]);
            }
        }
    }
}
