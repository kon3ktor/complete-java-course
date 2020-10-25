package com.intermediate.polymorphism.athlete;

public class Swimmer extends Athlete implements Swimming {

    private int finaPoints;

    public Swimmer(String name, String nickname, int yearOfBorn, String team, int numberOfCompetitions, int finaPoints) {
        super(name, nickname, yearOfBorn, team, numberOfCompetitions);
        this.finaPoints = finaPoints;
    }

    @Override
    public String getBodyType() {
        return "Lean muscle, long torso and flexible ankles.";
    }

    @Override
    public void getBio() {
        super.getBio();
        System.out.println("FINA points: " + finaPoints);
    }

    @Override
    public void freestyle() {
        System.out.println("Swimming freestyle very fast.");
    }

    @Override
    public void freestyle(int distance) {
        System.out.println("Swimming " + distance + "m freestyle very fast.");
    }

    @Override
    public void compete() {
        super.compete();
        freestyle();
    }
}
