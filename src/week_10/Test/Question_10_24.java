package week_10.Test;

import week_10.Classes.MyCharacter;

public class Question_10_24 {
    public static void main(String[] args) {
        //Character Class Test
        MyCharacter character = new MyCharacter('a');
        System.out.println(character.toString());
        MyCharacter character1 = new MyCharacter('z');
        System.out.println(Character.isDigit(character.getValue()));
        System.out.println(Character.isLetter(character.getValue()));
        System.out.println(MyCharacter.isDigit(character1.getValue()));
        System.out.println(MyCharacter.isLetter(character1.getValue()));
        System.out.println(MyCharacter.toUpperCase(character1.getValue()));
        System.out.println(MyCharacter.toLowerCase(character1.getValue()));
        System.out.println(MyCharacter.isLetterOrDigit(character.getValue()));
        System.out.println(MyCharacter.compareTo(character1.getValue(),character.getValue()));
        System.out.println(MyCharacter.compareTo(character.getValue(),character1.getValue()));
        System.out.println(MyCharacter.isLowerCase(character1.getValue()));
        System.out.println(MyCharacter.isUpperCase(character.getValue()));
    }
}
