package week_05;

public class Question_05_20 {
    public static void main(String[] args) {
        //Display prime numbers between 2-1000
        int count = 0 ;
        boolean isPrimeNumber= true;

        for (int i = 2 ; i <= 1000; i++  ){
            for (int j = 2 ; j < i ; j++){
                if (j % i == 0){
                    isPrimeNumber=false;
                }
            }if (isPrimeNumber || i ==2){
                System.out.print((count % 8 == 0)?"\n"+i+" ":i+" ");
                count++;

            }
            isPrimeNumber=true;
        }


    }
}
