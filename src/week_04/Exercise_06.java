package week_04;

import java.util.Scanner;

public class Exercise_06 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int min,mid,max ;
        //Prompt the user Enter three number
        System.out.println("Enter three number");
        int gym1 = input.nextInt();
        int gym2 = input.nextInt();
        int gym3 = input.nextInt();

        int distanceGym1 = Math.abs(input.nextInt());
        int distanceGym2 = Math.abs(input.nextInt());
        int distanceGym3 = Math.abs(input.nextInt());

        int tempMin = Math.min(distanceGym1,distanceGym2);
        min = Math.min(tempMin,distanceGym3);

        String name ="Inar Academy  ";
        int length =name.length();
        System.out.printf("The character length of %s is%d\n",name,length);
        int thirdLetterOfName = name.charAt(5);
        System.out.println((char) thirdLetterOfName);

        name = name.trim();
        System.out.printf("The name is %d:",name);









    }
}
