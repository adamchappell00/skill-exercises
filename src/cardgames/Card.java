package cardgames;

public class Card {

    String suit;
    String name;
    int warValue;

    public Card(String suit, String name, int warValue) {
        this.suit = suit;
        this.name = name;
        this.warValue = warValue;
    }

    public String getSuit() {return suit;}
    public void setSuit(String suit) {this.suit = suit;}
    public int getWarValue() {return warValue;}
    public void setWarValue(int warValue) {this.warValue = warValue;}
}
