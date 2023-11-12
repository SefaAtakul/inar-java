package week_10.Test;

import java.math.BigInteger;

public class Question_10_16 {
    public static void main(String[] args) {
        String smallest50DigitNumber ="10000000000000000000000000000000000000000000000000";
        BigInteger bigInteger = new BigInteger(smallest50DigitNumber);
        int count = 0 ;
        while (count<10){
            if(isDivisibleBy2(smallest50DigitNumber)||isDivisibleBy3(smallest50DigitNumber)){
                System.out.println(smallest50DigitNumber);
                count++;
            }
            smallest50DigitNumber = bigInteger.add(BigInteger.ONE).toString();
            bigInteger = new BigInteger(smallest50DigitNumber);

        }
    }
    public static boolean isDivisibleBy2(String strOfInt ){
        BigInteger bigInteger = new BigInteger(strOfInt);
        return bigInteger.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO);
    }
public static boolean isDivisibleBy3(String strInt){
        BigInteger bigInteger =new BigInteger(strInt);
        return bigInteger.mod(BigInteger.valueOf(3)).equals(BigInteger.ZERO);

}
}
