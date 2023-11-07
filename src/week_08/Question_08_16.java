package week_08;

import java.util.Arrays;

public class Question_08_16 {
    public static void main(String[] args) {
        //Sort Two-dimensional array
        int [][] arrayM ={{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}};
        sort(arrayM);

    }
    public static void sort(int [][] array){
        //Primary sort rows!
        //Firs row sorting
        int [] currentMinPoint=new int[2];
        for (int point = 0; point < array.length; point++) {
            int currentMinIndex=point;
            currentMinPoint[0]=array[point][0];
            for (int secondPoint = point+1; secondPoint < array.length; secondPoint++) {
                if (currentMinPoint[0]>array[secondPoint][0]){
                    currentMinPoint[0]=array[secondPoint][0];
                    currentMinPoint[1]=array[secondPoint][1];
                    currentMinIndex=secondPoint;
                }

            }
            if (currentMinIndex!=point){
                array[currentMinIndex][0] =array[point][0];
                array[currentMinIndex][1]=array[point][1];
                array[point][0]=currentMinPoint[0];
                array[point][1]=currentMinPoint[1];
            }
        }
        //Second row sorting
        for (int point = 0; point < array.length; point++) {
            int currentMinIndexOfY = point;
            int currentMinY = array[point][1];
            for (int secondPoint = point+1; secondPoint < array.length; secondPoint++) {
                if (array[point][0]==array[secondPoint][0]){
                    if (currentMinY>array[secondPoint][1]){
                        currentMinY = array[secondPoint][1];
                        currentMinIndexOfY=secondPoint;
                    }
                }


            }
            if (currentMinIndexOfY!=point){
                array[currentMinIndexOfY][1]=array[point][1];
                array[point][1]=currentMinY;
            }

        }


            for (int i = 0; i < array.length; i++) {
                System.out.print("(" + array[i][0] + "," + array[i][1] + ")");
            }


    }
}
