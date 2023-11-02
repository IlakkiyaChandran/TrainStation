package com.solvd.laba.hw2trainstation;
import java.time.LocalDate;
import java.util.Objects;

public class PassengerInfo {
    private String name;
    private int age;
    private Luggage luggage;

    public PassengerInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Passenger Name: " + name +
                ", Age: " + age;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PassengerInfo passenger = (PassengerInfo) obj;
        return age == passenger.age && Objects.equals(name, passenger.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}



