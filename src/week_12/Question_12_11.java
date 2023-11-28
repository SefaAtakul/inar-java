package week_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_11 {
    public static void main(String[] args) throws FileNotFoundException {

        String str = "";
        if (args.length != 2) {
            System.out.println("Usage java Question_12_11 John filename ");
            System.exit(1);
        }
        String filePath = args[1];
        File file = new File(filePath);

        if (!file.exists()) {
            System.out.println("File " + file + " is not exist !");
            System.exit(2);
        }

            Scanner input = new Scanner(file);

            while (input.hasNext()) {
                str += input.nextLine() + "\n";
            }
            str = str.replaceAll(args[1],"");
            input.close();

            PrintWriter printWriter = new PrintWriter(file);
            printWriter.print(str);
            printWriter.close();
    }
}