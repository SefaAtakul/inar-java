package week_07;

import java.util.Scanner;

public class Question_07_21 {
    public static void main(String[] args) {
        //Game = bean Machine
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of balls to drop : ");
        int numberOfBalls = input.nextInt();
        System.out.println("Enter the number of slots in the bean machine : ");
        int numberOfSlots = input.nextInt();

        int [] arrayOfSlots = new int[numberOfSlots];

        findTheSlotsOfBeans(arrayOfSlots,numberOfBalls);

        printTheHistogram(arrayOfSlots);



    }
    public static void findTheSlotsOfBeans(int [] numberOfSlots, int numberOfBalls){
       String path = "";
        int number ;
        int R = 0;
        for (int i = 0; i < numberOfBalls; i++) {
            for (int j = 1; j <numberOfSlots.length ; j++) {
                number = (int) (Math.random()*2);
                if (number==0){
                    path+="L";
                }else {
                    path+="R";
                    R++;
                }

            }
            numberOfSlots[R]++;
            System.out.println(path+ " ");
            path="";
            R = 0;

        }

        }
        public static void printTheHistogram(int [] arrayOfSlots){
        int maxBallIndex = getMax(arrayOfSlots);

            for (int i = 0; i < maxBallIndex; i++) {
                for (int j = 0; j < arrayOfSlots.length; j++) {
                    if (arrayOfSlots[j] < (maxBallIndex-i)) {
                        System.out.print(" ");
                    }else {
                        System.out.print("0");
                    }

                }
                System.out.println();

            }
        }
        public static int getMax(int [] arrayOfSlots){
        int max = arrayOfSlots[0];
            for (int i = 1; i <arrayOfSlots.length ; i++) {
                if (max<arrayOfSlots[i]){
                    max = arrayOfSlots[i];
                }

            }
            return max;
        }

        }



