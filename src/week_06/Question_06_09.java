package week_06;

public class Question_06_09 {
    public static void main(String[] args) {
        //conversion between feet and meters
        displayResult();
    }
    public static void displayResult(){
        System.out.printf("Feet\t\tMeters\t\t|\t\tMeters\t\tFeet");
        System.out.print("\n-------------------------------------------------");
        double feet = 1.0;
        double meters = 20.0;
        while (feet<=10.0 && meters <=65.0){
            System.out.printf("\n%.1f\t\t\t%2.3f\t\t|\t\t%2.1f\t\t%4.3f",feet,footToMeter(feet),meters,meterToFoot(meters));
            feet++;
            meters+=5.0;

        }

    }
    public static double footToMeter(double foot){
        double meters = 0.305 * foot ;
        return meters;
    }

    public static double meterToFoot(double meters){
        double foot = 3.279 * meters ;
        return foot ;
    }
}
