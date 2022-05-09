package sample;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.text.TextBoundsType;
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

    // this is the main pane that we use to add most other UI elements into,
    // we can use invisible rectangles in order to control the shape of the playing field because
    // gridpanes don't handle empty spaces in a fluid way
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
        colors.put("Charcoal","#34282C");
        colors.put("White","#E5E4E2");
    }

    public Button button(){
        // This is an example
        Button button = new Button("YOLO");
        button.setStyle("-fx-font-size: 22; -fx-background-color: "+colors.get("Charcoal")+"; -fx-text-fill: "+colors.get("White")+";");


        return button;
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
    public static Text MakeText(Card card){
        Text text = new Text();
        text.setText(card.GetValueAsString());
        text.setFill(Color.WHITE);
        text.setFont(Font.font(36));

        text.setTextAlignment(TextAlignment.JUSTIFY);
        text.setBoundsType(TextBoundsType.VISUAL);
        return text;
    }

    /**
     * We can create rectangles of the proper card size on the fly.
     * Takes a boolean to determine if the rectangle is visible or not
     *
     * @return rectangle
     */
    public static javafx.scene.shape.Rectangle MakeRectangle(boolean visible){
        // Card width and height
        int cardWidth = 40;
        int cardHeight = 60;
        javafx.scene.shape.Rectangle rectangle = new Rectangle();
        rectangle.setWidth(cardWidth);
        rectangle.setHeight(cardHeight);
        rectangle.setStyle("-fx-stroke: black; -fx-stroke-width: 2;");
        rectangle.setArcWidth(20);
        rectangle.setArcHeight(20);
        if(!visible){
            rectangle.setOpacity(0.1);
        }

        return rectangle;
    }

    private StackPane[] p1HandPane(){
        StackPane[] cardPane = new StackPane[4];
        GridPane p1HandPane = new GridPane();
        p1HandPane.setStyle("-fx-background: "+colors.get("LimeGreen")+"; -fx-border-color: "+colors.get("LimeGreen")+";");
        p1HandPane.setLayoutX(100);
        p1HandPane.setLayoutY(100);
        return controller.CreateP1HandUI(cardPane,p1HandPane);
    }

    // use this to give the window its elements
    private void addControls    () {

        int count = 0;
        StackPane[] tempArray = p1HandPane();
        GridPane p1HandHolder  = new GridPane();
        for (int i = 0; i < tempArray.length; i++) {
            p1HandHolder.add(tempArray[i],i,1,1,1);
            //anchorPane.getChildren().add(count++,tempArray[i]);
        }
        gridPane.add(p1HandHolder, count++, 1,1,1);
        gridPane.add(button(), count++, 1 ,1,1 );
        System.out.println(count);
    }

    // creates the application window and starts it
    public void startForm () {
        gridPane = new GridPane();
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.setStyle("-fx-background: "+colors.get("Charcoal")+"; -fx-border-color: "+colors.get("Charcoal")+";");
        Scene scene = new Scene(gridPane, 900, 900);
        Stage stage = new Stage();
        stage.setScene(scene);
        addControls();
        stage.show();
    }
}
