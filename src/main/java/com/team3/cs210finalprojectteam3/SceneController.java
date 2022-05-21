package com.team3.cs210finalprojectteam3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.*;

public class SceneController implements Initializable{

    public static int p1Count = 0;
    public static int p2Count = 0;



    // removed GameLogic initializer because it is a Singleton and doesn't get initialized

    public Hand p1Hand = new Hand();
    public Hand p2Hand = new Hand();
    public Stage mStage;
    public Scene mScene;
    public Parent mRoot;
    /**
     * Hand panes
     */
    @FXML public StackPane p1HandCardOne;
    @FXML public StackPane p1HandCardTwo;
    @FXML public StackPane p1HandCardThree;
    @FXML public StackPane p1HandCardFour;
    @FXML public StackPane p2HandCardOne;
    @FXML public StackPane p2HandCardTwo;
    @FXML public StackPane p2HandCardThree;
    @FXML public StackPane p2HandCardFour;
//--------------------------------------------------------------------------

//--------------------------------------------------------------------------

    // playing field lists are here
    public List<Rectangle> p1FieldCardRects;
    public List<Text> p1FieldCardTexts;

    public List<Rectangle> p2FieldCardRects;
    public List<Text> p2FieldCardTexts;



//-----------------------------------------------------------------

   // playing field 2 Rectangles are here
    @FXML public Rectangle p2FieldCardRectOne;
    @FXML public Rectangle p2FieldCardRectTwo;
    @FXML public Rectangle p2FieldCardRectThree;
    @FXML public Rectangle p2FieldCardRectFour;
    @FXML public Rectangle p2FieldCardRectFive;
    @FXML public Rectangle p2FieldCardRectSix;
    @FXML public Rectangle p2FieldCardRectSeven;
    @FXML public Rectangle p2FieldCardRectEight;
    @FXML public Rectangle p2FieldCardRectNine;

    public static Rectangle p2FieldCardRectOneStatic;
    public static Rectangle p2FieldCardRectTwoStatic;
    public static Rectangle p2FieldCardRectThreeStatic;
    public static Rectangle p2FieldCardRectFourStatic;
    public static Rectangle p2FieldCardRectFiveStatic;
    public static Rectangle p2FieldCardRectSixStatic;
    public static Rectangle p2FieldCardRectSevenStatic;
    public static Rectangle p2FieldCardRectEightStatic;
    public static Rectangle p2FieldCardRectNineStatic;

//--------------------------------------------------------------------------
    // playing 2 field texts are here
    @FXML public Text p2FieldCardTextOne;
    @FXML public Text p2FieldCardTextTwo;
    @FXML public Text p2FieldCardTextThree;
    @FXML public Text p2FieldCardTextFour;
    @FXML public Text p2FieldCardTextFive;
    @FXML public Text p2FieldCardTextSix;
    @FXML public Text p2FieldCardTextSeven;
    @FXML public Text p2FieldCardTextEight;
    @FXML public Text p2FieldCardTextNine;


    public static Text p2FieldCardOneTextStatic;
    public static Text p2FieldCardTwoTextStatic;
    public static Text p2FieldCardThreeTextStatic;
    public static Text p2FieldCardFourTextStatic;
    public static Text p2FieldCardFiveTextStatic;
    public static Text p2FieldCardSixTextStatic;
    public static Text p2FieldCardSevenTextStatic;
    public static Text p2FieldCardEightTextStatic;
    public static Text p2FieldCardNineTextStatic;


//--------------------------------------------------------
    // playing field 1 Rectangles are here
    @FXML public Rectangle p1FieldCardRectOne;
    @FXML public Rectangle p1FieldCardRectTwo;
    @FXML public Rectangle p1FieldCardRectThree;
    @FXML public Rectangle p1FieldCardRectFour;
    @FXML public Rectangle p1FieldCardRectFive;
    @FXML public Rectangle p1FieldCardRectSix;
    @FXML public Rectangle p1FieldCardRectSeven;
    @FXML public Rectangle p1FieldCardRectEight;
    @FXML public Rectangle p1FieldCardRectNine;

