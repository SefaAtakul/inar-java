package week_14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Question_14_13 {
    public static void main(String[] args) {
        ArrayList<Integer> list =getList();
        System.out.println("Generated Array -> " + list);
        findThMostRepetiveNumbers(list);
    }
    public static ArrayList<Integer> getList(){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10 ; i++) {
            list.add((int) (Math.random()*3));
        }
        return list;
    }
    public static void findThMostRepetiveNumbers(ArrayList<Integer> list){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (Integer number : list) {
            map.put(number,map.getOrDefault(number,0)+1);
        }
        list.clear();
        for (Map.Entry<Integer,Integer> hash : map.entrySet()) {
            if (hash.getValue() > 3){
                list.add(hash.getKey());
            }
        }
        System.out.println("Elements appearing more than n/3 times ->" + list);
    }
}
