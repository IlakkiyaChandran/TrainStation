package com.practice;

public class Coach {
    private int number;
    private static Seat[] seats = new Seat[100];
    private int seatIndex = 0;

    public Coach(int number) {
        this.number = number;
    }
    public void addSeat(Seat seat) {
        if (seatIndex < seats.length) {
            seats[seatIndex++] = seat;
        }
    }
    public int getNumber() {
        return number;
    }
}