package com.team3.cs210finalprojectteam3;

// just testing a commit! 10:46 pm
public class GameLogic {

    private int whoseTurnIsIt;

   // constructor method, creates new game
    public GameLogic()
    {
        // fresh game
        whoseTurnIsIt = 1; // starting with player 1; 2 means player 2
        System.out.println("DEBUG: Starting new game with player 1 goes first.");

    }

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


// make into singleton?
}
