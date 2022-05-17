package com.team3.cs210finalprojectteam3;


public class GameLogic {

    private final int BUST_LIMIT = 20;
    private final int WIN_LIMIT = 3;
    private int whoseTurnIsIt;
    boolean endOfRound; // necessary?
    boolean gameOver;
    public final Player p1;
    public final Player p2;


   // constructor method, creates new game
    public GameLogic()
    {
        // fresh game
        whoseTurnIsIt = 1; // starting with player 1; 2 means player 2
        System.out.println("DEBUG: Starting new game with player 1 goes first.");
        endOfRound = false;
        gameOver = false;

        // creating player objects
        p1 = new Player();
        p2 = new Player();
    }

    // tracks whose turn it is;
    public void turnTracker(int currentPlayer)
    {
        if(currentPlayer == 1)
        {
            whoseTurnIsIt = 2;
            System.out.println("DEBUG: Currently player 2's turn.");
        }
        else
        {
            whoseTurnIsIt = 1;
            System.out.println("DEBUG: Currently player 1's turn.");
        }
    }

    // checks for bust
    public boolean checkForBust(int score)
    {
        return score > BUST_LIMIT;
    }




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
        compareRounds();
    }

    public void compareRounds(){
        if(p1.roundsWon == WIN_LIMIT){
            System.out.println("Player One wins the game!");
            gameOver = true;
            // popup window indicating victor?
            // insert some fxn that starts a new game?
        } else if(p2.roundsWon == WIN_LIMIT){
            System.out.println("Player Two wins the game!");
            gameOver = true;
            // popup indicating victor?
            // insert some fxn that starts a new game?
        }
    }


// make into singleton?
}
