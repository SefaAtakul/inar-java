package week_06;

public class Question_06_14 {
    public static void main(String[] args) {
        //Estimate pi

        printTable();

    }
    public static void printTable(){
        int i =1 ;
        while (i <= 901){
            System.out.printf("%-10d%.4f\n", i, computePiSeries(i));
            i+=100;
        }
    }
    public static double computePiSeries(int number){
        double sumOfPi = 0 ;
        for (int i = 1; i <= number ; i++) {
            sumOfPi += 4 * (Math.pow((-1),(i+1))/(2*i-1));

        }
        return sumOfPi;
    }
}
