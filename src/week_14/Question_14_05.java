package week_14;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_14_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integers for ArrayLists nums(enter -1 to stop) :");
        ArrayList<Integer> list = new ArrayList<>();
      while (true){
          int num = input.nextInt();
          if (num==-1) break;
          list.add(num);
      }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 0){
                list.remove(list.get(i));
                list.add(0);
            }
        }
        System.out.println("ArrayList after moving zeros to the end : \n" + list);
    }
}
