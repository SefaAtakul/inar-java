package week_07;

public class Question_07_29 {
    public static void main(String[] args) {
       //Game : pick four cards
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades" };
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
        int[] deck = new int[52];
        int [] pickedCards =new int[4];

        initializeTheDeck(deck);
        pickTheCardsFromDeck(deck,suits,ranks,pickedCards);
    }
    public static int [] initializeTheDeck(int [] deck ){
        for (int i = 0; i < deck.length; i++) {
            deck[i]=i;
        }
        return deck;
    }
    public static void pickTheCardsFromDeck(int [] deck , String [] suits , String [] ranks,int [] pickedCards){
        int sumOfCards = 0;

        for (int i = 0; i <pickedCards.length ; i++) {
            int randomCard =(int)(Math.random()*52);

            }
            int randomCard = (int) (Math.random()*52);
            String suit = suits[deck[randomCard]/13];
            String rank = ranks[deck[randomCard]%13];
            sumOfCards+=deck[randomCard]%13;



        }
    }

