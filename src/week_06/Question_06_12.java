package week_06;

public class Question_06_12 {
    public static void main(String[] args) {
        //Display Characters
        System.out.println("Characters per 1 to Z :");
        char firstChar = '1' ;
        char lastChar = 'Z' ;
        final  int NUMBER_PER_LINE = 10 ;


        printChars( firstChar, lastChar, NUMBER_PER_LINE);

    }
    public static void printChars(char ch1,char ch2,int numberPerLine){
        int count =0;
        for (int i = 49; i <=90 ; i++) {
            char ch3 = (char)i;
            System.out.print((count % 10 == 0) ? "\n" + ch3 + " " : ch3 + " ");
            count++;

        }
    }
}



