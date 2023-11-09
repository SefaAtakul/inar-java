package week_10.Test;

import week_10.Classes.Course;

import java.util.Scanner;

public class Question_10_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Course course = new Course("Arabic");
        course.addStudents("Besim K.");
        course.addStudents("Emre C.");
        course.addStudents("A.F.C");
        course.addStudents("Sefa A.");
        course.printStudents();
        System.out.println("----------------------");
        course.dropOfStudent("Sefa A.");
        course.printStudents();
        System.out.println("--------------------------");
        course.clear();
        course.printStudents();

    }
}
