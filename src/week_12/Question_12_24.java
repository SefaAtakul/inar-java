package week_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question_12_24 {
    public static void main(String[] args) throws FileNotFoundException {
        //Process Large dataset
        String url = "C:\\Users\\ben\\workspace\\inar-java\\src\\week_12\\Classes\\SortedString.txt";
        File file =new File(url);
        if (!file.exists()){
            System.out.println("The problem about existence!");
            System.exit(0);
        }
        Scanner input =new Scanner(file);
        double assistantCount = 0;
        double associateCount = 0;
        double fullCount = 0;
        int countOfPerson = 0;

        while (input.hasNextLine()){
            String line = input.nextLine();
            if (line.contains("Assistant")){
                assistantCount+=getSlary(line);
            } else if (line.contains("associate")) {
                associateCount+=getSlary(line);
            }else {
                fullCount+=getSlary(line);
            }
            countOfPerson++;
        }
        printResults(assistantCount,associateCount,fullCount,countOfPerson);
    }
    public static double getSlary(String line){
        String [] parts = line.split(" ");
        String salary = parts[3];
        salary = salary.replace(",",".");
        return Double.parseDouble(salary);
    }
    public static void printResults(double totalSalaryForAssistants,
                                    double totalSalaryForAssociates,
                                    double totalSalaryForFulls,
                                    int countOfPerson) {
        double totalSalaryForFaculty = totalSalaryForAssistants +
                totalSalaryForAssociates +
                totalSalaryForFulls;
        double averageSalaryForFaculty = totalSalaryForFaculty / countOfPerson;
        System.out.printf("Total salary for assistant professors : %.2f\n", totalSalaryForAssistants);
        System.out.printf("Total salary for associate professors : %.2f\n", totalSalaryForAssociates);
        System.out.printf("Total salary for full professors      : %.2f\n", totalSalaryForFulls);
        System.out.printf("Total salary for all faculty          : %.2f\n", totalSalaryForFaculty);
        System.out.println("---------------------------------------------------");
        System.out.printf("Average salary for assistant professors : %.2f\n", (totalSalaryForAssistants / countOfPerson));
        System.out.printf("Average salary for associate professors : %.2f\n", (totalSalaryForAssociates / countOfPerson));
        System.out.printf("Average salary for full professors      : %.2f\n", (totalSalaryForFulls / countOfPerson));
        System.out.printf("Average salary for all faculty          : %.2f\n", averageSalaryForFaculty);

    }
}