    public static Rectangle p1FieldCardRectOneStatic;
    public static Rectangle p1FieldCardRectTwoStatic;
    public static Rectangle p1FieldCardRectThreeStatic;
    public static Rectangle p1FieldCardRectFourStatic;
    public static Rectangle p1FieldCardRectFiveStatic;
    public static Rectangle p1FieldCardRectSixStatic;
    public static Rectangle p1FieldCardRectSevenStatic;
    public static Rectangle p1FieldCardRectEightStatic;
    public static Rectangle p1FieldCardRectNineStatic;

//--------------------------------------------------------------------------
    // playing field 1 Texts are here
    @FXML public Text p1FieldCardTextOne;
    @FXML public Text p1FieldCardTextTwo;
    @FXML public Text p1FieldCardTextThree;
    @FXML public Text p1FieldCardTextFour;
    @FXML public Text p1FieldCardTextFive;
    @FXML public Text p1FieldCardTextSix;
    @FXML public Text p1FieldCardTextSeven;
    @FXML public Text p1FieldCardTextEight;
    @FXML public Text p1FieldCardTextNine;


    public static Text p1FieldCardOneTextStatic;
    public static Text p1FieldCardTwoTextStatic;
    public static Text p1FieldCardThreeTextStatic;
    public static Text p1FieldCardFourTextStatic;
    public static Text p1FieldCardFiveTextStatic;
    public static Text p1FieldCardSixTextStatic;
    public static Text p1FieldCardSevenTextStatic;
    public static Text p1FieldCardEightTextStatic;
    public static Text p1FieldCardNineTextStatic;


    //--------------------------------------------------------------------------


    /**
     * Hand Rectangles
     */

//----------------------------------------------------------

    @FXML public Rectangle p1RectOne;
    @FXML public Rectangle p1RectTwo;
    @FXML public Rectangle p1RectThree;
    @FXML public Rectangle p1RectFour;

    @FXML public Rectangle p2RectOne;
    @FXML public Rectangle p2RectTwo;
    @FXML public Rectangle p2RectThree;
    @FXML public Rectangle p2RectFour;

    public static Rectangle p1RectOneStatic;
    public static Rectangle p1RectTwoStatic;
    public static Rectangle p1RectThreeStatic;
    public static Rectangle p1RectFourStatic;
    public static Rectangle p2RectOneStatic;
    public static Rectangle p2RectTwoStatic;
    public static Rectangle p2RectThreeStatic;
    public static Rectangle p2RectFourStatic;


//----------------------------------------------------------

    /**
     * Hand Text
     */

    @FXML public Text p1TextOne;
    @FXML public Text p1TextTwo;
    @FXML public Text p1TextThree;
    @FXML public Text p1TextFour;
    @FXML public Text p2TextOne;
    @FXML public Text p2TextTwo;
    @FXML public Text p2TextThree;
    @FXML public Text p2TextFour;

    public static Text p1TextOneStatic;
    public static Text p2TextOneStatic;
    public static Text p1TextTwoStatic;
    public static Text p2TextTwoStatic;
    public static Text p1TextThreeStatic;
    public static Text p2TextThreeStatic;
    public static Text p1TextFourStatic;
    public static Text p2TextFourStatic;
//----------------------------------------------------------


    /**
     * Player Score UI Setup
     */
    @FXML private Text playerOneScoreText;
    @FXML private Text playerTwoScoreText;
    public static Text playerOneScoreTextStatic;
    public static Text playerTwoScoreTextStatic;

    /**
     * Player Hand containers
     */
    public List<Card> p1HandCards;

    public List<Card> p2HandCards;


