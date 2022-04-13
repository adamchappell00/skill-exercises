package cardgames;

import java.util.*;

public class GameOfWar {

    public static void main(String[] args) {

        // Init the Card Deck and Shuffle it
        ArrayList<Card> deck = CardsArray.getAllCards();
        Collections.shuffle(deck);

        // Start each Player's Hand and Deal the Cards
        List<Card> playerOneDeal = new ArrayList<>();
        List<Card> playerTwoDeal = new ArrayList<>();

        playerOneDeal.addAll(deck.subList( 0, (deck.size()/2)));
        playerTwoDeal.addAll(deck.subList(deck.size()/2, deck.size()));

        // sout the Hands
        System.out.println("Player One Hand:");
        for(Card card :playerOneDeal){
            System.out.println("Card: "+card.getName() + " of " + card.getSuit());
        }
        System.out.printf("\nPlayer Two Hand:");
        for(Card card :playerTwoDeal){
            System.out.println("Card: "+card.getName() + " of " + card.getSuit());
        }

    }
}