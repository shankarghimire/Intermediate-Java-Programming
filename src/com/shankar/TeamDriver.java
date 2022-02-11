package com.shankar;

public class TeamDriver {
    public static void main(String[] args) {
        Team t = new Team();
        t.addPlayer("John Doe");
        t.addPlayer("Jack Sparatt");
        t.addPlayer("Donald Duck");
        t.addPlayer("Bugs Bunny");
        t.addPlayer("Pecos Bill");
        t.addPlayer("Rip van Winkle");

        System.out.println(t.toString());
    }
}