    /**
     * Special method that allows for things to happen at the very start of the application
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initialize();
    }
    public void initialize(){


        //p1Field---------------------------------------------------------------

        // playing field 1 array lists are here
        p1FieldCardRects = new ArrayList<Rectangle>(9);
        p1FieldCardTexts = new ArrayList<Text>(9);



        p1FieldCardRects.add(p1FieldCardRectOne);
        p1FieldCardRects.add(p1FieldCardRectTwo);
        p1FieldCardRects.add(p1FieldCardRectThree);
        p1FieldCardRects.add(p1FieldCardRectFour);
        p1FieldCardRects.add(p1FieldCardRectFive);
        p1FieldCardRects.add(p1FieldCardRectSix);
        p1FieldCardRects.add(p1FieldCardRectSeven);
        p1FieldCardRects.add(p1FieldCardRectEight);
        p1FieldCardRects.add(p1FieldCardRectNine);

        p1FieldCardTexts.add(p1FieldCardTextOne);
        p1FieldCardTexts.add(p1FieldCardTextTwo);
        p1FieldCardTexts.add(p1FieldCardTextThree);
        p1FieldCardTexts.add(p1FieldCardTextFour);
        p1FieldCardTexts.add(p1FieldCardTextFive);
        p1FieldCardTexts.add(p1FieldCardTextSix);
        p1FieldCardTexts.add(p1FieldCardTextSeven);
        p1FieldCardTexts.add(p1FieldCardTextEight);
        p1FieldCardTexts.add(p1FieldCardTextNine);

        //p2Field---------------------------------------------------------------

        p2FieldCardRects = new ArrayList<Rectangle>(9);
        p2FieldCardTexts = new ArrayList<Text>(9);



        p2FieldCardRects.add(p2FieldCardRectOne);
        p2FieldCardRects.add(p2FieldCardRectTwo);
        p2FieldCardRects.add(p2FieldCardRectThree);
        p2FieldCardRects.add(p2FieldCardRectFour);
        p2FieldCardRects.add(p2FieldCardRectFive);
        p2FieldCardRects.add(p2FieldCardRectSix);
        p2FieldCardRects.add(p2FieldCardRectSeven);
        p2FieldCardRects.add(p2FieldCardRectEight);
        p2FieldCardRects.add(p2FieldCardRectNine);

        p2FieldCardTexts.add(p2FieldCardTextOne);
        p2FieldCardTexts.add(p2FieldCardTextTwo);
        p2FieldCardTexts.add(p2FieldCardTextThree);
        p2FieldCardTexts.add(p2FieldCardTextFour);
        p2FieldCardTexts.add(p2FieldCardTextFive);
        p2FieldCardTexts.add(p2FieldCardTextSix);
        p2FieldCardTexts.add(p2FieldCardTextSeven);
        p2FieldCardTexts.add(p2FieldCardTextEight);
        p2FieldCardTexts.add(p2FieldCardTextNine);



        //----------------------------------------------------------------------
        //GameLogic is a Singleton and doesn't get initialized until it is used for the first time

        // We have to create static references to these texts in order to make them appear properly at runtime
        p1TextOneStatic = p1TextOne;
        p2TextOneStatic = p2TextOne;
        p1TextTwoStatic = p1TextTwo;
        p2TextTwoStatic = p2TextTwo;
        p1TextThreeStatic = p1TextThree;
        p2TextThreeStatic = p2TextThree;
        p1TextFourStatic = p1TextFour;
        p2TextFourStatic = p2TextFour;

        //change color at runtime

        p1RectOneStatic = p1RectOne;
        p1RectTwoStatic = p1RectTwo;
        p1RectThreeStatic = p1RectThree;
        p1RectFourStatic = p1RectFour;
        p2RectOneStatic = p2RectOne;
        p2RectTwoStatic = p2RectTwo;
        p2RectThreeStatic = p2RectThree;
        p2RectFourStatic = p2RectFour;

        //assigning static variables to Score text UI to change at runtime
        playerOneScoreTextStatic = playerOneScoreText;
        playerTwoScoreTextStatic = playerTwoScoreText;

        // Field Card Text

        p1FieldCardOneTextStatic = p1FieldCardTextOne;
        p1FieldCardTwoTextStatic = p1FieldCardTextTwo;
        p1FieldCardThreeTextStatic = p1FieldCardTextThree;
        p1FieldCardFourTextStatic = p1FieldCardTextFour;
        p1FieldCardFiveTextStatic = p1FieldCardTextFive;
        p1FieldCardSixTextStatic = p1FieldCardTextSix;
        p1FieldCardSevenTextStatic = p1FieldCardTextSeven;
        p1FieldCardEightTextStatic = p1FieldCardTextEight;
        p1FieldCardNineTextStatic =  p1FieldCardTextNine;

        // Field Card Rectangle

        p1FieldCardRectOneStatic = p1FieldCardRectOne;
        p1FieldCardRectTwoStatic = p1FieldCardRectTwo;
        p1FieldCardRectThreeStatic = p1FieldCardRectThree;
        p1FieldCardRectFourStatic = p1FieldCardRectFour;
        p1FieldCardRectFiveStatic = p1FieldCardRectFive;
        p1FieldCardRectSixStatic = p1FieldCardRectSix;
        p1FieldCardRectSevenStatic = p1FieldCardRectSeven;
        p1FieldCardRectEightStatic = p1FieldCardRectEight;
        p1FieldCardRectNineStatic = p1FieldCardRectNine;



    }


    private TextField gameTimer;
    private TextField timerUpdate;

    @FXML
    private Label visualTimer;
    @FXML private Button playerOneEndButton;
    @FXML private Circle playerTwoTurnIndicator;
    @FXML private Circle playerOneTurnIndicator;



    public void SwitchtoWelcomeScene(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("welcome-view.fxml"));
        mStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        mScene = new Scene(root);
        mStage.setScene(mScene);
        mStage.show();


    }

    // code for game mechanics starts here

    /**
     * This checks for the full field win condition.
     *  I made it here rather than refactoring p1Count and p2Count to
     *   be in GameLogic.
     *    This violates MVC.
     */
    public void checkForFullField(){
        if(GameLogic.getInstance().p1.score <= 20 && p1Count == 9){
            System.out.println("Player 1 has a full house. Player 1 wins the round!");
            GameLogic.getInstance().p1.roundsWon++;
            GameLogic.getInstance().p1.wonRound = true;
            GameLogic.getInstance().endOfRound = true;
            GameLogic.getInstance().didP1orP2WinGame();
        } else if (GameLogic.getInstance().p2.score <= 20 && p2Count == 9){
            System.out.println("Player 2 has a full house. Player 2 wins the round!");
            GameLogic.getInstance().p2.roundsWon++;
            GameLogic.getInstance().p2.wonRound = true;
            GameLogic.getInstance().endOfRound = true;
            GameLogic.getInstance().didP1orP2WinGame();
        }
    }

