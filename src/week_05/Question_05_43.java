package week_05;

public class Question_05_43 {
    public static void main(String[] args) {
        //Math Combination
        int totalNumber = 0 ;

        //we will have 2 "for loops" for 2 numbers
        for (int i = 1 ; i <=7 ; i ++ ){
            for (int j = i+1 ; j<= 7 ; j++){
                totalNumber+=1;
                System.out.println(i+" "+j);
            }
        }
        System.out.println("The total number of all combination is : " + totalNumber);
    }
}
