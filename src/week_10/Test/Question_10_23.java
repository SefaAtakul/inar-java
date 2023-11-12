package week_10.Test;

import week_10.Classes.MyString1;
import week_10.Classes.MyString2;

public class Question_10_23 {
    public static void main(String[] args) {
        MyString2 a =new MyString2("Elon Musk");
        System.out.println(a);
        MyString2 b = new MyString2("d");
        System.out.println(b.toUpperCase());
        System.out.println(a.compare(b.getValue()));
        System.out.println(b);
        MyString2 c = new MyString2("GoZero");
        System.out.println(c);
        System.out.println(c.toUpperCase());
        System.out.println(c.toChars());
        System.out.println(MyString2.valueOf(true));
        System.out.println(MyString2.valueOf(false));
    }
}
