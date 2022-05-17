package com.team3.cs210finalprojectteam3;


public class GameLogic {

    private final int BUST_LIMIT = 20;
    private int whoseTurnIsIt;
    boolean endOfRound; // necessary?
    private final Player p1;
    private final Player p2;


   // constructor method, creates new game
    public GameLogic()
    {
        // fresh game
        whoseTurnIsIt = 1; // starting with player 1; 2 means player 2
        System.out.println("DEBUG: Starting new game with player 1 goes first.");
        endOfRound = false;

        // creating player objects
        p1 = new Player();
        p2 = new Player();
    }

    // tracks whose turn it is;
    public void endTurn(int currentPlayer)
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
        if (score > BUST_LIMIT)
        {
            // System.out.println("DEBUG: Player busts.");
            return true;
        }
        else
            return false;
    }


    /**
     * Code below is incomplete. Edits to Player class also required.
     */

    public void compareScores(int p1Score, int p2Score)
    {
        if(p1Score == p2Score)
        {
            System.out.println("Round is a draw.");
            // suggestion: popup indicating draw
            endOfRound = true; // necessary? why not stay in game loop?
        }
        else if (p1Score > p2Score)
        {
            p1.roundsWon++;
            System.out.println("Player 1 wins the round.");

            endOfRound = true;
        }
        else {
            p2.roundsWon++;
            System.out.println("Player 2 wins the round.");

            endOfRound = true;
        }
    }


// make into singleton?
}
