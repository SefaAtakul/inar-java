package week_05;

public class Question_05_25 {
    public static void main(String[] args) {
        //Compute Ò
        double pi = 0;


        //Find Ò values for i = 10000 to 100000 by increasing 10000
        for (int i = 1; i <= 100000; i++) {
            pi += 4 * ((Math.pow((-1), i + 1)) / ((2 * i) - 1));
            if (i % 10000 == 0) {
                System.out.printf(" \nPI value for i = %d :%f", i, pi);
            }
        }
    }
}