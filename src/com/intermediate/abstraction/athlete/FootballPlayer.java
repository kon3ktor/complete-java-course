package com.intermediate.abstraction.athlete;

public class FootballPlayer extends Athlete {

    private int completions;
    private int passingYards;

    public FootballPlayer(String name, String nickname, int yearOfBorn, String team, int gamesPlayed, int completions, int passingYards) {
        super(name, nickname, yearOfBorn, team, gamesPlayed);
        this.completions = completions;
        this.passingYards = passingYards;
    }

    @Override
    public void getBio() {
        super.getBio();
        System.out.println("Completions: " + completions);
        System.out.println("Passing yards: " + passingYards);
    }

    @Override
    public String getBodyType() {
        return "Big muscles and great endurance.";
    }

    public void increaseCompletions(int completions) {
        this.completions += completions;
    }

    public void increasePassingYards(int passingYards) {
        this.passingYards += passingYards;
    }
}
