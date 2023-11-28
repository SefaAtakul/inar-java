package week_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_22 {
    public static void main(String[] args) throws FileNotFoundException {
        //Replace text
        if (args.length != 3){
            System.out.println("Usage is :java Question_12_22 dir oldString newString ");
            System.exit(0);
        }
        String filePath = args[0];
        File file =new File(filePath);

        if (!file.exists()){
            System.out.println("Existential problem! ");
            System.exit(1);
        }

        String str = "";

        recursiveDirectory(file,args[1],args[2]);
    }
    public static void recursiveDirectory(File file,String oldStr,String newStr){
        ArrayList<File> directories = new ArrayList<>();
        if (file.isFile()){
            changeFile(file,oldStr,newStr);
            return;
        }else if(file.isDirectory()){
            directories.add(file);
        }
        while (!directories.isEmpty()){
            File currentDirectory = directories.remove(0);
            File [] files =currentDirectory.listFiles();
            for (File f:files) {
                if (f.isDirectory()){
                    directories.add(f);
                } else if (f.isFile()) {
                    changeFile(f,oldStr,newStr);
                }
            }
        }

    }
    public static void changeFile(File file, String oldStr, String newStr){
        StringBuilder page = new StringBuilder();
        try {
            Scanner input = new Scanner(file);
            while (input.hasNext()){
                String line = input.nextLine();
                line += line.replaceAll(oldStr,newStr);
                page.append(line).append("\n");
            }
            PrintWriter outPut = new PrintWriter(file);
            outPut.println(file);
            outPut.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}
