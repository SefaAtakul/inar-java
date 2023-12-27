package week_14;

import java.util.ArrayList;

public class Question_14_06 {
    public static void main(String[] args) {
        coverTheDuty();
    }
    public static void coverTheDuty(){
        ArrayList<Integer>  list = createRandom();
        System.out.println(list);
        groupOddsAndEvens(list);
        System.out.println(list);
    }
    public static ArrayList<Integer> createRandom(){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random()*100));
        }
        return list;
    }
    public static void groupOddsAndEvens(ArrayList <Integer> list){
       int size = list.size();
       int count = 0 ;
        int numberOfEven = getCountOfEvenNumber(list);
        for (int i = 0; i < size; i++) {
            if (list.get(i)%2 == 0){
                int temp = list.remove(i);
                list.add(temp);
                count++;
                if (count == numberOfEven){
                    break;
                }
                i--;
            }
        }
    }
    public static int getCountOfEvenNumber(ArrayList<Integer> numbers) {
        int count = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
