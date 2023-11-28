package week_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_26 {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 1 && args[0].equals("*")) {
            System.out.println("Usage java Question_12_27 *");
            System.exit(0);
        }
        String filePath = "C:\\Users\\ben\\workspace\\inar-java\\Question_26";
        File file = new File(filePath);

        if (!file.exists()) {
            System.out.println("We are sorry,There is not kind of a file!");
            System.exit(1);
        }
        ArrayList<File> directories = new ArrayList<>();
        if (file.exists() && file.isDirectory()) {
            directories.add(file);
        }

        while (!directories.isEmpty()) {
            File currentDirectory = directories.remove(0);
            File[] files = currentDirectory.listFiles();
            if (files != null) {
                for (File f : files) {
                    if (f.getName().matches(("Question\\d_\\d"))) {
                        String fileName = f.getName();
                        String[] nameParts = fileName.split("_");

                        if (nameParts.length == 2) {
                            String a = nameParts[0].substring("Question".length());
                            String b = nameParts[1];
                            String newFileName = "Question" + padWithZeros(a) + "_" + padWithZeros(b);
                            String newPath = f.getParentFile() + "\\" + newFileName;
                            f.renameTo(new File(newPath));
                        }
                    }
                }
            }
        }

    }
    public static String padWithZeros(String str) {
        return str.length() == 1 ? "0" + str : str;
    }
}
