package week_07;

public class Question_07_07 {
    public static void main(String[] args) {
        //CountSingleDigits
        int [] listOfIntegers = new int[10];
        printTheListOfIntegers(listOfIntegers);
    }
    public static void printTheListOfIntegers(int [] listOfIntegers){
        final int RANDOM_NUMBERS=100;
        for (int i = 0; i < RANDOM_NUMBERS; i++) {
            int number = (int) (Math.random()*10);
            listOfIntegers[number]++;
        }
        System.out.println("Count for each number between 0 and 9 : ");
        for (int i = 0; i < listOfIntegers.length; i++) {
            System.out.println(i+".s  : " + listOfIntegers[i] );

        }
    }
}
