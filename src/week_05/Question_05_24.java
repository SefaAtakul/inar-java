package week_05;

public class Question_05_24 {
    public static void main(String[] args) {
        //Sum a series
        //Define the divide,dividing and result

        double result = 0 ;

        for (int i = 1 ; i <= 97 ; i++,i++){

            result+=(i*1.0)/(i+2);

        }
        System.out.printf("Sum of series : %f",result);



    }
}
