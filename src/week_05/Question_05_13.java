package week_05;

public class Question_05_13 {
    public static void main(String[] args) {
        //Find the largest  n  such that  n^3<12000
        int n = 1 ;

        int largestN = 1;


        while (Math.pow(n, 3) <= 12000) {

            largestN = n;

            if (largestN <= 12000) {

                n++;
            }

        }


        System.out.printf("The largest n is %d ",largestN);

    }
}

