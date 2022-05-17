package com.team3.cs210finalprojectteam3;

public class Player {

    public int score;
    public int roundsWon;

    public boolean hasStood;
    public boolean hasEndedTurn;
    public boolean wonRound;
    public boolean wonMatch;
    public boolean busted;
    public boolean playedHandCard;

    public Player()
    {
        score = 0;
        roundsWon = 0;
        hasStood = false;
        hasEndedTurn = false;
        wonRound = false;
        wonMatch = false;
        busted = false;
        playedHandCard = false;
    }

    // need getters/setters
}
