package week_05;

public class Question_05_18 {
    public static void main(String[] args) {
        //display 4 pattens using loops
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------");

        for (int i =6;i>=1;i--){
            for (int j =1;j<=i;j++){
                System.out.print(j+ " ");
        }
        System.out.println();
    }
        System.out.println("-----------------------------------------------------------");

        for(int i=1;i<=6;i++){
            for(int j=1;j<=(6-i);j++){
                System.out.print("   ");
            }
            for (int l =i;l>=1;l--){
                System.out.print(" "+l+" ");
            }
            System.out.println();
        }


        System.out.println("-----------------------------------------------------------");
        for (int i = 6 ;i>=1 ; i --){
            for (int j = 1 ;j<=i;j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }


    }
}
