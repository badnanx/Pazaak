package com.team3.cs210finalprojectteam3;

public class Player {

    private int playerScore;
    private int roundsWon;

    private boolean hasStood;

    private boolean hasEndedTurn;
    private boolean wonRound;
    private boolean wonMatch;
    private boolean busted;
    private boolean playedHandCard;

    public Player()
    {
        playerScore = 0;
        roundsWon = 0;
        hasStood = false;
        hasEndedTurn = false;
        wonRound = false;
        wonMatch = false;
        busted = false;
        playedHandCard = false;
    }

    // need getters/setters
    // need to make into singleton depending on group consensus
}
