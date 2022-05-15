package com.team3.cs210finalprojectteam3;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

/**
 * The logic behind each individual cord object (note, the UI is handled separately in the MVC system normally)
 * This is our Model class
 */
public class Card {
    // value of the Card
    int value;
    // text that will hold a String representation of value
    Text text;
    // The shape, size, color, etc. of the card
    Rectangle rectangle;

    // Default constructor
    public Card(){
        value = 0;
        text = new Text();
        rectangle = new Rectangle();
    }
    /**
     * Takes a value and makes a new card with it, however it will have empty text and rectangle objects that need
     * filling out
     * @param value
     */
    public Card(int value){
        this.value = value;
        text = new Text();
        rectangle = new Rectangle();
    }

    /**
     * A helper method to get the cards value returned as a String
     * @return String of value
     */
    public String GetValueAsString(){
        return Integer.toString(value);
    }

    public void SetValue(int value){
        this.value = value;
    }

    public int GetValue(){
        return value;
    }

    /**
     * We send the Text UI object in and we can manipulate it mid-game
     * @param text
     */
    public void SetText(String text){
        this.text.setText(text);
    }

    /**
     * We send the Rectangle UI object in and we can manipulate it mid-game
     * @param rect
     */
    public void SetRectangle(Rectangle rect){
        this.rectangle = rect;
    }

    public void SetCardColor(int value){
        if (value < 0){
            rectangle.setFill(Color.RED);
        }
        else{
            rectangle.setFill(Color.BLUE);
        }
    }
}