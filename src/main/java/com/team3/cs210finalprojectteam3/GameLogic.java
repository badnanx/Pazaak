package com.team3.cs210finalprojectteam3;

//import javafx.scene.paint.Color;

//import static com.team3.cs210finalprojectteam3.SceneController.playerOneTurnIndicator;

import javafx.application.Platform;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.List;
import java.util.Random;

/**
 * This will be a Singleton class that can be used to track player data and the logic behind the scenes
 *
 * Call on this by typing GameLogic.getInstance().whateverVariableIsInGameLogic, or
 * GameLogic.getInstance().anyMethodWithinGameLogic()
 */
public class GameLogic {
    // Static variable of GameLogic that acts like a global variable in a way
    private static GameLogic game = null;

    private final int BUST_LIMIT = 20;
    private final int WIN_LIMIT = 3;
    private int whoseTurnIsIt;
    boolean endOfRound; // necessary?
    boolean gameOver;
    public final Player p1;
    public final Player p2;


   // constructor method, creates new game

    /**
     * The constructor method works the same in a Singleton, we just have to access it differently, and in a way
     * that we only ever instantiate a single GameLogic object while the program is running
     */
    public GameLogic()
    {
        // fresh game
        whoseTurnIsIt = 1; // starting with player 1; 2 means player 2
        System.out.println("DEBUG: Starting new game with player 1 goes first.");
        //SceneController.playerOneTurnIndicator.setFill(Color.GREEN);
        endOfRound = false;
        gameOver = false; // redundant?

        // creating player objects
        p1 = new Player();
        p2 = new Player();
    }

    /**
     * Here is where we get our GameLogic singleton object, and we either create a new one if one doesn't exist,
     * or use the current one. Two may never exist.
     * @return
     */
    public static GameLogic getInstance(){
        if(game == null){
            game = new GameLogic();
        }
        return game;
    }



    /**
     * Tracks whose turn it is.
     * @param currentPlayer
     */
    public void turnTracker(int currentPlayer)
    {
        if(currentPlayer == 1)
        {
            whoseTurnIsIt = 2;
            System.out.println("DEBUG: Currently player " + whoseTurnIsIt + "'s turn.");
        }
        else
        {
            whoseTurnIsIt = 1;
            System.out.println("DEBUG: Currently player " + whoseTurnIsIt + "'s turn.");
        }
    }

    /**
     * Checks for bust
     * @param score the player's score
     * @return returns true or false
     */
    public boolean checkForBust(int score)
    {
        return score > BUST_LIMIT;
    }

    /**
     * Calculate score based on a list of texts sent in and parsed, which is then assigned to the appropriate player
     * taking advantage of knowing that 1 is player one and 2 is player two
     * @param fieldCards Text list
     * @param whoseTurnIsIt integer
     */
    public void calculateScores(List<Text> fieldCards, int whoseTurnIsIt){
        int sum = 0;
        for(Text text : fieldCards){
            if(text.getText().equals("")){
                break;
            }
            sum += Integer.parseInt(text.getText());
        }
        System.out.println("DEBUG: whoseTurnIsIt =" +whoseTurnIsIt);
        if(whoseTurnIsIt == 1){
            p1.score = sum;
        }
        else{
            p2.score = sum;
        }
    }

    /**
     * Compares player scores to see who won the round.
     * Note: compareRounds() is embedded in compareScores(int, int).
     * @param p1Score player 1's score
     * @param p2Score player 2's score
     */
    public void compareScores(int p1Score, int p2Score)
    {
        System.out.println("Round over. Comparing scores...");

        if(p1Score == p2Score)
        {
            System.out.println("Round is a draw.");
            // suggestion: popup indicating draw
            endOfRound = true; // necessary? why not stay in game loop?
            // insert some fxn that resets scores and flags
        }
        else if (p1Score > p2Score)
        {
            System.out.println("Player 1 wins the round.");
            p1.roundsWon++;
            // suggestion: popup indicating p1 win
            p1.wonRound = true;
            endOfRound = true;
            // insert some fxn that resets scores and flags
        }
        else {
            System.out.println("Player 2 wins the round.");
            p2.roundsWon++;
            // suggestion: popup indicating p2 win
            p2.wonRound = true;
            endOfRound = true;
            // insert some fxn that resets scores and flags
        }
        didP1orP2WinGame();
    }

    /**
     * Checks if player has won the game.
     */
    public void didP1orP2WinGame(){
        if(p1.roundsWon == WIN_LIMIT){
            System.out.println("Player 1 wins the game!");
            p1.wonGame = true;
            gameOver = true; // redundant?
            // popup window indicating victor?
            // insert some fxn that starts a new game?
        } else if(p2.roundsWon == WIN_LIMIT){
            System.out.println("Player 2 wins the game!");
            p2.wonGame = true;
            gameOver = true; // redundant?
            // popup indicating victor?
            // insert some fxn that starts a new game?
        }
    }

    public void checkForFullField(){

    }
    /**
     * Generate a new Card with random values [1-10] and return the card to be played to field.
     * Should be able to use this method to randomly generate the cards
     * to be played to the appropriate playing field at the start of a player's turn.
     *
     *
     * @return
     */
    public Card generateRandomDeckCard() {
        Random rand = new Random(); //instance of random class
        final int upperbound = 10;
        //generate random values from 1-10
        int int_random = rand.nextInt(upperbound) + 1;
        Card card = new Card(int_random);
        card.SetText(Integer.toString(int_random));


        //card.rectangle.setFill(Color.BLUE);
        return card;
    }

    /**
     * This method will reset certain player stats that should be reset at round end, as well as adjusting the field
     */
    public void roundReset(){
        gameOver = false;
        whoseTurnIsIt = 1;
        p1.score = 0;
        p2.score = 0;
        p1.hasStood = false;
        p2.hasStood = false;
        p1.hasEndedTurn = false;
        p2.hasEndedTurn = false;
    }

    public void winReset(){

    }

//    public void addToP1Field(){
//        p1FieldCardRects.get(p1Count).setText(generateRandomDeckCard().getText());
//    }


// make into singleton?
}
