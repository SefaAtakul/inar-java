package week_11.Test;

import week_10.Classes.Circle2D;
import week_11.Classes.Loan;

import java.util.ArrayList;
import java.util.Date;

public class Question_11_06 {
    public static void main(String[] args) {

        ArrayList<Object> objects = new ArrayList<>();

        Loan loan = new Loan(1,1000,2.5);
        Date date = new Date();
        String str = "Inar Academy";
        Circle2D circle2D = new Circle2D();

        objects.add(loan);
        objects.add(date);
        objects.add(str);
        objects.add(circle2D);
        for (Object o : objects) {
            System.out.println(o.toString());
            System.out.println("---------------------------------");
        }


    }
}
