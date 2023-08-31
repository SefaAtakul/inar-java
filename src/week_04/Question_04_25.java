package week_04;

public class Question_04_25 {
    public static void main(String[] args) {
        //Generate vehicle plate numbers
        //65-90 ASCII  between A to Z   random three char for last three letter of plate
        int plateLetter1 = 65 + (int) (Math.random() * (91 - 65));
        int plateLetter2 = 65 + (int) (Math.random() * (91 - 65));
        int plateLetter3 = 65 + (int) (Math.random() * (91 - 65));
        //Generate first three letter of plate
        int plateNumber1 = (int) (Math.random() * (10));
        int plateNumber2 = (int) (Math.random() * (10));
        int plateNumber3 = (int) (Math.random() * (10));
        int plateNumber4 = (int) (Math.random() * (10));
        //Convert the digits to letter with ASCII table
        char plateChar1 = (char) (plateLetter1);
        char plateChar2 = (char) (plateLetter2);
        char plateChar3 = (char) (plateLetter3);

        System.out.printf("Generated plate number :%c%c%c%d%d%d%d", plateChar1, plateChar2, plateChar3, plateNumber1, plateNumber2, plateNumber3, plateNumber4);
    }

}
