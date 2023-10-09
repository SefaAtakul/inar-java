package week_07;

public class Exercise_02 {
    public static void main(String[] args) {
        //DecksOfCards
        int [] decks = new int[52];
        String [] suits = {"Spades","Hearts","Diamonds","Clubs"};
        String [] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};

        //initialize the cards
        for (int i = 0; i < decks.length; i++) {
            decks[i]=i;
        }
        //Shuffle the cards
        for (int i = 0; i < decks.length ; i++) {
            //Generate an index j randomly
            int index = (int) (Math.random()*decks.length);
            //Swap the indexes
            int temp = decks[i];
            decks[i] = decks[index];
            decks[index] = temp ;
        }
        //Display the firs four cards
        for (int i = 0; i < 4; i++) {
            String suit = suits[decks[i] / 13] ;
            String rank = ranks[decks[i] % 13] ;
            System.out.println("Card number " + decks[i] + " : " + rank + " of " + suit);
        }
    }
}
