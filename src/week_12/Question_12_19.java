package week_12;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Question_12_19 {
    public static void main(String[] args) throws IOException {
        //CountWords
        Scanner input =new Scanner(System.in);
        System.out.println("Enter an URL for counting words :");
        String url = input.nextLine();
        URL url1 = new URL(url);
        Scanner input1 = new Scanner(url1.openStream());
        int counter = 0;
        while (input1.hasNext()){
            counter++;
            input1.next();
        }
        input1.close();
        System.out.println("The numbers of words :" + counter);
        System.out.println(url);
    }
}
