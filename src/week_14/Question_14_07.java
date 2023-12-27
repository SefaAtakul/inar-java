package week_14;

import java.util.ArrayList;
import java.util.Collections;

public class Question_14_07 {
    public static void main(String[] args) {
        getTheMission();
    }
    public static void getTheMission(){
        ArrayList<Integer> list =new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random()*100));
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        int randomOrder = (int)(Math.random()*list.size()+1);
        System.out.println("What is the "+randomOrder+". greatest number!");
        System.out.println("The "+randomOrder+"th largest number is : " + list.get(randomOrder-1));

    }
}
