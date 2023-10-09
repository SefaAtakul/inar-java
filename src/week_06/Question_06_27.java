package week_06;

public class Question_06_27 {
    public static void main(String[] args) {
        //Emirps
        printEmirpNumbers();
    }

    public static void printEmirpNumbers() {
        final int NUMBER_OF_EMIRPS = 100;
        final int NUMBER_FOR_PER_LINE = 10;

        int count = 0;
        int number = 11;

        while (count<NUMBER_OF_EMIRPS){
            if (isPrime(number) && isPrime(getReverse(number)) ){
                if ( count % NUMBER_FOR_PER_LINE == 0 ){
                    System.out.printf("\n%-10d",number);
                }else {
                    System.out.printf("%-10d",number);
                }
                count++;
            }
            number++;
        }

    }
    public static boolean isPrime(int number){
        for (int i = 2; i <= number/2 ; i++) {
            if (number % i == 0){
                return false ;
            }
        }
        return true;
    }

    public static int getReverse(int number){
        String strOfNumber = String.valueOf(number);
        String reverseOfNumber = "";

        for (int i = 0; i <strOfNumber.length() ; i++) {
            reverseOfNumber =strOfNumber.charAt(i) + reverseOfNumber ;
        }
        if (strOfNumber.equals(reverseOfNumber)){
            return 88 ;
        }
        return Integer.parseInt(reverseOfNumber);

    }
}