    @FXML public void p1ForfeitGame(){
        System.out.println("Player 1 forfeits the game.");
        GameLogic.getInstance().p2.wonGame = true;
        GameLogic.getInstance().gameOver = true;


    }

    @FXML public void p2ForfeitGame(){
        System.out.println("Player 2 forfeits the game.");
        GameLogic.getInstance().p1.wonGame = true;
        GameLogic.getInstance().gameOver = true;

    }

    @FXML
    public void p1Stand(){
        GameLogic.getInstance().p1.hasStood = true;
        playerOneTurnIndicator.setFill(Color.YELLOW);
        System.out.println("DEBUG: Player 1 has stood.");
        if(GameLogic.getInstance().checkForBust(GameLogic.getInstance().p1.score) == true){
            System.out.println("Player 1 has gone bust! Player 2 wins the round!");
            GameLogic.getInstance().p2.roundsWon++;
            GameLogic.getInstance().p2.wonRound = true;
            GameLogic.getInstance().endOfRound = true;
            GameLogic.getInstance().didP1orP2WinGame();
        } else { checkForFullField(); }

        if(GameLogic.getInstance().p2.hasStood == true){
            System.out.println("Both players have stood.");
            GameLogic.getInstance().compareScores(GameLogic.getInstance().p1.score, GameLogic.getInstance().p2.score);
        } else{
            playerTwoTurnIndicator.setFill(Color.GREEN);
            GameLogic.getInstance().turnTracker(1);
        }
        // idea: make player 1's buttons/actions disabled upon stand
        // this is a good idea, look for a way to implement it, I believe that buttons have a function or something
        // that can disable the functionality temporarily
    }

