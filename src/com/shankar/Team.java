package com.shankar;

public class Team {
    private String[] roster;//declare an array for roster
    private int teamSize; //declare a variable to hold number of player in roster
    public Team(){
        roster = new String[20]; //create array
        teamSize = 0; //initialize team size
    }
    public Team(int arraySize)
    {
        roster = new String[arraySize]; // create array
        teamSize = 0;     // initialize team size
    }
    public void addPlayer(String playerName)
    {
        if (teamSize < roster.length)
        {
            roster[teamSize] = playerName; // add player to roster
            teamSize++;                    // increment team size
        }
    }
    public String toString()
    {
        String teamRoster = "Team Roster\n\n"; // output String
        int i = 0;                             // loop counter
        while (i < teamSize)                   // while more players
        {
            teamRoster = teamRoster + roster[i] + "\n"; // add name to roster
            i++;                               // increment loop counter
        }
        return teamRoster;                    // return roster
    }
}
