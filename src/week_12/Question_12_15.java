package week_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;

public class Question_12_15 {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\ben\\workspace\\inar-java\\src\\week_12\\Question_12_15.txt";
        File file = new File(filePath);

        if (file.exists()){
            System.out.println("We have already a file with this name!");
        }else {
            file.createNewFile();
        }
        getRandomIntegers(file);
        readAndDisplayTheFile(file);

    }
    public static void getRandomIntegers(File file) throws FileNotFoundException {
        PrintWriter output = new PrintWriter(file);

        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 0){
                output.print((int) (Math.random()*100 + 1) + "\n");
            }else {
                output.print((int) (Math.random()*100 + 1) + " " );
            }

        }
        output.close();
    }
    public static void readAndDisplayTheFile(File file) throws FileNotFoundException {
        ArrayList <Integer> list = new ArrayList<>();
        Scanner input = new Scanner(file);
       while (input.hasNext()){
           String num = input.next();
           list.add(Integer.parseInt(num));
       }
       Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            if (i % 10 == 0){
                System.out.print( list.get(i) + "\n");
            }else {
                System.out.print(list.get(i)+" ");
            }
        }
    }
}
