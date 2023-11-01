package com.solvd.laba.hw2trainstation;
import java.time.LocalDate;
public class PassengerInfo {
    private String name;
    private LocalDate dob;
    private Luggage luggage;

    public PassengerInfo(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDob() {
        return dob;
    }
}
