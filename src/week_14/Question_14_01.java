package week_14;

import java.util.ArrayList;
import java.util.Collections;

public class Question_14_01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = getList();
        System.out.println(list);
        reverseList(list);
    }
    public static ArrayList<Integer> getList(){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
          int number = (int) (Math.random()*100);
          list.add(number);
        }
        return list;
    }
    public static void reverseList(ArrayList<Integer> list){
        ArrayList<Integer> reverse = new ArrayList<>();
        for (int i = list.size()-1; i >= 0; i--) {
         int temp = list.get(i);
         reverse.add(temp);
        }
        System.out.println(reverse);
       // Collections.reverse(reverse);
        //System.out.println(reverse);
    }
}
