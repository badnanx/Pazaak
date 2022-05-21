package com.team3.cs210finalprojectteam3;

import java.util.Random;

/**
 * For now, this merely exists in order to generate random cards;
 */
public class Deck {
    private Card card;
    int max = 5;
    int min = -5;

    /**
     * Generate a new Card with random values and return the card to be used elsewhere
     * @return
     */
    public Card generateRandomCard(){ // this is for hand cards; consider renaming: generateRandomHandCard
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        while (randomNum == 0){
            randomNum = rand.nextInt((max - min) + 1) + min;
        }
        Card card = new Card(randomNum);
        card.SetText(Integer.toString(randomNum));
        return card;
    }


    /**
     * Generate a new Card with random values [1-10] and return the card to be played to field.
     * Should be able to use this method to randomly generate the cards
     * to be played to the appropriate playing field at the start of a player's turn.
     *
     * Someone please review! Thank you.
     * @return
     */
//    public Card generateRandomDeckCard() {
//        Random rand = new Random(); //instance of random class
//        final int upperbound = 10;
//        //generate random values from 1-10
//        int int_random = rand.nextInt(upperbound) + 1;
//        Card card = new Card(int_random);
//        card.SetText(Integer.toString(int_random));
//        return card;
//    }

}
