package week_04;

public class Exercise_01 {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        c = a;
        a = b;
        b = c;
        System.out.printf("The value \na : %d\nb : %d\nc : %d ", a, b, c);

        a = a + b;
        b = a - b;
        a = b - a;

    }
}
