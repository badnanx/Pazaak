package com.team3.cs210finalprojectteam3;

//import javafx.scene.paint.Color;

//import static com.team3.cs210finalprojectteam3.SceneController.playerOneTurnIndicator;

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


// make into singleton?
}
