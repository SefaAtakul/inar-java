package week_12;

import java.io.File;
import java.util.ArrayList;

public class Question_12_27 {
    public static void main(String[] args) {
        if (args.length != 1 && args[1].equals("*")){
            System.out.println("Usage java Question_12_27 *");
            System.exit(0);
        }
        String filePath ="C:\\Users\\ben\\workspace\\inar-java\\Question_26";
        File file = new File(filePath);

        ArrayList<File> directories = new ArrayList<>();
        if (file.exists() && file.isDirectory()){
            directories.add(file);
        }
        while (directories.isEmpty()){
            File currentDirectory = directories.remove(0);
            File [] files = currentDirectory.listFiles();
            if (files != null){
                for (File f:files) {
                    if (f.getName().matches("Question_\\d_\\d"));
                    String fileName = f.getName();
                    String [] nameParts = fileName.split("_");

                    if (nameParts.length == 2) {
                        String k = nameParts[0].substring("Question".length());
                        String newFileName = "Question" + padWithZeros(k) + "_" + nameParts[1];
                        String newPath = f.getParentFile() + "\\" + newFileName;
                        f.renameTo(new File(newPath));
                    }

                }
            }

        }

    }
    public static String padWithZeros(String str) {
        return str.length() == 1 ? "0" + str : str;
    }
}
