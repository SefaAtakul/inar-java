package week_05;

public class Question_05_26 {
    public static void main(String[] args) {
        //If you can compute e
        double sum=1;
        double partOfSum=1;
        for(int i=1;i<=100_000;i++){
            for(int j=1;j<=i;j++){
                partOfSum*=1.0/j;
            }
            sum+=partOfSum;
            partOfSum=1;

            if(i % 10_000 == 0){
                System.out.printf("\n e at i = %d  is %f",i,sum);
            }
            }
        }


    }

