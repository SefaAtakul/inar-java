package week_10.Classes;

public class MyCharacter {
    private  char value;
    public MyCharacter(char value){
        this.value=value;
    }
    public char getValue(){
        return value;
    }
    public static MyCharacter toLowerCase(char ch){
        return new MyCharacter(Character.toLowerCase(ch));
    }
    public static boolean isDigit(char ch){
        return (Character.isDigit(ch));
    }
    public static MyCharacter toUpperCase(char ch){
        return new MyCharacter(Character.toUpperCase(ch));
    }
    public static boolean isLetter(char ch){
        return (Character.isLetter(ch));
    }
    public static boolean isLetterOrDigit(char ch){
        return (Character.isLetter(ch)) || (Character.isDigit(ch));
    }
    public static boolean isLowerCase(char ch){
        return (Character.isLowerCase(ch));
    }
    public static  boolean isUpperCase(char ch){
        return (Character.isUpperCase(ch));
    }
    public static int compareTo(char x , char y){
        return x-y;
    }
    public String toString(){
        return String.valueOf(value);
    }
}
