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
    // Card width and height
    int cardWidth = 120;
    int cardHeight = 140;
    int max = 5;
    int min = -5;


    public Card generateRandomCard(){
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        while (randomNum == 0){
            randomNum = rand.nextInt((max - min) + 1) + min;
        }
        Card card = new Card(randomNum);
        card.SetText(MakeText(card));
        card.SetRectangle(MakeRectangle());
        return card;
    }

    /**
     * We can create rectangles of the proper card size on the fly.
     *
     * Used to construct a card with SetRectangle(MakeRectangle())
     * @return rectangle
     */
    public Rectangle MakeRectangle(){
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(cardWidth);
        rectangle.setHeight(cardHeight);
        return rectangle;
    }

    /**
     * Creating a text object to be used in our cards.
     *
     * It takes a card object in order to find its value and set the text to that value.
     *
     * Used to construct a card.
     * @param card
     * @return Text object
     */
    public Text MakeText(Card card){
        Text text = new Text();
        text.setText(card.GetValueAsString());
        text.setFill(Color.WHITE);
        text.setFont(Font.font(36));

        text.setTextAlignment(TextAlignment.JUSTIFY);
        text.setBoundsType(TextBoundsType.VISUAL);
        return text;
    }
}
