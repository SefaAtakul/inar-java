package week_05;

public class Question_05_23 {
    public static void main(String[] args) {
        //Demonstrate cancellation errors
        double summationLeftToRight = 0;
        double summationRightToLeft = 0;

        for (int i = 1 ; i <= 50_000 ; i++){
            summationLeftToRight += ( 1.0 / i ) ;
        }


        for (int i =50_000 ; i>=1 ;i--){
            summationRightToLeft+=(1.0/i);

        }
        System.out.println("Summation of series left to right : " + summationLeftToRight);

        System.out.println("Summation of series right to left : " + summationRightToLeft);

        System.out.println("Summation of series right to left "
                + " - Summation of series left to right : "
                + (summationRightToLeft - summationLeftToRight));


    }
}
