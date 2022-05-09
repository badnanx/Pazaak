package sample;

import java.util.ArrayList;

/**
 * The Hand class for each player which controls their hand size, Cards in their hand, etc.
 */
public class Hand {
    private Deck deck;
    private ArrayList<Card> p1Hand;
    private ArrayList<Card> p2Hand;

    public Hand(){
        deck = new Deck();
    }

    public ArrayList<Card> getP1Hand() {

        return p1Hand;
    }

    public void setP1Hand() {

        p1Hand = CreateHand();
    }

    public ArrayList<Card> getP2Hand() {


        return p2Hand;
    }

    public void setP2Hand() {
        p2Hand = CreateHand();
    }

    private ArrayList<Card> CreateHand(){
        ArrayList<Card> cards = new ArrayList<Card>();
        for (int i = 0; i < 4; i++) {
            cards.add(deck.generateRandomCard());
        }
        return cards;
    }
}