    @FXML
    public void p2Stand(){
        GameLogic.getInstance().p2.hasStood = true;
        playerTwoTurnIndicator.setFill(Color.YELLOW);
        System.out.println("DEBUG: Player 2 has stood.");
        if(GameLogic.getInstance().checkForBust(GameLogic.getInstance().p2.score) == true){
            System.out.println("Player 2 has gone bust! Player 1 wins the round!");
            GameLogic.getInstance().p1.roundsWon++;
            GameLogic.getInstance().p1.wonRound = true;
            GameLogic.getInstance().endOfRound = true;
            GameLogic.getInstance().didP1orP2WinGame();
        }else { checkForFullField(); }

        if(GameLogic.getInstance().p1.hasStood == true){
            System.out.println("Both players have stood.");
            GameLogic.getInstance().compareScores(GameLogic.getInstance().p1.score, GameLogic.getInstance().p2.score);
        } else{
            playerOneTurnIndicator.setFill(Color.GREEN);
            GameLogic.getInstance().turnTracker(2);
        }
        // idea: make player 2's buttons/actions disabled upon stand
    }

    @FXML
    public void playerOneEndTurn(){
        if(GameLogic.getInstance().checkForBust(GameLogic.getInstance().p1.score) == true){
            System.out.println("Player 1 has gone bust! Player 2 wins the round!");
            GameLogic.getInstance().p2.roundsWon++;
            GameLogic.getInstance().p2.wonRound = true;
            GameLogic.getInstance().endOfRound = true;
            GameLogic.getInstance().didP1orP2WinGame();
            // have some fxn that starts new round
        }else { checkForFullField(); }

       if(GameLogic.getInstance().p2.hasStood == true) {

           GameLogic.getInstance().turnTracker(2); // used this just to print whose turn
           playerOneTurnIndicator.setFill(Color.GREEN);

           p1FieldCardTexts.get(p1Count).setText(GameLogic.getInstance().generateRandomDeckCard().GetValueAsString());
           p1FieldCardRects.get(p1Count).setFill(Color.LIGHTBLUE); // consider light blue
           p1Count++;
           // some sort of 'continue play' loop may be good here
       } else{
           GameLogic.getInstance().turnTracker(1);
           playerOneTurnIndicator.setFill(Color.RED);
           playerTwoTurnIndicator.setFill(Color.GREEN);

           p2FieldCardTexts.get(p2Count).setText(GameLogic.getInstance().generateRandomDeckCard().GetValueAsString());
           p2FieldCardRects.get(p2Count).setFill(Color.LIGHTBLUE); // consider light blue
           p2Count++;
           // some kind of gameplay loop may be good here
           // idea: player one's buttons should be disabled if it's not their turn --
           // implement last so we can DEBUG easily
       }


    }

    @FXML
    public void playerTwoEndTurn(){
        if(GameLogic.getInstance().checkForBust(GameLogic.getInstance().p2.score) == true){
            System.out.println("Player 2 has gone bust! Player 1 wins the round!");
            GameLogic.getInstance().p1.roundsWon++;
            GameLogic.getInstance().p1.wonRound = true;
            GameLogic.getInstance().endOfRound = true;
            GameLogic.getInstance().didP1orP2WinGame();
        }else { checkForFullField(); }

        if(GameLogic.getInstance().p1.hasStood == true) {
            GameLogic.getInstance().turnTracker(1);
            playerTwoTurnIndicator.setFill(Color.GREEN);
            // playing deck card to field at start of turn
            p2FieldCardTexts.get(p2Count).setText(GameLogic.getInstance().generateRandomDeckCard().GetValueAsString());
            p2FieldCardRects.get(p2Count).setFill(Color.LIGHTBLUE); // consider light blue
            p2Count++;
            // some sort of 'continue play' loop may be good here
        } else{

            GameLogic.getInstance().turnTracker(2);
            playerTwoTurnIndicator.setFill(Color.RED);
            playerOneTurnIndicator.setFill(Color.GREEN);

            p1FieldCardTexts.get(p1Count).setText(GameLogic.getInstance().generateRandomDeckCard().GetValueAsString());
            p1FieldCardRects.get(p1Count).setFill(Color.LIGHTBLUE); // consider light blue
            p1Count++;
            // some kind of gameplay loop would be good here
            // idea: player one's buttons should be disabled if it's not their turn
        }


    }

