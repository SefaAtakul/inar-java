package week_14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question_14_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integers (Enter 0 to stop):");
        ArrayList<Integer> list =new ArrayList<>();
        int number ;
        do {
            number = input.nextInt();
            list.add(number);
        }while (number != 0);
        Map<Integer,Integer> numbers = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            numbers.put(list.get(i),numbers.getOrDefault(list.get(i),0)+1);
        }
        list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (Map.Entry<Integer,Integer> m : numbers.entrySet()){
          if (m.getValue()>max){
              max=m.getValue();
          }
        }
        for (Map.Entry<Integer,Integer> m : numbers.entrySet()) {
            if(m.getValue()==max){
                System.out.println(m.getKey() + " --> " + max + " times.");
            }
        }

    }


}
