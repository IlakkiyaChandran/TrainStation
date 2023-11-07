package com.solvd.laba.trainstation;
import java.util.Random;
import java.util.Objects;

public class Train implements Ticket, Payment, Schedule {
    private final String name;
    private String schedule;

    public Train(String name, String schedule) {
        this.name = name;
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }
    public String getSchedule() {
        return schedule;
    }

    @Override
    public int calculateTicketPrice(int passengerAge) {
        if (passengerAge < 12) {
            return 40; // Child fare
        } else {
            return 60; // Adult fare
        }
    }

    @Override
    public String allocateSeat() {
        Random rand = new Random();
        int seatNumber = rand.nextInt(100) + 1; // Random seat number between 1 and 100
        return "A" + seatNumber;
    }

    @Override
    public void printTicketInfo(String passengerName, int ticketPrice, String seatAllocation,Platform selectedPlatform) {
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Schedule: " + getSchedule());
        System.out.println("Ticket Price: $" + ticketPrice);
        System.out.println("Seat Allocation: " + seatAllocation);
        System.out.println("Platform: " + selectedPlatform.getPlatformNumber());
    }

    @Override
    public void makePayment(int ticketPrice) {
        System.out.println("Payment made for Train: " + getName());
    }
    public void bookTicket(String passengerName, int passengerAge, Platform selectedPlatform) {
        int ticketPrice = calculateTicketPrice(passengerAge);
        String seatAllocation = allocateSeat();
        makePayment(ticketPrice);
        printTicketInfo(passengerName, ticketPrice, seatAllocation, selectedPlatform);
    }

    @Override
    public void createSchedule(String schedule) {
        this.schedule = schedule;
    }

    @Override
    public void displaySchedule(String schedule) {
        System.out.println("Train Schedule for " + getName() + ": " + schedule);
    }

    @Override
    public String toString() {
        return "Train{" +
                "name='" + name + '\'' +
                ", schedule='" + schedule + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Train train = (Train) obj;
        return Objects.equals(getName(), train.getName()) &&
                Objects.equals(getSchedule(), train.getSchedule());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSchedule());
    }
}