package sample;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

import java.util.ArrayList;

/**
 * This class controls the model, anything we want to do with the player's hands or the playing field such as changing
 * cards that can be seen or removing from the Hand will happen here.
 */
public class Controller {
    GameModel model;

    public Controller(GameModel model){
        this.model = model;
    }

    public StackPane[] CreateP1HandUI(StackPane[] cardPane, GridPane p1HandPane){
        Hand p1Hand = model.getP1Hand();
        ArrayList<Card> p1CardsInHand = p1Hand.getP1Hand();
        for (int i = 0; i < p1CardsInHand.size(); i++) {
            cardPane[i] = new StackPane();
            p1HandPane = new GridPane();
            Card card = p1CardsInHand.get(i);
            Text rowFiller = new Text();
            p1HandPane.add(rowFiller,0,0,2,5);
            p1HandPane.add(card.text, 2,1,2,2);
            //Add reverse sign button here, to the gridpane
            cardPane[i].getChildren().addAll(card.rectangle, p1HandPane);

        }
        return cardPane;
    }
}
