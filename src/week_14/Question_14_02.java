package week_14;

import java.util.ArrayList;
import java.util.HashSet;

public class Question_14_02 {
    public static void main(String[] args) {
        ArrayList <Integer> list = getList();
        System.out.println(list);
        System.out.println(list.size());
        removeDuplicates(list);

    }
    public static void removeDuplicates(ArrayList <Integer> list){
        HashSet<Integer> list1 = new HashSet<>();
        for (int i = 0; i <list.size() ; i++) {
            list1.add(list.get(i));
        }
        System.out.println("----------------------------------------------------");
        System.out.println(list1);
        System.out.println(list1.size());
        int number =list.size()-list1.size();
        System.out.println("We removed " + number +" duplicate number!" );
    }
    public static ArrayList<Integer>getList(){
        ArrayList <Integer> list = new ArrayList<>();
        int counter = 0;
        while (counter<50){
            list.add((int) (Math.random()*100));
            counter++;
        }
    return list;
    }
}
