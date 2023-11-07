package week_09.week_09_Test;

import week_09.week_09_Classes.Question_09_06_StopWatch;

public class Question_09_06_Test {
    public static void main(String[] args) {
        int [] numbers = getNumbers();
        shuffle(numbers);
        testSortDuration(numbers);

    }
    public static int[] getNumbers(){
        int [] numbers = new int [100_000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=i+1;


        }
        return numbers;
    }
    public static void shuffle(int [] numbers){
        for (int i = 0; i < numbers.length; i++) {
            int randomIndex = (int) (Math.random() * 100_000);
            int temp = numbers[i];
            numbers[i] = numbers[randomIndex];
            numbers[randomIndex] = temp;
        }
    }
    public static void testSortDuration(int [] numbers){
        Question_09_06_StopWatch stopWatch = new Question_09_06_StopWatch();
        //java.util.Arrays.sort(numbers);
        selectionSort(numbers);
        stopWatch.stop();
        System.out.println("The execution time of sorting 100,000 numbers using selection sort :"
        +stopWatch.getElapsedTime() + "milliseconds");
    }
    public static void selectionSort(int [] numbers){
        for (int i = 0; i < numbers.length; i++) {
            int currentMn = numbers[i] ;
            int currentMinIndex = i ;
            for (int j = i+1; j <numbers.length ; j++) {
                if (numbers[j]<currentMn){
                    currentMn =numbers[j];
                    currentMinIndex=j;
                }
            }
            if (currentMinIndex != i){
                numbers[currentMinIndex]=numbers[i];
                numbers[i]=currentMn;
            }
        }

    }
}
