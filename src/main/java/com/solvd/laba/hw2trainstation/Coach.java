package com.solvd.laba.hw2trainstation;

public class Coach {
    private int number;
    private static Seat[] seats = new Seat[100];
    private int seatIndex = 0;

    public Coach(int numberOfSeats) {
        seats = new Seat[numberOfSeats];
        for (int i = 0; i < numberOfSeats; i++) {
            seats[i] = new Seat(i + 1, 'A'); // Adjust the section as needed
        }
    }

    public void addSeat(Seat seat) {
        if (seatIndex < seats.length) {
            seats[seatIndex++] = seat;
        }
    }

    public Seat[] getSeats() {
        return seats;
    }

    public int getNumber() {
        return number;
    }
}