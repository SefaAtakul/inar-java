package week_05;

public class Question_05_35 {
    public static void main(String[] args) {
        //Summation
        double summation = 0 ;


        for (int i =2 ; i <= 625 ; i ++){
            summation += 1 / (Math.sqrt(i)+Math.sqrt(i-1));
        }
        System.out.printf("The sum of the serie is %f",summation);
    }
}
