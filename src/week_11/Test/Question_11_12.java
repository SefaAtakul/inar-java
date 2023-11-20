package week_11.Test;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_12 {
    public static void main(String[] args) {
        ArrayList <Double> list = getList();
        print(list);
        double sum = sumNumbers(list);
        System.out.println("Sum of numbers = " + sum);

    }
    public static ArrayList <Double> getList(){
        ArrayList <Double> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 numbers :");
        double value ;
        for (int number = 0; number < 5; number++) {
            value = input.nextDouble();
            list.add(value);
        }
        return list;
    }
    public static void print(ArrayList<Double> arrayList){

        System.out.println(arrayList.toString());
        return;
    }
    public static double sumNumbers(ArrayList<Double> arrayList){
        double sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            sum += arrayList.get(i);
        }
        return sum;
    }
}
