package week_05;

public class Question_05_33 {
    public static void main(String[] args) {
        //Perfect Numbers
        int totalNumber = 0;

        System.out.println("Perfect numbers are :");


        for (int i = 1; i <= 10000 ; i++) {
            for (int j = 1; j < i; j++) {
                if ( i % j == 0){
                    totalNumber+=j;

            }

            }
            if (totalNumber == i){
                System.out.println(i);
        }
            totalNumber = 0 ;

        }
    }
}
