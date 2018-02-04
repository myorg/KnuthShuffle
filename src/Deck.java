import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;


public class Deck {
    private Card[] cards;
    private String[] suits = {"H", "C", "D", "S"};
    private String[] types = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K"};
    private int[] highValues = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
    private int[] lowValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
    private int numDecks;

    public Deck(int numDecks) {
        this.numDecks = numDecks;
        cards = new Card[suits.length * types.length * numDecks];
        int cardIndex = 0;

        for (int deckIndex = 0; deckIndex < numDecks; deckIndex++) {
            for (int suitIndex = 0; suitIndex < suits.length; suitIndex++) {
                for (int typeIndex = 0; typeIndex < types.length; typeIndex++) {
                    Card card = new Card();
                    card.setName(types[typeIndex] + suits[suitIndex]);
                    card.setHighValue(highValues[typeIndex]);
                    card.setLowValue(lowValues[typeIndex]);
                    card.setSuit(suits[suitIndex]);
                    cards[cardIndex++] = card;
                }
            }
        }
    }

    public void printDeck(){
        System.out.println("Printing Shoe containing " + numDecks + " deck(s) and " + cards.length + " total cards");
        for (Card card : cards){
            System.out.println("Name: " + card.getName() + "  Suit: " + card.getSuit() + "  High Value: " + card.getHighValue() + "  Low Value: " + card.getLowValue() );
        }
    }

    public void shuffle(){
        try {
            SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");

            for (int currentCardIndex = 0; currentCardIndex < cards.length; currentCardIndex++) {
                int randomCardIndex = secureRandom.nextInt(currentCardIndex + 1);
                exchange(currentCardIndex, randomCardIndex);
            }

        }
        catch (NoSuchAlgorithmException e){

        }
    }

    private void exchange(int currentCardIndex, int randomCardIndex) {
        Card tempCard = cards[currentCardIndex];
        cards[currentCardIndex] = cards[randomCardIndex];
        cards[randomCardIndex] = tempCard;
    }
}
