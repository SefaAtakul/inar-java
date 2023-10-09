package week_06;

public class Question_06_38 {
    public static void main(String[] args) {
        //Generate random uppercase letters and digits

        printRandomCharsAndDigits();

    }
    public static void printRandomCharsAndDigits(){
        final int COUNT_OF_CHARS = 100 ;
        final int COUNT_OF_DIGITS = 100 ;
        final int COUNT_OF_LINE = 10 ;
        int count = 1 ;
        for (int i = 0; i < COUNT_OF_CHARS; i++) {
            if ((count % COUNT_OF_LINE == 0)){
                System.out.println(getRandomUpperCaseLetter());
            }else {
                System.out.print(getRandomUpperCaseLetter());
            }
            count++;
        }
        for (int i = 0; i < COUNT_OF_DIGITS; i++) {
            if (count % COUNT_OF_LINE==0){
                System.out.println(getRandomDigitsChars());
            }else {
                System.out.print(getRandomDigitsChars());
            }
            count++;
        }
    }
    public static char getRandomUpperCaseLetter(){
        char randomUpperCaseLetter =getRandom('A','Z');
        return randomUpperCaseLetter;
    }
    public static char getRandomDigitsChars(){
        char randomDigit = getRandom('1','9');
        return randomDigit;

    }
    public static char getRandom(char ch1,char ch2){
        char randomCharacter = (char)(ch1+Math.random()*(ch2-ch1));
        return randomCharacter;
    }
}
