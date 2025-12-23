import java.util.*;

public class DeckOfCards{

    // Method to initialize deck
    public static String[] initializeDeck(String[] suits, String[] ranks) {
        //Calculate the number of cards in the deck
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];

        int index = 0;
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index++] = ranks[j] + " of " + suits[i];
            }
        }
        return deck;
    }

    // Method to shuffle the deck
    public static void shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int)(Math.random() * (n - i));
            // swap
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // Method to distribute cards to players
    public static String[][] distributeCards(String[] deck, int players, int cardsPerPlayer) {
        int totalCards = players * cardsPerPlayer;
        if (totalCards > deck.length) {
            System.out.println("Cards cannot be distributed evenly.");
            return null;
        }
        String[][] result = new String[players][cardsPerPlayer];
        int index = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                result[i][j] = deck[index++];
            }
        }
        return result;
    }

    // Method to print players and their cards
    public static void printPlayers(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println("  " + players[i][j]);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        // Initialize deck
        String[] deck = initializeDeck(suits, ranks);
        // Shuffle deck
        shuffleDeck(deck);
        //Take input Distribute cards
        System.out.println("Enter number of player : ");
        int players =sc.nextInt() ;
        System.out.println("Enter number of cards per player : ");
        int cardsPerPlayer = sc.nextInt();

        String[][] distributedCards = distributeCards(deck, players, cardsPerPlayer);

        // Print result
        if (distributedCards != null) {
            printPlayers(distributedCards);
        }
    }
}
