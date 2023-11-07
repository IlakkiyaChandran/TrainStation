package com.solvd.laba.trainstation;

public abstract class Station {
    private String name;
    private String location;

    protected Station(String name, String location) {
        this.name = name;
        this.location = location;
    }

    protected String getName() {
        return name;
    }

    protected String getLocation() {
        return location;
    }
    public abstract void welcomeMessage();
    public abstract void farewellMessage();
}

