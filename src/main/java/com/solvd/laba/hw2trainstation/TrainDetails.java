package com.solvd.laba.hw2trainstation;
import java.time.LocalDate;

// This class contains Train details
public class TrainDetails extends Transport {
    private String trainname;
    private Platform platform;
    private Coach[] coaches=new Coach[15];
    private int coachIndex = 0;
    private Schedule schedule;
    private LocalDate departureDate;

    public TrainDetails(String name, LocalDate departureDate) {
        super(name, departureDate.hashCode()); // Using hashCode as a unique number
        this.departureDate = departureDate;

        for (int i = 0; i < coaches.length; i++) {
            coaches[i] = new Coach(i + 1);
        }
    }
    public void setPlatform(Platform platform) {
        this.platform = platform;
    }
    public Platform getPlatform() {
        return platform;
    }
    public Coach[] getCoaches() {
        return coaches;
    }
    @Override
    public String toString() {
        return "Train: " + name + ", Departure date: " + departureDate;
    }
    // Implementation of the abstract methods
    @Override
    public String getInfo() {
        return "Train: " + name + ", Departure date: " + departureDate;
    }
    @Override
    public void additionalMethod() {
        System.out.println("Implementation of Abstract method");
    }
}
