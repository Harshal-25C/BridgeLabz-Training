//Import java util package to access Scanner Class
import java.util.*;

public class DeckOfCards{
    //Method to initialize the deck
    public static String[] initializeDeck(String[] suits, String[] ranks){
        int numOfCards = suits.length*ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index++] = ranks[j] + " of " + suits[i];
            }
        }

        return deck;
    }

    //Method to shuffle the deck
    public static String[] shuffleDeck(String[] deck){

        int n = deck.length;

        for(int i=0; i<n; i++){
            int randomCardNumber = i + (int) (Math.random() * (n - i));

            //Swap cards
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }

        return deck;
    }

    //Method to distribute cards to players
    public static String[][] distributeCards(String[] deck, int players, int cardsPerPlayer){

        int totalCardsNeeded = players*cardsPerPlayer;

        if(totalCardsNeeded > deck.length){
            System.out.println("Cards cannot be distributed evenly.");
            return null;
        }

        String[][] playerCards = new String[players][cardsPerPlayer];
        int cardIndex = 0;

        for(int i=0; i<players; i++) {
            for (int j=0; j<cardsPerPlayer; j++){
                playerCards[i][j] = deck[cardIndex++];
            }
        }

        return playerCards;
    }

    //Method to print players and their cards
    public static void printPlayers(String[][] players){

        for(int i=0; i<players.length; i++){
            System.out.println("\nPlayer " + (i + 1) + " Cards:");
            for(int j=0; j<players[i].length; j++){
                System.out.println("  " + players[i][j]);
            }
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        String[] ranks = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace"
        };

        //Initialize deck
        String[] deck = initializeDeck(suits, ranks);

        //Shuffle deck
        deck = shuffleDeck(deck);

        //User input
        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        System.out.print("Enter number of cards per player: ");
        int cardsPerPlayer = sc.nextInt();

        //Distribute cards
        String[][] playerCards = distributeCards(deck, players, cardsPerPlayer);

        if(playerCards != null){
            printPlayers(playerCards);
        }
    }
}
