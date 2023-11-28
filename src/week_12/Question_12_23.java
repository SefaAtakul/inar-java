package week_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Question_12_23 {
    public static void main(String[] args) throws FileNotFoundException {
        //Create large dataset
        String url = "C:\\Users\\ben\\workspace\\inar-java\\src\\week_12\\Classes\\SortedString.txt";
        File file  = new File(url);

        if (!file.exists()){
            System.out.println("We don't have such kind of file!");
            System.exit(0);
        }

        PrintWriter output = new PrintWriter(file);

        for (int i = 1; i <= 1000; i++) {
            String line = "FirstName"+i+" LastName"+i+ " " +getRank()+ " " +getSalary(getRank());
            output.println(line);
        }

        output.close();


        }
        public static String getRank(){
        String [] ranks = {"assistant","associate","full"};
        int randomIndex =(int) (Math.random()*ranks.length);
        return ranks[randomIndex];
        }
        public static String getSalary(String rank){
        double salary = 0;
        switch (rank){
            case"assistant":
                salary = Math.random() * 30_000 + 50_000;
                break;
            case "associate":
                salary = Math.random() * 50_000 + 60_000;
                break;
            case "full":
                salary = Math.random() * 55_000 + 75_000;
                break;
            default:
                System.out.println("We don't kind of rank!");
                System.exit(2);
        }
            return String.format("%.2f", salary);
        }
}
