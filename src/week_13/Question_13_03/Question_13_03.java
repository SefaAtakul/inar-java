package week_13.Question_13_03;

import java.util.ArrayList;
import java.util.Date;

public class Question_13_03 {
    public static void main(String[] args) {
        sortMethod();
    }
    public static void sortMethod(){
        ArrayList <Double> list = new ArrayList<>();
        getNumbersToList(list);
        System.out.println(list);
        sort(list);
        System.out.println(list);
    }
    public static ArrayList <Double> getNumbersToList(ArrayList <Double> list){
        for (int i = 0; i < 10; i++) {
            list.add((double)Math.random()*100);
        }
        return list;
    }
    public static ArrayList<Double> sort(ArrayList <Double> list){
        for (int i = 0; i < list.size() - 1; i++) {
            Number currentMin = list.get(i);
            int currentMinIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).doubleValue() < currentMin.doubleValue()) {
                    currentMin = list.get(j);
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                Number temp = list.get(i);
                list.set(i, currentMin.doubleValue());
                list.set(currentMinIndex, temp.doubleValue());
            }
        }
return list;
        }
    }

