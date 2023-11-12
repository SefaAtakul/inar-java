package week_10.Test;

import java.math.BigDecimal;
import java.math.MathContext;

public class Question_10_17 {
    public static void main(String[] args) {
        String longMax = "" + Long.MAX_VALUE;
        BigDecimal bigDecimal = new BigDecimal(longMax);

        while (true){
            if (isSquare(longMax)){
                System.out.println(longMax);
                break;
            }
            longMax = bigDecimal.add(BigDecimal.ONE).toString();
            BigDecimal bigDecimal1 = new BigDecimal(longMax);
        }
        String sqrtOfLongMax = sqrt(longMax);
        pringNumbers(sqrtOfLongMax);

    }

    public static boolean isSquare(String strONum){
        BigDecimal number = new BigDecimal(strONum);
        MathContext mc = new MathContext(10);//10 ondalık basamak kullanımını sağlar,Hassasiyet için

        //Karekök
        BigDecimal squartOfNum = number.sqrt(mc);
        //Karekök ondalık kısmını kontrolü
        BigDecimal decimalPart = squartOfNum.remainder(BigDecimal.ONE);

        return decimalPart.compareTo(BigDecimal.ZERO) == 0;
    }

    public static String sqrt(String strOfNum){
        BigDecimal number = new BigDecimal(strOfNum);
        MathContext mc = new MathContext(10);
        BigDecimal sqrtOfNumber = number.sqrt(mc);
        return sqrtOfNumber.toString();
    }

    public static void pringNumbers(String firstNum){
        BigDecimal bigDecimal = new BigDecimal(firstNum);
        for (int i = 0; i < 10; i++) {
            System.out.println(bigDecimal.multiply(bigDecimal));
            firstNum = bigDecimal.add(BigDecimal.ONE).toString();
            bigDecimal = new BigDecimal(firstNum);

        }
    }
}