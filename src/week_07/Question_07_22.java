package week_07;



public class Question_07_22 {
    public static void main(String[] args) {
        String [] chessTable = new String[63];
        printQueens(chessTable);

}
public static void printQueens(String [] chessTable){
    for (int i = 0; i < chessTable.length; i+=8) {
       int random = (int)(Math.random()*8);
        for (int j = 0; j < random; j++) {
            System.out.print("| |");
        }
        System.out.println("|Q|");

    }
}

}
