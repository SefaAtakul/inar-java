package week_06;

public class Question_06_26 {
    public static void main(String[] args) {
        //Palindromic prime
      printPalindromicPrimeNumbers();

    }
    public static void printPalindromicPrimeNumbers(){
        final int PALINDROMIC_PRIME_NUMBERS= 100 ;
        final int NUMBER_FOR_PER_LINES = 10 ;

        int count = 0;
        int number = 2;

        while(count<PALINDROMIC_PRIME_NUMBERS){
            if (isPrime(number) && isPolindrome(number)){
               if (count % NUMBER_FOR_PER_LINES == 0 ){
                   System.out.printf("\n%-10d",number);
               }else{
                   System.out.printf("%-10d",number);
               }
               count++;

            }
            number++;

        }

    }
    public static boolean isPrime(int number){
        for (int i = 2; i <=number/2 ; i++) {
            if (number % i == 0){
                return false;
            }

        }
        return true;
    }

    public static boolean isPolindrome(int number){
        String num = String.valueOf(number);
        String reverse = "";
        for (int i = num.length()-1 ; i >= 0 ; i--) {
            reverse= reverse+num.charAt(i);
            if (num.equals(reverse)){
                return true;
            }

        }
        return false;
    }
}
