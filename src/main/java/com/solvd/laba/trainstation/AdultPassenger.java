package com.solvd.laba.trainstation;

import java.util.Objects;

public class AdultPassenger extends Passenger implements Boarding {
    private String name;
    private int age;

    public AdultPassenger(String name, int age) {
        super(name, age);
        this.name=name;
        this.age=age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setName(int age) {
        this.age = age;
    }
    @Override
    public void startBoarding() {
        System.out.println("Passenger " + getName() + " started boarding.");
    }
    @Override
    public void endBoarding() {
        System.out.println("Passenger " + getName() + " completed boarding.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdultPassenger passenger = (AdultPassenger) o;
        return age == passenger.age && Objects.equals(name, passenger.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }
}
