package week_06;

public class Question_06_10 {
    public static void main(String[] args) {
        //Find the prime numbers with a method  less than 10000
        int numberOfPrimes = 0 ;

        for (int i = 2; i <=10_000 ; i++) {
            if(isPrime(i)){
                numberOfPrimes++;
            }
        }
        System.out.println("The number of prime numbers less than 10,000 is : "+ numberOfPrimes);

    }
    public static boolean isPrime(int number){
        for (int i = 2 ; i <= (number/2) ; i++){
            if (number % i == 0){
                return false ;
            }
        }
        return true;
    }
}