    /**
     * This kind of method is pretty typical in UI based programs, every time an action is taken this method should run
     * any methods that update UI, such as when player scores change, or other specific examples we haven't run across
     * yet.
     */
    public void updateUI(){
       updatePlayerScoresUI();
    }

    /**
     * Every time an action is taken we can run this method in order to update each player's score UI.
     */
    private void updatePlayerScoresUI(){

       playerOneScoreTextStatic.setText(Integer.toString(GameLogic.getInstance().p1.score));
       playerTwoScoreTextStatic.setText(Integer.toString(GameLogic.getInstance().p2.score));
    }





    /**
     * The method below gets the value attached to each card in the players
     * hand and parses it to an Integer. After parsing, it checks the value
     * against a conditional statement and acts (changes color) an assigned
     * rectangle.
     *
     * The print statements are kind of safety measures. It lets us know if
     * the code itself is working (or not).
     */


    public void handCardColorChange(){

        int a = Integer.parseInt(p1TextOne.getText());
        int b = Integer.parseInt(p1TextTwo.getText());
        int c = Integer.parseInt(p1TextThree.getText());
        int d = Integer.parseInt(p1TextFour.getText());
        int e = Integer.parseInt(p2TextOne.getText());
        int f = Integer.parseInt(p2TextTwo.getText());
        int g = Integer.parseInt(p2TextThree.getText());
        int h = Integer.parseInt(p2TextFour.getText());


        //A--------------------------------------------
        if(a < 0){
            System.out.println("P1, Card 1: " + a);
            p1RectOneStatic.setFill(Color.RED);

        } else {
            System.out.println("P1, Card 1: " + a);
            p1RectOneStatic.setFill(Color.GREEN);

        }

        //B--------------------------------------------
        if(b < 0){
            System.out.println("P1, Card 2: " + b);
            p1RectTwoStatic.setFill(Color.RED);

        } else {
            System.out.println("P1, Card 2: " + b);
            p1RectTwoStatic.setFill(Color.GREEN);

        }


        //C--------------------------------------------
        if(c < 0){
            System.out.println("P1, Card 3: " + c);
            p1RectThreeStatic.setFill(Color.RED);


        } else {
            System.out.println("P1, Card 3: " + c);
            p1RectThreeStatic.setFill(Color.GREEN);

        }




        //D--------------------------------------------
        if(d < 0){
            System.out.println("P1, Card 4: " + d);
            p1RectFourStatic.setFill(Color.RED);


        } else {
            System.out.println("P1, Card 4: " + d);
            p1RectFourStatic.setFill(Color.GREEN);


        }

        //E--------------------------------------------
        if(e < 0){
            System.out.println("P2, Card 1: " + e);
            p2RectOneStatic.setFill(Color.RED);


        } else {
            System.out.println("P2, Card 1: " + e);
            p2RectOneStatic.setFill(Color.GREEN);


        }

        //F--------------------------------------------
        if(f < 0){
            System.out.println("P2, Card 2: " + f);
            p2RectTwoStatic.setFill(Color.RED);


        } else {
            System.out.println("P2, Card 2: " + f);
            p2RectTwoStatic.setFill(Color.GREEN);


        }

        //G--------------------------------------------
        if(g < 0){
            System.out.println("P2, Card 3: " + g);
            p2RectThreeStatic.setFill(Color.RED);


        } else {
            System.out.println("P2, Card 3: " + g);
            p2RectThreeStatic.setFill(Color.GREEN);


        }

        //H--------------------------------------------
        if(h < 0){
            System.out.println("P2, Card 4: " + h);
            p2RectFourStatic.setFill(Color.RED);


        } else {
            System.out.println("P2, Card 4: " + h);
            p2RectFourStatic.setFill(Color.GREEN);


        }

    }

    //PlayingField field1 = new PlayingField();


