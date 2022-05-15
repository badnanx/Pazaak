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
    public Card generateRandomCard(){
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        while (randomNum == 0){
            randomNum = rand.nextInt((max - min) + 1) + min;
        }
        Card card = new Card(randomNum);
        card.SetText(Integer.toString(randomNum));
        return card;
    }
}
