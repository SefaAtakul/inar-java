package week_09.week_09_Test;

import week_09.week_09_Classes.Question_09_08_Fan;

public class Question_09_08_Test {
    public static void main(String[] args) {
        Question_09_08_Fan funObject = new Question_09_08_Fan();
        funObject.setColor("yellow");
        funObject.setRadius(10);
        funObject.setSpeed("FAST");
        funObject.setOn(true);
        Question_09_08_Fan funObject1 =new Question_09_08_Fan();
        funObject1.setColor("blue");
        funObject1.setRadius(5);
        funObject1.setSpeed("MEDIUM");
        funObject1.setOn(false);
        System.out.println(funObject.toString());
        System.out.println("-----------------------------------");
        System.out.println(funObject1.toString());
    }

}
