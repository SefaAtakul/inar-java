package week_13.Question_13_02;

import java.util.ArrayList;
import java.util.Collections;

public class Question_13_02 {
    public static void main(String[] args) {
        shuffleAnArraylist();
    }
    public static void shuffleAnArraylist(){
        ArrayList <Double> list = new ArrayList<>();
        getNumbersToList(list);
        System.out.println(list.toString());
        //shuffleAnArraylist();
        shuffleList(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
    public static ArrayList<Double> getNumbersToList(ArrayList<Double> list) {
        double [] array = {1,1.5,10,1.53,5,12.5,65};
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
    return list;
    }
    public static ArrayList<Double> shuffleList(ArrayList <Double> list){
        for (int i = 0; i < list.size(); i++) {
            int randomIndex = (int) (Math.random()*list.size());
            Number temp = list.get(i);
            list.set(i, list.get(randomIndex));
            list.set(randomIndex, (Double) temp);
        }
        return list;
    }
    }

