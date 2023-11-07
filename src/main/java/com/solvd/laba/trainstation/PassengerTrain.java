package com.solvd.laba.trainstation;

public class PassengerTrain extends Train implements Boarding,LuggageHandler {
    private String name;
    public PassengerTrain(String name) {
        super(name, "");
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Override
    public void startBoarding() {
        System.out.println("Passenger train " + getName() + " started boarding.");
    }

    @Override
    public void endBoarding() {
        System.out.println("Passenger train " + getName() + " completed boarding.");
    }
    @Override
    public void checkLuggage() {
        System.out.println("Luggage checked for Passenger Train: " + getName());
    }
    @Override
    public void retrieveLuggage() {
        System.out.println("Luggage retrieved for Passenger Train: " + getName());
    }

}
