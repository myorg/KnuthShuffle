public class Card {
    private String name;
    private String suit;
    private int highValue;
    private int lowValue;

    public Card(String name, String suit, int highValue, int lowValue) {
        this.name = name;
        this.suit = suit;
        this.highValue = highValue;
        this.lowValue = lowValue;
    }

    public Card(){

    }
    public void setName(String name) {
        this.name = name;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public void setHighValue(int highValue) {
        this.highValue = highValue;
    }

    public void setLowValue(int lowValue) {
        this.lowValue = lowValue;
    }

    public String getName() {

        return name;
    }

    public String getSuit() {
        return suit;
    }

    public int getHighValue() {
        return highValue;
    }

    public int getLowValue() {
        return lowValue;
    }
}
