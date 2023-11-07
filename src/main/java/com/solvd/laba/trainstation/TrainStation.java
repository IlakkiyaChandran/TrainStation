package com.solvd.laba.trainstation;
import java.util.Objects;
public class TrainStation extends Station {

    private String name;
    private String location;
    public TrainStation(String name, String location) {
        super(name, location);
        this.name=name;
        this.location=location;
    }
    protected String getName() {
        return name;
    }

    protected String getLocation() {
        return location;
    }
    @Override
    public void welcomeMessage() {
        System.out.println("Welcome to " + getName());
    }

    @Override
    public void farewellMessage() {
        System.out.println("Thank you for visiting " + getName());
    }

    @Override
    public String toString() {
        return "TrainStation{" +
                "name='" + getName() + '\'' +
                ", location='" + getLocation() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrainStation station = (TrainStation) o;
        return Objects.equals(getName(), station.getName()) &&
                Objects.equals(getLocation(), station.getLocation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLocation());
    }
}
