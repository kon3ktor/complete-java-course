package com.intermediate.polymorphism.athlete;

public abstract class Athlete {

    private String name;
    private String nickname;
    private int yearOfBorn;
    private String team;
    private int numberOfCompetitions;

    public Athlete(String name, String nickname, int yearOfBorn, String team, int numberOfCompetitions) {
        this.name = name;
        this.nickname = nickname;
        this.yearOfBorn = yearOfBorn;
        this.team = team;
        this.numberOfCompetitions = numberOfCompetitions;
    }

    public String getName() {
        return name;
    }

    public void getBio() {
        System.out.println(name + " (" + nickname + ")");
        System.out.println("Born in " + yearOfBorn);
        System.out.println("Last team is " + team + " and took part in " + numberOfCompetitions + " competitions");
    }

    public void compete() {
        System.out.println(name + " took part in a competition.");
        numberOfCompetitions++;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public abstract String getBodyType();
}
