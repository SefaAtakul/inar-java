package week_06;

public class Question_06_29 {
    public static void main(String[] args) {
        //TwinPrimes
        printTwinPrimes();
    }

    public static void printTwinPrimes() {
        final int COUNT_OF_TWIN_PRIMES = 1000;
        int number = 2;
        while (number<COUNT_OF_TWIN_PRIMES) {
            if (isPrimeNumber(number) && isPrimeNumber(number + 2)) {
                System.out.printf("(%d , %d )\n", number, number + 2);
            }
            number++;
        }
    }
    public static boolean isPrimeNumber(int number){
        for (int i = 2; i <=number/2 ; i++) {
            if (number % i == 0){
                return false;
            }

        }
        return true;
    }
}




