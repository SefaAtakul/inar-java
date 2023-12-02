package week_13.Question_13_06;

import week_13.Question_13_05.Circle;

public class Question_13_06 {
    public static void main(String[] args) {
    ComparableCircle comparableCircle = new ComparableCircle(16.5);
    comparableCircle.setColor("blue");
    comparableCircle.setFilled(true);
        System.out.println("Comparable Circle 1 : \n" + comparableCircle);
        System.out.println("---------------------------------------------");
        ComparableCircle comparableCircle2 = new ComparableCircle(20.3);
        comparableCircle2.setColor("purple");
        comparableCircle2.setFilled(true);
        System.out.println("Comparable Circle 2 : \n" + comparableCircle2);
        System.out.println("\n\n---------------------------------------------\n");

        if (comparableCircle.compareTo(comparableCircle2) > 0) {
            System.out.println("ComparableCircle1 is the larger of two Circles");
        } else if (comparableCircle.compareTo(comparableCircle2) == 0) {
            System.out.println("Both circle are equals");
        } else {
            System.out.println("ComparableCircle2 is the larger of two Circles");
        }
    }
}