    public void passInfoToP1Field(MouseEvent event){

        if(p1Count >= 9){
            // Game end code ++playerwins
            return;
        }
        String buttonClicked = ((StackPane)event.getSource()).getId();
        System.out.println("DEBUG: Clicked " + buttonClicked);

        if(buttonClicked.equals("p1HandCardOne")){
            p1FieldCardRects.get(p1Count).setFill(p1RectOne.getFill());
            p1FieldCardTexts.get(p1Count).setText(p1TextOne.getText());
            checkForFullField();
            // add something that disables and clears played hand card

        } else if(buttonClicked.equals("p1HandCardTwo")){
            p1FieldCardRects.get(p1Count).setFill(p1RectTwo.getFill());
            p1FieldCardTexts.get(p1Count).setText(p1TextTwo.getText());
            checkForFullField();

        } else if (buttonClicked.equals("p1HandCardThree")){
            p1FieldCardRects.get(p1Count).setFill(p1RectThree.getFill());
            p1FieldCardTexts.get(p1Count).setText(p1TextThree.getText());
            checkForFullField();

        }else if (buttonClicked.equals("p1HandCardFour")){
            p1FieldCardRects.get(p1Count).setFill(p1RectFour.getFill());
            p1FieldCardTexts.get(p1Count).setText(p1TextFour.getText());
            checkForFullField();
        }
        p1Count++;


//        String textValue = ((Text)event.getSource()).getText();
//        String buttonClicked = ((Text)event.getSource()).getId();
//
//        p1FieldCardTexts.get(p1Count).setText(textValue);
//
//
//        if(buttonClicked.equals("p1TextOne")){
//            p1FieldCardRects.get(p1Count).setFill(p1RectOne.getFill());
//        } else if(buttonClicked.equals("p1TextTwo")){
//            p1FieldCardRects.get(p1Count).setFill(p1RectTwo.getFill());
//        } else if (buttonClicked.equals("p1TextThree")){
//            p1FieldCardRects.get(p1Count).setFill(p1RectThree.getFill());
//        }else if (buttonClicked.equals("p1TextFour")){
//            p1FieldCardRects.get(p1Count).setFill(p1RectFour.getFill());
//        }
//        p1Count++;

    }
    public void passInfoToP2Field(MouseEvent event){

        String buttonClicked = ((StackPane)event.getSource()).getId();
        System.out.println("DEBUG: Clicked " + buttonClicked);

        if(buttonClicked.equals("p2HandCardOne")){
            p2FieldCardRects.get(p2Count).setFill(p2RectOne.getFill());
            p2FieldCardTexts.get(p2Count).setText(p2TextOne.getText());
            checkForFullField();

        } else if(buttonClicked.equals("p2HandCardTwo")){
            p2FieldCardRects.get(p2Count).setFill(p2RectTwo.getFill());
            p2FieldCardTexts.get(p2Count).setText(p2TextTwo.getText());
            checkForFullField();

        } else if (buttonClicked.equals("p2HandCardThree")){
            p2FieldCardRects.get(p2Count).setFill(p2RectThree.getFill());
            p2FieldCardTexts.get(p2Count).setText(p2TextThree.getText());
            checkForFullField();

        }else if (buttonClicked.equals("p2HandCardFour")){
            p2FieldCardRects.get(p2Count).setFill(p2RectFour.getFill());
            p2FieldCardTexts.get(p2Count).setText(p2TextFour.getText());
            checkForFullField();
        }
        p2Count++;


//        String textValue = ((Text)event.getSource()).getText();
//        String buttonClicked = ((Text)event.getSource()).getId();
//
//        p2FieldCardTexts.get(p2Count).setText(textValue);
//
//
//        if(buttonClicked.equals("p2TextOne")){
//            p2FieldCardRects.get(p2Count).setFill(p2RectOne.getFill());
//        } else if(buttonClicked.equals("p2TextTwo")){
//            p2FieldCardRects.get(p2Count).setFill(p2RectTwo.getFill());
//        } else if (buttonClicked.equals("p2TextThree")){
//            p2FieldCardRects.get(p2Count).setFill(p2RectThree.getFill());
//        }else if (buttonClicked.equals("p2TextFour")){
//            p2FieldCardRects.get(p2Count).setFill(p2RectFour.getFill());
//        }
//        p2Count++;

    }







}

