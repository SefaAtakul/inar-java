package week_12.Examples;

import java.io.*;
import java.util.Scanner;

public class TheFileClass {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\ben\\workspace\\inar-java\\src\\week_12\\Poem.txt");
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.canExecute());
        System.out.println(file.canWrite());
        try {
            FileWriter writer = new FileWriter("Poem.txt");
            writer.write("Gamına gamlanıp olma mahzun!\nDemine demlenip olma mağrur!\n Ne gam baki ne dem baki \n Hüvel baki Hüvel baki");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(file.getName());
        System.out.println(file.getCanonicalFile());
        System.out.println(file.mkdir());
        System.out.println(file.toString());
        System.out.println(new java.util.Date(file.lastModified()));
        java.io.PrintWriter writer1 = new PrintWriter("Poem.txt");
        if (file.exists()){
            System.out.println("File already exist!");
        }
        writer1.print("Sefa ATAKUL");
        writer1.print(15);
        writer1.print(15.5);
        writer1.close();
        Scanner input = new Scanner(new File("C:\\Users\\ben\\workspace\\inar-java\\Poem.txt"));

    }
}
