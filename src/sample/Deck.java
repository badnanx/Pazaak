package sample;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.text.TextBoundsType;

import java.util.Random;

/**
 * The deck of cards to pull from
 */
public class Deck {
    private Card card;

    int max = 5;
    int min = -5;

    public Card generateRandomCard(){
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        while (randomNum == 0){
            randomNum = rand.nextInt((max - min) + 1) + min;
        }
        Card card = new Card(randomNum);
        card.SetText(GameWindow.MakeText(card));
        card.SetRectangle(GameWindow.MakeRectangle(true));
        card.SetCardColor(card.GetValue());
        return card;
    }

}
