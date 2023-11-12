package week_10.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Question_10_21 {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal(Long.MAX_VALUE);
        int count = 0 ;
        while (count<10){
            if (isdivisibleBy5(bigDecimal)&&isDivisibleBy6(bigDecimal)){
                System.out.println(bigDecimal);
                count++;
            }
            bigDecimal=bigDecimal.add(BigDecimal.ONE);
        }
    }
    public static boolean isdivisibleBy5(BigDecimal bigDecimal){
      bigDecimal =bigDecimal.divide(BigDecimal.valueOf(5),20, RoundingMode.UP);

      BigDecimal decimalPart = bigDecimal.remainder(BigDecimal.ONE);

      return decimalPart.compareTo(BigDecimal.ZERO)==0;
    }
    public static boolean isDivisibleBy6(BigDecimal bigDecimal){
        bigDecimal = bigDecimal.divide(BigDecimal.valueOf(6),20,RoundingMode.UP);

        BigDecimal decimalPart = bigDecimal.remainder(BigDecimal.ONE);

        return decimalPart.compareTo(BigDecimal.ZERO)==0;
    }
}
