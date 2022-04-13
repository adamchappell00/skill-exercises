package cardgames;

import java.util.ArrayList;
import java.util.Arrays;

public class CardsArray {
    public static ArrayList<Card> getAllCards(){
        return new ArrayList<Card>(Arrays.asList(
                new Card("Hearts", "Two",2),
                new Card("Hearts", "Three",3),
                new Card("Hearts", "Four",4),
                new Card("Hearts", "Five", 5),
                new Card("Hearts", "Six", 6),
                new Card("Hearts", "Seven",7),
                new Card("Hearts", "Eight",8),
                new Card("Hearts", "Nine", 9),
                new Card("Hearts", "Ten",10),
                new Card("Hearts", "Jack",11),
                new Card("Hearts", "Queen",12),
                new Card("Hearts", "King", 13),
                new Card("Hearts", "Ace",14),
                //
                new Card("Diamonds","Two", 2),
                new Card("Diamonds", "Three",3),
                new Card("Diamonds","Four", 4),
                new Card("Diamonds", "Five",5),
                new Card("Diamonds", "Six",6),
                new Card("Diamonds", "Seven",7),
                new Card("Diamonds", "Eight",8),
                new Card("Diamonds", "Nine",9),
                new Card("Diamonds","Ten", 10),
                new Card("Diamonds", "Jack",11),
                new Card("Diamonds", "Queen",12),
                new Card("Diamonds", "King",13),
                new Card("Diamonds", "Ace",14),
                //
                new Card("Clubs","Two", 2),
                new Card("Clubs", "Three",3),
                new Card("Clubs","Four", 4),
                new Card("Clubs", "Five",5),
                new Card("Clubs", "Six",6),
                new Card("Clubs", "Seven",7),
                new Card("Clubs", "Eight",8),
                new Card("Clubs", "Nine",9),
                new Card("Clubs","Ten", 10),
                new Card("Clubs", "Jack",11),
                new Card("Clubs", "Queen",12),
                new Card("Clubs", "King",13),
                new Card("Clubs", "Ace",14),

                //
                new Card("Spades","Two", 2),
                new Card("Spades", "Three",3),
                new Card("Spades","Four", 4),
                new Card("Spades", "Five",5),
                new Card("Spades", "Six",6),
                new Card("Spades", "Seven",7),
                new Card("Spades", "Eight",8),
                new Card("Spades", "Nine",9),
                new Card("Spades","Ten", 10),
                new Card("Spades", "Jack",11),
                new Card("Spades", "Queen",12),
                new Card("Spades", "King",13),
                new Card("Spades", "Ace",14)
            ));
    }
}
