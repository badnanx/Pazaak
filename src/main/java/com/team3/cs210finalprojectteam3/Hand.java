package com.team3.cs210finalprojectteam3;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

import java.util.ArrayList;
import java.util.List;

/**
 * Hand class creates a set of four random cards by putting Text and a Rectangle into a StackPane, and keeping
 * those StackPanes in an array to be iterated over;
 * @author Kory Stennett
 */
public class Hand {

    int length;
    public Deck deck;
    public Card card;
    public List<Card> hand;

    /**
     * Create two Hands in the SceneController, one for P1, one for P2, just by calling on this constructor,
     * the hand should be populated automatically.
     */
    public Hand(){
        length = 4;
        deck = new Deck();
        hand = CreateHand();
    }

    /**
     * This method gets used by SceneController to create fresh hands for each player.
     * @return StackPane array
     */
    public ArrayList<Card> CreateHand(){
        ArrayList<Card> handPanes = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            card = deck.generateRandomCard();
            handPanes.add(card);
        }
        return handPanes;
    }


}
