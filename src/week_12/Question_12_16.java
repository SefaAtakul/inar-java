package week_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Question_12_16 {
    public static void main(String[] args) throws FileNotFoundException {

        if (args.length != 3) {
            System.out.println("Usage java Question_12_11 filepath oldStr newStr");
            System.exit(1);
        }

        File sourceFile = new File(args[0]);

        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + "does not exist!");
            System.exit(2);
        }

        String str = "";


        Scanner input = new Scanner(sourceFile);
        while (input.hasNextLine()) {
            String line = input.nextLine();
            str += line.replaceAll(args[1], args[2] + "\n");
        }
        PrintWriter printWriter = new PrintWriter(sourceFile);
        printWriter.print(str);
        printWriter.close();
        System.out.println(sourceFile.toString());
    }
}