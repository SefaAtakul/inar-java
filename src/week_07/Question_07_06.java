package week_07;

public class Question_07_06 {
    public static void main(String[] args) {
        //Optimize finding prime numbers
        int [] primeNumbers = getFiftyPrimeNumbers();
        printPrimeNumbers(primeNumbers);

    }
    public static int[] getFiftyPrimeNumbers(){
        final int COUNT_OF_PRIMES = 50;
        int number = 2 ;
        int count = 0 ;
        int[] primeNumbers = new int[50];
        while (count<COUNT_OF_PRIMES){
            if (isPrime(number)){
                primeNumbers[count] = number ;
                count++;
            }
            number++;
        }
return primeNumbers;
    }

    public static boolean isPrime(int number){
        for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimeNumbers(int[] primeNumbers) {
        for (int i = 0; i < primeNumbers.length; i++) {
            if (i % 10 == 0) {
                System.out.printf("\n%5d", primeNumbers[i]);
            } else {
                System.out.printf("%5d", primeNumbers[i]);
            }
        }
    }
}
