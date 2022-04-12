package cardgames;

import java.util.Random;
import java.util.Set;
import java.util.LinkedHashSet;

public class GameOfWar {

    public static void main(String[] args) {

        Card[] deck = CardsArray.getAllCards();

        Random randNum = new Random();
        Set<Integer> setA = new LinkedHashSet<Integer>();
        while(setA.size() < 26){
            setA.add(randNum.nextInt(52)+1);
        }

        Card[] playerOneDeal = new Card[26];
        Card[] playerTwoDeal = new Card[26];


    }
}
