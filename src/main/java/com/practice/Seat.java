package com.practice;

public class Seat {
    private int number;
    private char section;

    public Seat(int number, char section) {
        this.number = number;
        this.section = section;
    }

    public int getNumber() {
        return number;
    }

    public char getSection() {
        return section;
    }
}
