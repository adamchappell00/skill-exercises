package cardgames;

import java.util.*;

public class GameOfWar {

    private static int player1score = 0;
    private static int player2score;
    private static int i = 0;
    private static int pointValue = 1;
    private static boolean war = false;

    public static void main(String[] args) {

        // Init the Card Deck and Shuffle it
        ArrayList<Card> deck = CardsArray.getAllCards();
        Collections.shuffle(deck);

        // Start each Player's Hand and Deal the Cards
        List<Card> playerOneDeal = new ArrayList<>();
        List<Card> playerTwoDeal = new ArrayList<>();

        playerOneDeal.addAll(deck.subList( 0, (deck.size()/2)));
        playerTwoDeal.addAll(deck.subList(deck.size()/2, deck.size()));

        // Sout the Hands for verification
        /*
        System.out.println("Player One Hand:");
        System.out.println("Hand Size : " + playerOneDeal.size());
        for(Card card :playerOneDeal){
            System.out.println("Card: "+card.getName() + " of " + card.getSuit());
        }
        System.out.printf("\nPlayer Two Hand:");
        System.out.println("Hand Size : " + playerTwoDeal.size());
        for(Card card :playerTwoDeal){
            System.out.println("Card: "+card.getName() + " of " + card.getSuit());
        }
        */


        while( i < 26){
           playCards(playerOneDeal.get(i), playerTwoDeal.get(i));
        }

    }

    public static void playCards(Card p1Card, Card p2Card){

        System.out.println("Player One plays the "+ p1Card.getName() + " of " + p1Card.getSuit());
        System.out.println("Player Two plays the "+ p2Card.getName() + " of " + p2Card.getSuit());
        if(!war){
            pointValue = 1;
        }

        if(p1Card.getWarValue() > p2Card.getWarValue()){
            System.out.println("Player One Wins This Round!");
            player1score+= pointValue;
            i++;
            war = false;
        } else if(p1Card.getWarValue() == p2Card.getWarValue()){
                war = true;
                i += 4;
                pointValue += 4;
                System.out.println(" WAR!");

        } else {
            System.out.println("Player Two Wins This Round!");
            player2score += pointValue;
            i++;
            war = false;
        }
        System.out.println("The score is now: - Player 1 - " + player1score +" to - Player 2 -" + player2score + ".");
    }
}