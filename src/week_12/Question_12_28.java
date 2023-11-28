package week_12;

import java.io.File;
import java.util.ArrayList;

public class Question_12_28 {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\ben\\workspace\\inar-java\\Question_26";
       File file = new File(filePath);

       if (!(args[0].length() ==1) && args[1].equals("*") ){
           System.out.println("Usage Question_//d_//d *");
           System.exit(0);
       }
       ArrayList <File> directories =new ArrayList<>();
       if (file.exists() && file.isDirectory()){
           directories.add(file);
       }
       while (directories.isEmpty()){
           File currentFile = directories.remove(0);
           File [] files = currentFile.listFiles();
           if (files != null){
               for (File f:files) {
                   if (f.getName().matches("Question_\\d_\\d")){
                       String fileName =f.getName();
                       String [] parts = fileName.split("_");
                       if (parts.length == 2){
                           String b = parts[1];
                           String newFileName = parts[0] + padWithZeros(b);
                           String newPath = f.getParentFile() +"\\" + newFileName;
                           f.renameTo(new File(newPath));

                       }
                   }

               }
           }

           }

       }
       public static String padWithZeros(String str){
        return str.length() == 1 ? "0"+str :str;
       }
}
