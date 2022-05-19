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
    // removed GameLogic initializer because it is a Singleton and doesn't get initialized

    public Hand p1Hand = new Hand();
    public Hand p2Hand = new Hand();
    public Stage mStage;
    public Scene mScene;
    public Parent mRoot;
    /**
     * Hand panes
     */
    @FXML
    private StackPane p1HandCardOne;
    @FXML
    public StackPane p1HandCardTwo;
    @FXML
    private StackPane p1HandCardThree;
    @FXML
    private StackPane p1HandCardFour;
    @FXML
    private StackPane p2HandCardOne;
    @FXML
    private StackPane p2HandCardTwo;
    @FXML
    private StackPane p2HandCardThree;
    @FXML
    private StackPane p2HandCardFour;
    /**
     * Hand Rectangles
     */

//----------------------------------------------------------

    public static Rectangle p1RectOneStatic;

    public static Rectangle p1RectTwoStatic;

    public static Rectangle p1RectThreeStatic;

    public static Rectangle p1RectFourStatic;

    public static Rectangle p2RectOneStatic;

    public static Rectangle p2RectTwoStatic;

    public static Rectangle p2RectThreeStatic;

    public static Rectangle p2RectFourStatic;


   //...


    @FXML
    public Rectangle p1RectOne;
    @FXML
    public Rectangle p1RectTwo;
    @FXML
    public Rectangle p1RectThree;
    @FXML
    public Rectangle p1RectFour;
    @FXML
    public Rectangle p2RectOne;
    @FXML
    public Rectangle p2RectTwo;
    @FXML
    public Rectangle p2RectThree;
    @FXML
    public Rectangle p2RectFour;

//----------------------------------------------------------

    /**
     * Hand Text
     */
    public static Text p1TextOneStatic;
    public static Text p2TextOneStatic;
    public static Text p1TextTwoStatic;
    public static Text p2TextTwoStatic;
    public static Text p1TextThreeStatic;
    public static Text p2TextThreeStatic;
    public static Text p1TextFourStatic;
    public static Text p2TextFourStatic;
    @FXML
    public Text p1TextOne;
    @FXML
    public Text p1TextTwo;
    @FXML
    public Text p1TextThree;
    @FXML
    public Text p1TextFour;
    @FXML
    public Text p2TextOne;
    @FXML
    public Text p2TextTwo;
    @FXML
    public Text p2TextThree;
    @FXML
    public Text p2TextFour;

    /**
     * Player Score UI Setup
     */
    @FXML
    private Text playerOneScoreText;
    @FXML
    private Text playerTwoScoreText;
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

    }


    /**
     * Using Texts instead of textfields for the score so they can't be changed by the player
     */
    //@FXML
    //private TextField playerOneScore;

    //@FXML
    //private TextField playerTwoScore;

    private TextField gameTimer;
    private TextField timerUpdate;

    @FXML
    private Label visualTimer;

    @FXML
    private Button playerOneEndButton;

    @FXML
    private Circle playerTwoTurnIndicator;

    @FXML
    private Circle playerOneTurnIndicator;


    @FXML
    private Rectangle topRight;


    /**
     * This method was for testing purposes
     */
    /*
   @FXML
    public void cardColorChange(){
        topRight.setFill(Color.YELLOW);
    }*/


    public void SwitchtoWelcomeScene(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("welcome-view.fxml"));
        mStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        mScene = new Scene(root);
        mStage.setScene(mScene);
        mStage.show();


    }

//    public void timer(){
//        Timer timer = new Timer();
//        visualTimer = new Label();
//
//        timer.scheduleAtFixedRate(new TimerTask() {
//            int i = 10;
//
//            @Override
//            public void run() {
//                visualTimer.setText(String.valueOf(i));
//                i--;
//
//                if(i < 0){
//                    timer.cancel();
//                    //timerUpdate.setText("Next Player");
//                    System.out.println("10!");
//                }
//
//            }
//
//        }, 1000, 1000);
//    }

    /**
     * This method for testing purposes only
     */
    /*
    @FXML
    public void buttonTest(){
        System.out.println("worked");

        playerOneScore.setText("3");
        playerTwoScore.setText("20");
    }*/

    @FXML public void p1ForfeitGame(){
        System.out.println("Player 1 forfeits the game.");
        GameLogic.getInstance().gameOver = true;

    }

    @FXML public void p2ForfeitGame(){
        System.out.println("Player 2 forfeits the game.");
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
            GameLogic.getInstance().compareRounds();
        }

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
            GameLogic.getInstance().compareRounds();
        }

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
            GameLogic.getInstance().compareRounds();
        }

       if(GameLogic.getInstance().p2.hasStood == true) {

           GameLogic.getInstance().turnTracker(2);
           playerOneTurnIndicator.setFill(Color.GREEN);
           // some sort of 'continue play' loop would be good here
       } else{
           GameLogic.getInstance().turnTracker(1);
           playerOneTurnIndicator.setFill(Color.RED);
           playerTwoTurnIndicator.setFill(Color.GREEN);
           // some kind of gameplay loop would be good here
           // idea: player one's buttons should be disabled if it's not their turn
       }


       // playerTwoTurnLight();
       // timer();

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

//    public void playerOneTurnLight(){
//        playerOneTurnIndicator.setFill(Color.GREEN);
//
//        Timer lightTimer = new Timer();
//        lightTimer.scheduleAtFixedRate(new TimerTask() {
//            int i = 10;
//
//            @Override
//            public void run() {
//                i--;
//
//                if(i < 0){
//                    lightTimer.cancel();
//                    playerOneTurnIndicator.setFill(Color.RED);
//
//                }
//
//            }
//
//        }, 1000, 1000);
//
//
//    }

    @FXML
    public void playerTwoEndTurn(){
        if(GameLogic.getInstance().checkForBust(GameLogic.getInstance().p2.score) == true){
            System.out.println("Player 2 has gone bust! Player 1 wins the round!");
            GameLogic.getInstance().p1.roundsWon++;
            GameLogic.getInstance().p1.wonRound = true;
            GameLogic.getInstance().endOfRound = true;
            GameLogic.getInstance().compareRounds();
        }

        if(GameLogic.getInstance().p1.hasStood == true) {
            GameLogic.getInstance().turnTracker(1);
            playerTwoTurnIndicator.setFill(Color.GREEN);
            // some sort of 'continue play' loop would be good here
        } else{

            GameLogic.getInstance().turnTracker(2);
            playerTwoTurnIndicator.setFill(Color.RED);
            playerOneTurnIndicator.setFill(Color.GREEN);
            // some kind of gameplay loop would be good here
            // idea: player one's buttons should be disabled if it's not their turn
        }



        // playerOneTurnLight();
        // timer();

    }

//    public void playerTwoTurnLight(){
//        playerTwoTurnIndicator.setFill(Color.GREEN);
//
//       Timer lightTimer = new Timer();
//        lightTimer.scheduleAtFixedRate(new TimerTask() {
//            int i = 10;
//
//            @Override
//            public void run() {
//                i--;
//
//                if(i < 0){
//                    lightTimer.cancel();
//                    playerTwoTurnIndicator.setFill(Color.RED);
//
//                }
//
//            }
//
//        }, 1000, 1000);
//
//
//    }






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


       // List<Integer> val = Arrays.asList(a,b,c,d,e,f,g,h);
       // System.out.println(val);




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

















}

