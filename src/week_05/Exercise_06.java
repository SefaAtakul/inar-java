package week_05;

public class Exercise_06 {
    public static void main(String[] args) {
        System.out.println("                  Multiplication Table                    ");

        for (int i = 1 ; i <= 9; i++ ) {
            System.out.print("     " + i);
        }
        System.out.println();

        for (int i = 0 ; i < 60 ; i++ ){
            System.out.print("-");
        }
        System.out.println();

        for (int i = 1 ; i <= 9 ; i++ ){
            System.out.print( i + " | ");

            for (int j = 1 ; j <= 9 ; j++){
                System.out.printf(" %4d ", i * j);
            }
            System.out.println();
        }


    }
}
