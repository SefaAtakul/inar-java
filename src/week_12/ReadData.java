package week_12;

import java.io.File;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) throws Exception {

        java.io.File file = new File("scores.txt");

        Scanner input =new Scanner(file);

        while (input.hasNext()){
            String firstName = input.next();
            String mi = input.next();
            String lastName = input.next();
            System.out.println(firstName + " " + mi + " " + lastName + " " );
        }

        input.close();

    }
}
