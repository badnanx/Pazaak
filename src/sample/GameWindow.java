package sample;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.awt.*;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;

/**
 * An example of a simple view, the view is what the user sees, so the JavaFX components will go here
 */
public class GameWindow {
    private Controller controller;
    private GameModel model;

    public Hashtable<String, String> colors;

    private AnchorPane anchorPane;
    private GridPane gridPane;

    public GameWindow(Controller controller, GameModel model){
        CreateHashTable();
        this.controller = controller;
        this.model = model;
    }

    private void CreateHashTable(){
        colors = new Hashtable<String, String>();
        colors.put("LimeGreen","#90EE90");
        colors.put("Blue","#3333FF");
    }

    private TextArea textArea () {
        TextArea textArea = new TextArea();
        textArea.setLayoutX(20);
        textArea.setLayoutY(20);
        textArea.setMaxWidth(450);
        textArea.setMinHeight(380);
        return textArea;
    }

    private TextField textField () {
        TextField textField = new TextField();
        textField.setLayoutX(20);
        textField.setLayoutY(410);
        textField.setMinWidth(450);
        textField.setMinHeight(25);
        return textField;
    }

    private Button button() {
        Button button = new Button("Button");
        button.setLayoutX(240);
        button.setLayoutY(450);
        return button;
    }

    private StackPane p1HandPane(){
        StackPane cardPane = new StackPane();
        GridPane p1HandPane = new GridPane();
        p1HandPane.setStyle("-fx-background: "+colors.get("LimeGreen")+"; -fx-border-color: "+colors.get("LimeGreen")+";");
        p1HandPane.setLayoutX(100);
        p1HandPane.setLayoutY(100);
        Hand p1Hand = model.getP1Hand();
        ArrayList<Card> p1CardsInHand = p1Hand.getP1Hand();
        for (int i = 0; i < p1CardsInHand.size(); i++) {
            cardPane = new StackPane();
            p1HandPane = new GridPane();
            Card card = p1CardsInHand.get(i);
            p1HandPane.add(card.text, 2,1,2,1);
            //Add reverse sign button here
            cardPane.getChildren().addAll(card.rectangle, p1HandPane);

        }
        return cardPane;
    }

    // use this to give the window its elements
    private void addControls    () {
        anchorPane.getChildren().add(0,textArea());
        anchorPane.getChildren().add(1,textField());
        anchorPane.getChildren().add(2,button());
        anchorPane.getChildren().add(3,p1HandPane());
    }

    public void startForm () {
        anchorPane = new AnchorPane();

        anchorPane.setStyle("-fx-background: "+colors.get("Blue")+"; -fx-border-color: "+colors.get("Blue")+";");
        Scene scene = new Scene(anchorPane, 500, 500);
        Stage stage = new Stage();
        stage.setScene(scene);
        addControls();
        stage.show();
    }
}
