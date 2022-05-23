package com.team3.cs210finalprojectteam3;

import javafx.application.Platform;
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

    public static int p1Count;
    public static int p2Count;


    // removed GameLogic initializer because it is a Singleton and doesn't get initialized

    public Hand p1Hand;
    public Hand p2Hand;
    public static Stage mStage;
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

    // Round indicator lights go here
    @FXML public Rectangle p1FirstRoundWinIndicator;
    @FXML public Rectangle p1SecondRoundWinIndicator;
    @FXML public Rectangle p1ThirdRoundWinIndicator;

    @FXML public Rectangle p2FirstRoundWinIndicator;
    @FXML public Rectangle p2SecondRoundWinIndicator;
    @FXML public Rectangle p2ThirdRoundWinIndicator;

    @FXML public static Rectangle p1FirstRoundWinIndicatorStatic;
    @FXML public static Rectangle p1SecondRoundWinIndicatorStatic;
    @FXML public static Rectangle p1ThirdRoundWinIndicatorStactic;

    @FXML public static Rectangle p2FirstRoundWinIndicatorStatic;
    @FXML public static Rectangle p2SecondRoundWinIndicatorStatic;
    @FXML public static Rectangle p2ThirdRoundWinIndicatorStatic;

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

    //setting up the info text in the game view

    @FXML private Text infoText;


    public void SetStage(Stage stage){
        mStage = stage;
    }


    /**
     * Special method that allows for things to happen at the very start of the application
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initialize();
    }

    /**
     * Going to take advantage of this method in order to reset the field between rounds and wins, but it also
     * starts the game for the first time and initializes all of the field and hand elements used in the game
     */
    public void initialize(){
        newHand();
        newUIEnvironment();

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

        // Round indicators

        p1FirstRoundWinIndicatorStatic = p1FirstRoundWinIndicator;
        p1SecondRoundWinIndicatorStatic = p1SecondRoundWinIndicator;
        p1ThirdRoundWinIndicatorStactic = p1ThirdRoundWinIndicator;

        p2FirstRoundWinIndicatorStatic = p2FirstRoundWinIndicator;
        p2SecondRoundWinIndicatorStatic = p2SecondRoundWinIndicator;
        p2ThirdRoundWinIndicatorStatic = p2ThirdRoundWinIndicator;
    }


    private TextField gameTimer;
    private TextField timerUpdate;

    @FXML
    private Label visualTimer;
    @FXML private Button playerOneEndButton;
    @FXML private Circle playerTwoTurnIndicator;
    @FXML private Circle playerOneTurnIndicator;

    /**
     * Used in creating a new game, as only when a new game (not round) starts will we have a need for a new hand
     */
    public void newHand(){
        // moved these here so we can reset them when needed
        p1Hand = new Hand();
        p2Hand = new Hand();

        p1HandCards = new ArrayList<>();
        p2HandCards = new ArrayList<>();
        p1HandCards = p1Hand.hand;
        p2HandCards = p2Hand.hand;
    }

    /**
     * When we create a new game, or reset the game, we need to separate this bit of code from the initialize method
     * because the initialize method attempts to reinitialize static variables which doesn't work and won't refresh
     * UI elements properly
     *
     * Using this we can reset the game and have new Hand texts appear properly.
     */
    public void newUIEnvironment(){

        //p1Field---------------------------------------------------------------

        // playing field 1 array lists are here
        p1FieldCardRects = new ArrayList<Rectangle>(9);
        p1FieldCardTexts = new ArrayList<Text>(9);



        p1Count = 0;
        p2Count = 0;
        GameLogic.getInstance().p1.score = 0;
        GameLogic.getInstance().p2.score = 0;

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



    }

    public void resetBetweenRounds(){
        newUIEnvironment();
        playerOneTurnIndicator.setFill(Color.GREEN);
        playerTwoTurnIndicator.setFill(Color.RED);
        for(Rectangle rect : p1FieldCardRects){
            rect.setFill(Color.LIGHTGRAY);
        }
        for(Text text : p1FieldCardTexts){
            text.setText("");
        }
        for(Rectangle rect : p2FieldCardRects){
            rect.setFill(Color.LIGHTGRAY);
        }
        for(Text text : p2FieldCardTexts){
            text.setText("");
        }
        GameLogic.getInstance().roundReset();

        disableP1Clicks();
        disableP2Clicks();
        startRoundBtn.setDisable(false);

        updateUI();
    }

    /**
     * Use this when we want a blank slate/fresh game, this will reset the field and renew each player's hands
     */
    public void ResetGameEnvironment(){
            newHand();
            newUIEnvironment();
            playerOneTurnIndicator.setFill(Color.GREEN);
            playerTwoTurnIndicator.setFill(Color.RED);
            p1TextOne = p1HandCards.get(0).text;
            p1TextTwo = p1HandCards.get(1).text;
            p1TextThree = p1HandCards.get(2).text;
            p1TextFour = p1HandCards.get(3).text;
            p2TextOne = p2HandCards.get(0).text;
            p2TextTwo = p2HandCards.get(1).text;
            p2TextThree = p2HandCards.get(2).text;
            p2TextFour = p2HandCards.get(3).text;


            p1TextOneStatic.setText(p1HandCards.get(0).text.getText());
            p1TextTwoStatic.setText(p1TextTwo.getText());
            p1TextThreeStatic.setText(p1TextThree.getText());
            p1TextFourStatic.setText(p1TextFour.getText());
            p2TextOneStatic.setText(p2TextOne.getText());
            p2TextTwoStatic.setText(p2TextTwo.getText());
            p2TextThreeStatic.setText(p2TextThree.getText());
            p2TextFourStatic.setText(p2TextFour.getText());
            System.out.println(p1TextOneStatic.getText() + "first card value");
            // this method has to run here or else is won't update colors with the actual values
            handCardColorChange();
            for(Rectangle rect : p1FieldCardRects){
                rect.setFill(Color.LIGHTGRAY);
            }
            for(Text text : p1FieldCardTexts){
                text.setText("");
            }
            for(Rectangle rect : p2FieldCardRects){
                rect.setFill(Color.LIGHTGRAY);
            }
            for(Text text : p2FieldCardTexts){
                text.setText("");
            }

        disableP1Clicks();
        disableP2Clicks();
        startRoundBtn.setDisable(false);
        GameLogic.getInstance().winReset();
        playerWinIndicatorReset();
        /*Platform.runLater(new Runnable() {
            @Override
            public void run() {

                p1TextOne = p1HandCards.get(0).text;
                //System.out.println(p1TextOne.getText());
                p1TextTwo = p1HandCards.get(1).text;
                p1TextThree = p1HandCards.get(2).text;
                p1TextFour = p1HandCards.get(3).text;
                p2TextOne = p2HandCards.get(0).text;
                p2TextTwo = p2HandCards.get(1).text;
                p2TextThree = p2HandCards.get(2).text;
                p2TextFour = p2HandCards.get(3).text;


                p1TextOneStatic.setText(p1TextOne.getText());
                p1TextTwoStatic.setText(p1TextTwo.getText());
                p1TextThreeStatic.setText(p1TextThree.getText());
                p1TextFourStatic.setText(p1TextFour.getText());
                p2TextOneStatic.setText(p2TextOne.getText());
                p2TextTwoStatic.setText(p2TextTwo.getText());
                p2TextThreeStatic.setText(p2TextThree.getText());
                p2TextFourStatic.setText(p2TextFour.getText());
                System.out.println(p1TextOneStatic.getText() + "first card value");
                // this method has to run here or else is won't update colors with the actual values
                handCardColorChange();
            }
        });*/

        // just a placeholder to test functionality of score UI updating
        updateUI();






    }

    private void SetInfoText(String text){
        infoText.setText(text);
    }

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
        System.out.println("DEBUG: p1Count = " + p1Count);
        System.out.println("DEBUG: p2Count = " + p2Count);
        if(GameLogic.getInstance().p1.score <= 20 && p1Count == 9){
            System.out.println("Player 1 has a full house. Player 1 wins the round!");
            SetInfoText("Player 1 has a full house. Player 1 wins the round!");
            GameLogic.getInstance().p1.roundsWon++;
            GameLogic.getInstance().p1.wonRound = true;
            GameLogic.getInstance().endOfRound = true;

            System.out.println("DEBUG: Player 1 rounds won = " + GameLogic.getInstance().p1.roundsWon);
            System.out.println("DEBUG: Player 2 rounds won = " + GameLogic.getInstance().p2.roundsWon);
//            if(GameLogic.getInstance().didP1orP2WinGame()){
//                ResetGameEnvironment();
//            }
            if(GameLogic.getInstance().didP1orP2WinGame()){
                SetInfoText("Player 1 Has Won The Entire Game!");
                ResetGameEnvironment();
            }else{
                resetBetweenRounds();
            }
            return;
        } else if (GameLogic.getInstance().p2.score <= 20 && p2Count == 9){
            System.out.println("DEBUG: p1Count = " + p1Count);
            System.out.println("DEBUG: p2Count = " + p2Count);
            System.out.println("Player 2 has a full house. Player 2 wins the round!");
            SetInfoText("Player 2 has a full house. Player 2 wins the round!");
            GameLogic.getInstance().p2.roundsWon++;
            GameLogic.getInstance().p2.wonRound = true;
            GameLogic.getInstance().endOfRound = true;

            System.out.println("DEBUG: Player 1 rounds won = " + GameLogic.getInstance().p1.roundsWon);
            System.out.println("DEBUG: Player 2 rounds won = " + GameLogic.getInstance().p2.roundsWon);
//            if(GameLogic.getInstance().didP1orP2WinGame()){
//                ResetGameEnvironment();
//            }else{
//                resetBetweenRounds();
//            }
            if(GameLogic.getInstance().didP1orP2WinGame()){
                SetInfoText("Player 2 Has Won The Entire Game!");
                ResetGameEnvironment();
            }else{
                resetBetweenRounds();
            }
            return;
        }

    }

    @FXML Button p1EndBtn;
    @FXML Button p1StandBtn;

    public void disableP1Clicks(){
        p1HandCardOne.setDisable(true);
        p1HandCardTwo.setDisable(true);
        p1HandCardThree.setDisable(true);
        p1HandCardFour.setDisable(true);

        p1EndBtn.setDisable(true);
        p1StandBtn.setDisable(true);
    }

    public void enableP1Clicks(){
        p1HandCardOne.setDisable(false);
        p1HandCardTwo.setDisable(false);
        p1HandCardThree.setDisable(false);
        p1HandCardFour.setDisable(false);

        p1EndBtn.setDisable(false);
        p1StandBtn.setDisable(false);
    }

    @FXML Button p2EndBtn;
    @FXML Button p2StandBtn;

    public void disableP2Clicks(){
        p2HandCardOne.setDisable(true);
        p2HandCardTwo.setDisable(true);
        p2HandCardThree.setDisable(true);
        p2HandCardFour.setDisable(true);

        p2EndBtn.setDisable(true);
        p2StandBtn.setDisable(true);
    }

    public void enableP2Clicks(){
        p2HandCardOne.setDisable(false);
        p2HandCardTwo.setDisable(false);
        p2HandCardThree.setDisable(false);
        p2HandCardFour.setDisable(false);

        p2EndBtn.setDisable(false);
        p2StandBtn.setDisable(false);
    }

    @FXML Button startRoundBtn;

    @FXML public void startRoundBtnAction(){
        // player 1 always goes first
        enableP1Clicks();
        disableP2Clicks();
        SetInfoText("Player 1's Turn");
        p1FieldCardTexts.get(p1Count).setText(GameLogic.getInstance().generateRandomDeckCard().GetValueAsString());
        p1FieldCardRects.get(p1Count).setFill(Color.SEAGREEN);
        p1Count++;
        GameLogic.getInstance().calculateScores(p1FieldCardTexts,1);

        startRoundBtn.setDisable(true);
        updateUI();

    }



    @FXML public void p1ForfeitGame(){
        System.out.println("Player 1 forfeits the game.");
        SetInfoText("Whaaa? Player 1 Forfeits the Game!");
        GameLogic.getInstance().p2.wonGame = true;
        GameLogic.getInstance().gameOver = true;

        System.out.println("DEBUG: Player 1 has won " + GameLogic.getInstance().p1.gamesWon + " games.");
        System.out.println("DEBUG: Player 2 has won " + GameLogic.getInstance().p2.gamesWon + " games.");

        // testing resetting game
        ResetGameEnvironment();
        GameLogic.getInstance().roundReset();
    }

    @FXML public void p2ForfeitGame(){
        System.out.println("Player 2 forfeits the game.");
        SetInfoText("OMG? Player 2 Forfeits the Game!");
        GameLogic.getInstance().p1.wonGame = true;
        GameLogic.getInstance().gameOver = true;

        System.out.println("DEBUG: Player 1 has won " + GameLogic.getInstance().p1.gamesWon + " games.");
        System.out.println("DEBUG: Player 2 has won " + GameLogic.getInstance().p2.gamesWon + " games.");

        ResetGameEnvironment();
        GameLogic.getInstance().roundReset();
    }

    @FXML
    public void p1Stand(){
        SetInfoText("Player 1 Has Chosen to Stand.");
        disableP1Clicks();
        if(GameLogic.getInstance().p2.hasStood==false) {
            enableP2Clicks();
        }

        GameLogic.getInstance().p1.hasStood = true;
        playerOneTurnIndicator.setFill(Color.YELLOW);
        System.out.println("DEBUG: Player 1 has stood.");
        // bust logic
        if(GameLogic.getInstance().checkForBust(GameLogic.getInstance().p1.score) == true){
            System.out.println("Player 1 has gone bust! Player 2 wins the round!");
            SetInfoText("Player 1 Busts. Player 2 Wins the Round!");
            GameLogic.getInstance().p2.roundsWon++;
            GameLogic.getInstance().p2.wonRound = true;
            GameLogic.getInstance().endOfRound = true;

            System.out.println("DEBUG: Player 1 rounds won = " + GameLogic.getInstance().p1.roundsWon);
            System.out.println("DEBUG: Player 2 rounds won = " + GameLogic.getInstance().p2.roundsWon);
//            if(GameLogic.getInstance().didP1orP2WinGame()){
//                ResetGameEnvironment();
//                return;
//            }
            if(GameLogic.getInstance().didP1orP2WinGame()){
                SetInfoText("Player 2 Has Won The Entire Game!");
                ResetGameEnvironment();
            }else{
                resetBetweenRounds();
            }
            return;

        } else { checkForFullField(); }

        if(GameLogic.getInstance().p2.hasStood == true){
            System.out.println("Both players have stood.");
            int playerWinNumber = GameLogic.getInstance().compareScores(GameLogic.getInstance().p1.score, GameLogic.getInstance().p2.score);
            if(playerWinNumber == 0){
                SetInfoText("Both players have stood. The round is a draw!");
            }
            else if(playerWinNumber == 1){
                SetInfoText("Both players have stood. Player 1 Wins the Round!");
            }
            else{
                SetInfoText("Both players have stood. Player 2 Wins the Round!");
            }
            if(GameLogic.getInstance().didP1orP2WinGame()){
                SetInfoText("Player 2 Has Won The Entire Game!");
                ResetGameEnvironment();
            }else{

                resetBetweenRounds();
            }

        } else{
            playerTwoTurnIndicator.setFill(Color.GREEN);
            p2FieldCardTexts.get(p2Count).setText(GameLogic.getInstance().generateRandomDeckCard().GetValueAsString());
            p2FieldCardRects.get(p2Count).setFill(Color.SEAGREEN); // consider light blue
            p2Count++;
            checkForFullField();
            // insert draw card for p2
            GameLogic.getInstance().turnTracker(1);
            GameLogic.getInstance().calculateScores(p2FieldCardTexts,2);
            updateUI();
        }



    }

    @FXML
    public void p2Stand(){
        SetInfoText("Player 2 Has Chosen to Stand.");
        disableP2Clicks();
        if(GameLogic.getInstance().p1.hasStood==false) {
            enableP1Clicks();
        }

        GameLogic.getInstance().p2.hasStood = true;
        playerTwoTurnIndicator.setFill(Color.YELLOW);
        System.out.println("DEBUG: Player 2 has stood.");
        // bust logic
        if(GameLogic.getInstance().checkForBust(GameLogic.getInstance().p2.score) == true){
            System.out.println("Player 2 has gone bust! Player 1 wins the round!");
            GameLogic.getInstance().p1.roundsWon++;
            GameLogic.getInstance().p1.wonRound = true;
            GameLogic.getInstance().endOfRound = true;

            System.out.println("DEBUG: Player 1 rounds won = " + GameLogic.getInstance().p1.roundsWon);
            System.out.println("DEBUG: Player 2 rounds won = " + GameLogic.getInstance().p2.roundsWon);
           // disableP1Clicks();
            if(GameLogic.getInstance().didP1orP2WinGame()){
                SetInfoText("Player 1 Has Won The Entire Game!");
                ResetGameEnvironment();
            }else{
                resetBetweenRounds();
            }
            return;
        }else { checkForFullField(); }

        if(GameLogic.getInstance().p1.hasStood == true){
            System.out.println("Both players have stood.");
            int playerWinNumber = GameLogic.getInstance().compareScores(GameLogic.getInstance().p1.score, GameLogic.getInstance().p2.score);
            if(playerWinNumber == 0){
                SetInfoText("Both players have stood. The round is a draw!");
            }
            else if(playerWinNumber == 1){
                SetInfoText("Both players have stood. Player 1 Wins the Round!");
            }
            else{
                SetInfoText("Both players have stood. Player 2 Wins the Round!");
            }
            if(GameLogic.getInstance().didP1orP2WinGame()){
                SetInfoText("Player 1 Has Won The Entire Game!");
                ResetGameEnvironment();
            }else{

                resetBetweenRounds();
            }
        } else{
            playerOneTurnIndicator.setFill(Color.GREEN);
            p1FieldCardTexts.get(p1Count).setText(GameLogic.getInstance().generateRandomDeckCard().GetValueAsString());
            p1FieldCardRects.get(p1Count).setFill(Color.SEAGREEN);
            p1Count++;
            checkForFullField();
            GameLogic.getInstance().turnTracker(2);
            GameLogic.getInstance().calculateScores(p1FieldCardTexts,1);
            updateUI();
        }

    }

    @FXML
    public void playerOneEndTurn(){
        if(GameLogic.getInstance().p2.hasStood==false){
            disableP1Clicks();
            enableP2Clicks();
        }
        // bust logic
        if(GameLogic.getInstance().checkForBust(GameLogic.getInstance().p1.score) == true){
            System.out.println("Player 1 has gone bust! Player 2 wins the round!");
            SetInfoText("Player 1 Busts. Player 2 Wins!");
            GameLogic.getInstance().p2.roundsWon++;
            GameLogic.getInstance().p2.wonRound = true;
            GameLogic.getInstance().endOfRound = true;

            System.out.println("DEBUG: Player 1 rounds won = " + GameLogic.getInstance().p1.roundsWon);
            System.out.println("DEBUG: Player 2 rounds won = " + GameLogic.getInstance().p2.roundsWon);

            if(GameLogic.getInstance().didP1orP2WinGame()){
                SetInfoText("Player 2 Has Won The Entire Game!");
                ResetGameEnvironment();
            }else{
                resetBetweenRounds();
            }
            return;

            // have some fxn that starts new round
        }else { checkForFullField(); }

       if(GameLogic.getInstance().p2.hasStood == true) {

           GameLogic.getInstance().turnTracker(2); // used this just to print whose turn
          // playerOneTurnIndicator.setFill(Color.GREEN);
            SetInfoText("Player 2 Has Stood. Player 1 Goes Again.");
           p1FieldCardTexts.get(p1Count).setText(GameLogic.getInstance().generateRandomDeckCard().GetValueAsString());
           p1FieldCardRects.get(p1Count).setFill(Color.SEAGREEN);
           p1Count++;
           checkForFullField();
           enableP1Clicks();

           // updating score behind the scenes since this player's field has changed.
           GameLogic.getInstance().calculateScores(p1FieldCardTexts,1);
       } else{
           GameLogic.getInstance().turnTracker(1);
           playerOneTurnIndicator.setFill(Color.RED);
           playerTwoTurnIndicator.setFill(Color.GREEN);
            SetInfoText("Player 2's Turn.");
           p2FieldCardTexts.get(p2Count).setText(GameLogic.getInstance().generateRandomDeckCard().GetValueAsString());
           p2FieldCardRects.get(p2Count).setFill(Color.SEAGREEN); // consider light blue
           p2Count++;
           checkForFullField();

           // updating score behind the scenes since this player's field has changed.
           GameLogic.getInstance().calculateScores(p2FieldCardTexts,2);
       }
        // Here I will add the logic to update the UI, since the playing field is guaranteed to have
        // changed by this point.
        updateUI();
    }

    @FXML
    public void playerTwoEndTurn(){
        if(GameLogic.getInstance().p1.hasStood==false){
            disableP2Clicks();
            enableP1Clicks();
        }
        // bust logic
        if(GameLogic.getInstance().checkForBust(GameLogic.getInstance().p2.score) == true){
            System.out.println("Player 2 has gone bust! Player 1 wins the round!");
            GameLogic.getInstance().p1.roundsWon++;
            GameLogic.getInstance().p1.wonRound = true;
            GameLogic.getInstance().endOfRound = true;
            SetInfoText("Player 2 busts. Player 1 Wins!");
            System.out.println("DEBUG: Player 1 rounds won = " + GameLogic.getInstance().p1.roundsWon);
            System.out.println("DEBUG: Player 2 rounds won = " + GameLogic.getInstance().p2.roundsWon);

            if(GameLogic.getInstance().didP1orP2WinGame()){
                SetInfoText("Player 1 Has Won The Entire Game!");
                ResetGameEnvironment();
            }else{
                resetBetweenRounds();
            }
            return;
        }else { checkForFullField(); }

        if(GameLogic.getInstance().p1.hasStood == true) {
            GameLogic.getInstance().turnTracker(1);
            //playerTwoTurnIndicator.setFill(Color.GREEN);
            // playing deck card to field at start of turn
            p2FieldCardTexts.get(p2Count).setText(GameLogic.getInstance().generateRandomDeckCard().GetValueAsString());
            p2FieldCardRects.get(p2Count).setFill(Color.SEAGREEN); // consider light blue
            p2Count++;
            SetInfoText("Player 1 Has Stood. Player 2 Goes Again.");
            enableP2Clicks();
            checkForFullField();
            // some sort of 'continue play' loop may be good here

            // updating score behind the scenes since this player's field has changed.
            GameLogic.getInstance().calculateScores(p2FieldCardTexts,2);
        } else{
            SetInfoText("Player 1's Turn.");
            GameLogic.getInstance().turnTracker(2);
            playerTwoTurnIndicator.setFill(Color.RED);
            playerOneTurnIndicator.setFill(Color.GREEN);

            p1FieldCardTexts.get(p1Count).setText(GameLogic.getInstance().generateRandomDeckCard().GetValueAsString());
            p1FieldCardRects.get(p1Count).setFill(Color.SEAGREEN); // consider light blue
            p1Count++;

            // some kind of gameplay loop would be good here
            // idea: player one's buttons should be disabled if it's not their turn

            // updating score behind the scenes since this player's field has changed.
            GameLogic.getInstance().calculateScores(p1FieldCardTexts,1);
            checkForFullField();
        }
        // Here I will add the logic to update the UI, since the playing field is guaranteed to have
        // changed by this point.
        updateUI();

    }

    /**
     * This kind of method is pretty typical in UI based programs, every time an action is taken this method should run
     * any methods that update UI, such as when player scores change, or other specific examples we haven't run across
     * yet.
     */
    public void updateUI(){
        playerWinIndicator();
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
            p1RectOneStatic.setFill(Color.INDIANRED);

        } else {
            System.out.println("P1, Card 1: " + a);
            p1RectOneStatic.setFill(Color.STEELBLUE);

        }

        //B--------------------------------------------
        if(b < 0){
            System.out.println("P1, Card 2: " + b);
            p1RectTwoStatic.setFill(Color.INDIANRED);

        } else {
            System.out.println("P1, Card 2: " + b);
            p1RectTwoStatic.setFill(Color.STEELBLUE);

        }


        //C--------------------------------------------
        if(c < 0){
            System.out.println("P1, Card 3: " + c);
            p1RectThreeStatic.setFill(Color.INDIANRED);


        } else {
            System.out.println("P1, Card 3: " + c);
            p1RectThreeStatic.setFill(Color.STEELBLUE);

        }




        //D--------------------------------------------
        if(d < 0){
            System.out.println("P1, Card 4: " + d);
            p1RectFourStatic.setFill(Color.INDIANRED);


        } else {
            System.out.println("P1, Card 4: " + d);
            p1RectFourStatic.setFill(Color.STEELBLUE);


        }

        //E--------------------------------------------
        if(e < 0){
            System.out.println("P2, Card 1: " + e);
            p2RectOneStatic.setFill(Color.INDIANRED);


        } else {
            System.out.println("P2, Card 1: " + e);
            p2RectOneStatic.setFill(Color.STEELBLUE);


        }

        //F--------------------------------------------
        if(f < 0){
            System.out.println("P2, Card 2: " + f);
            p2RectTwoStatic.setFill(Color.INDIANRED);


        } else {
            System.out.println("P2, Card 2: " + f);
            p2RectTwoStatic.setFill(Color.STEELBLUE);


        }

        //G--------------------------------------------
        if(g < 0){
            System.out.println("P2, Card 3: " + g);
            p2RectThreeStatic.setFill(Color.INDIANRED);


        } else {
            System.out.println("P2, Card 3: " + g);
            p2RectThreeStatic.setFill(Color.STEELBLUE);


        }

        //H--------------------------------------------
        if(h < 0){
            System.out.println("P2, Card 4: " + h);
            p2RectFourStatic.setFill(Color.INDIANRED);


        } else {
            System.out.println("P2, Card 4: " + h);
            p2RectFourStatic.setFill(Color.STEELBLUE);


        }

    }

    //PlayingField field1 = new PlayingField();

    /**
     * Disables player 1's hand cards from being clicked (played).
     */
    public void disableP1HandClicks(){
        p1HandCardOne.setDisable(true);
        p1HandCardTwo.setDisable(true);
        p1HandCardThree.setDisable(true);
        p1HandCardFour.setDisable(true);
    }

    /**
     * Enables player 1's hand cards to be clicked (played).
     */
    public void enableP1HandClicks(){
        p1HandCardOne.setDisable(false);
        p1HandCardTwo.setDisable(false);
        p1HandCardThree.setDisable(false);
        p1HandCardFour.setDisable(false);
    }

    public void passInfoToP1Field(MouseEvent event){

        if(p1Count >= 9){
            // Game end code ++playerwins
            return;
        }

        String buttonClicked = ((StackPane)event.getSource()).getId();
        System.out.println("DEBUG: Clicked " + buttonClicked);


        if(buttonClicked.equals("p1HandCardOne")){

            // Stops player from playing a spent/empty card.
            if(p1TextOne.getText() == "0") {
                System.out.println("Empty card slot. Do something else.");
                SetInfoText("Can't play that card.");
                return;
            }

            p1FieldCardRects.get(p1Count).setFill(p1RectOne.getFill());
            p1FieldCardTexts.get(p1Count).setText(p1TextOne.getText());

            // UI changes (GRAY, "0") signal to player and program the card is spent/empty
            p1RectOne.setFill(Color.GRAY);
            p1TextOne.setText("0");


        } else if(buttonClicked.equals("p1HandCardTwo")){

            // Stops player from playing a spent/empty card.
            if(p1TextTwo.getText() == "0") {
                System.out.println("Empty card slot. Do something else.");
                SetInfoText("Can't play that card.");
                return;
            }

            p1FieldCardRects.get(p1Count).setFill(p1RectTwo.getFill());
            p1FieldCardTexts.get(p1Count).setText(p1TextTwo.getText());

            // UI changes (GRAY, "0") signal to player and program the card is spent/empty
            p1RectTwo.setFill(Color.GRAY);
            p1TextTwo.setText("0");


        } else if (buttonClicked.equals("p1HandCardThree")){
            // Stops player from playing a spent/empty card.
            if(p1TextThree.getText() == "0") {
                System.out.println("Empty card slot. Do something else.");
                SetInfoText("Can't play that card.");
                return;
            }

            p1FieldCardRects.get(p1Count).setFill(p1RectThree.getFill());
            p1FieldCardTexts.get(p1Count).setText(p1TextThree.getText());

            // UI changes (GRAY, "0") signal to player and program the card is spent/empty
            p1RectThree.setFill(Color.GRAY);
            p1TextThree.setText("0");


        }else if (buttonClicked.equals("p1HandCardFour")){

            // Stops player from playing a spent/empty card.
            if(p1TextFour.getText() == "0") {
                System.out.println("Empty card slot. Do something else.");
                SetInfoText("Can't play that card.");
                return;
            }

            p1FieldCardRects.get(p1Count).setFill(p1RectFour.getFill());
            p1FieldCardTexts.get(p1Count).setText(p1TextFour.getText());

            // UI changes (GRAY, "0") signal to player and program the card is spent/empty
            p1RectFour.setFill(Color.GRAY);
            p1TextFour.setText("0");

        }
        disableP1HandClicks(); // stops player from playing more than one hand card per turn
        p1Count++;
        checkForFullField();

        // updating score behind the scenes since this player's field has changed.
        GameLogic.getInstance().calculateScores(p1FieldCardTexts,1);
        SetInfoText("Player 1 Played a Hand Card");
        // Here I will add the logic to update the UI, since the playing field is guaranteed to have
        // changed by this point.
        updateUI();
    }

    /**
     * Disables player 2's hand cards from being clicked (played).
     */
    public void disableP2HandClicks(){
        p2HandCardOne.setDisable(true);
        p2HandCardTwo.setDisable(true);
        p2HandCardThree.setDisable(true);
        p2HandCardFour.setDisable(true);
    }

    /**
     * Enables player 2's hand cards to be clicked (played).
     */
    public void enableP2HandClicks(){
        p2HandCardOne.setDisable(false);
        p2HandCardTwo.setDisable(false);
        p2HandCardThree.setDisable(false);
        p2HandCardFour.setDisable(false);
    }


    public void passInfoToP2Field(MouseEvent event){

        String buttonClicked = ((StackPane)event.getSource()).getId();
        System.out.println("DEBUG: Clicked " + buttonClicked);

        if(buttonClicked.equals("p2HandCardOne")){
            // stops spent/empty card from being played
            if(p2TextOne.getText() == "0") {
                System.out.println("Empty card slot. Do something else.");
                SetInfoText("Can't play that card.");
                return;
            }
            p2FieldCardRects.get(p2Count).setFill(p2RectOne.getFill());
            p2FieldCardTexts.get(p2Count).setText(p2TextOne.getText());
            // UI changes (GRAY, "0") signal to player and program the card is spent/empty
            p2RectOne.setFill(Color.GRAY);
            p2TextOne.setText("0");

        } else if(buttonClicked.equals("p2HandCardTwo")){

            // stops spent/empty card from being played
            if(p2TextTwo.getText() == "0") {
                System.out.println("Empty card slot. Do something else.");
                SetInfoText("Can't play that card.");
                return;
            }
            p2FieldCardRects.get(p2Count).setFill(p2RectTwo.getFill());
            p2FieldCardTexts.get(p2Count).setText(p2TextTwo.getText());
            // UI changes (GRAY, "0") signal to player and program the card is spent/empty
            p2RectTwo.setFill(Color.GRAY);
            p2TextTwo.setText("0");

        } else if (buttonClicked.equals("p2HandCardThree")){
            // stops spent/empty card from being played
            if(p2TextThree.getText() == "0") {
                System.out.println("Empty card slot. Do something else.");
                SetInfoText("Can't play that card.");
                return;
            }
            p2FieldCardRects.get(p2Count).setFill(p2RectThree.getFill());
            p2FieldCardTexts.get(p2Count).setText(p2TextThree.getText());
            // UI changes (GRAY, "0") signal to player and program the card is spent/empty
            p2RectThree.setFill(Color.GRAY);
            p2TextThree.setText("0");

        }else if (buttonClicked.equals("p2HandCardFour")){
            // stops spent/empty card from being played
            if(p2TextFour.getText() == "0") {
                System.out.println("Empty card slot. Do something else.");
                SetInfoText("Can't play that card.");
                return;
            }
            p2FieldCardRects.get(p2Count).setFill(p2RectFour.getFill());
            p2FieldCardTexts.get(p2Count).setText(p2TextFour.getText());
            // UI changes (GRAY, "0") signal to player and program the card is spent/empty
            p2RectFour.setFill(Color.GRAY);
            p2TextFour.setText("0");
        }
        disableP2HandClicks(); // stops player from playing more than one hand card per turn
        p2Count++;
        SetInfoText("Player 2 Played a Hand Card");
        // updating score behind the scenes since this player's field has changed.
        GameLogic.getInstance().calculateScores(p2FieldCardTexts,2);
        checkForFullField();

        // Here I will add the logic to update the UI, since the playing field is guaranteed to have
        // changed by this point.
        updateUI();


    }

    public void playerWinIndicator(){

        if (GameLogic.getInstance().p1.roundsWon == 1){
            p1FirstRoundWinIndicator.setFill(Color.SEAGREEN);
        } else if (GameLogic.getInstance().p1.roundsWon == 2){
            p1FirstRoundWinIndicator.setFill(Color.SEAGREEN);
            p1SecondRoundWinIndicator.setFill(Color.SEAGREEN);
        } else if (GameLogic.getInstance().p1.roundsWon == 3){
            p1FirstRoundWinIndicator.setFill(Color.SEAGREEN);
            p1SecondRoundWinIndicator.setFill(Color.SEAGREEN);
            p1ThirdRoundWinIndicator.setFill(Color.SEAGREEN);
        }

        if (GameLogic.getInstance().p2.roundsWon == 1){
            p2FirstRoundWinIndicator.setFill(Color.SEAGREEN);
        } else if (GameLogic.getInstance().p2.roundsWon == 2){
            p2FirstRoundWinIndicator.setFill(Color.SEAGREEN);
            p2SecondRoundWinIndicator.setFill(Color.SEAGREEN);
        } else if (GameLogic.getInstance().p2.roundsWon == 3){
            p2FirstRoundWinIndicator.setFill(Color.SEAGREEN);
            p2SecondRoundWinIndicator.setFill(Color.SEAGREEN);
            p2ThirdRoundWinIndicator.setFill(Color.SEAGREEN);
        }

    }

    public void playerWinIndicatorReset(){

        p1FirstRoundWinIndicator.setFill(Color.LIGHTGRAY);
        p1SecondRoundWinIndicator.setFill(Color.LIGHTGRAY);
        p1ThirdRoundWinIndicator.setFill(Color.LIGHTGRAY);
        p2FirstRoundWinIndicator.setFill(Color.LIGHTGRAY);
        p2SecondRoundWinIndicator.setFill(Color.LIGHTGRAY);
        p2ThirdRoundWinIndicator.setFill(Color.LIGHTGRAY);

    }





}

