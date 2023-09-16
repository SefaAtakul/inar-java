package week_05;

public class Question_05_40 {
    public static void main(String[] args) {
        //Simulation: heads or tails
        int headsAre = 0;
        int tailsAre = 0;


        //in a one million reputation for loop increase heads and tails
        //get a random number 0 or 1 in loop
        //if it is 0 = increase heads otherwise increase tails
        for (int i = 0; i < 1000000; i++) {
            int flippingCoin = (int)(Math.random()*2);
            if (flippingCoin == 0){
                headsAre++;
            }else {
                tailsAre++;
            }

        }
        System.out.print("Flipping a coin one million times...");
        System.out.printf("\nHeads : %d\nTails : %d",headsAre,tailsAre);
    }
}
