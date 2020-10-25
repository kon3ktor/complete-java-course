package com.intermediate.encapsulation.athlete;

public class Athlete {

    private String name;
    private String nickname;
    private int yearOfBorn;
    private String team;
    private int gamesPlayed;

    public Athlete(String name, String nickname, int yearOfBorn, String team, int gamesPlayed) {
        this.name = name;
        this.nickname = nickname;
        this.yearOfBorn = yearOfBorn;
        this.team = team;
        this.gamesPlayed = gamesPlayed;
    }

    public String getName() {
        return name;
    }

    public void getBio() {
        System.out.println(name + " (" + nickname + ")");
        System.out.println("Born in " + yearOfBorn);
        System.out.println("Last team is " + team + " and played " + gamesPlayed + " games");
    }

    public void playGame() {
        System.out.println(name + " started a game.");
        gamesPlayed++;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
