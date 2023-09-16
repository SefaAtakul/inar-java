package week_05;

public class Question_05_15 {
    public static void main(String[] args) {
        //Display the ASCII character table
        int count = 0  ;

        for (int i = 33; i <= 127 ; i++){
            System.out.print((count%10==0)?("\n"+(char)(i)+" "):((char)(i)+" "));
            count++;
        }

    }
}
