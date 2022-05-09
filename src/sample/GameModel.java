package sample;

import java.util.ArrayList;

/**
 * The model holds references to all of our game objects to be altered by the view as needed
 */
public class GameModel {

    private Hand p1Hand;
    private Hand p2Hand;
    PlayingField field;

    public GameModel(){
        p1Hand = new Hand();
        p2Hand = new Hand();
        field = new PlayingField();
    }

    public Hand getP1Hand() {
        if(p1Hand.getP1Hand() == null){

            p1Hand.setP1Hand();
        }
        return p1Hand;
    }

    public Hand getP2Hand() {
        if(p2Hand == null){
            p2Hand.setP2Hand();
        }
        return p2Hand;
    }

    public PlayingField getField() {
        return field;
    }

    public void setField(PlayingField field) {
        this.field = field;
    }
}
