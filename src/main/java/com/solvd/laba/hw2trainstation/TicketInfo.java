package com.solvd.laba.hw2trainstation;

public class TicketInfo {
    private TrainDetails train;
    private PassengerInfo passenger;
    private Seat seat;
    private Schedule schedule;
    private double price;
    private Platform platform;
    public TicketInfo(TrainDetails train, PassengerInfo passenger, Seat seat, Schedule schedule, Platform platform) {
        this.train = train;
        this.passenger = passenger;
        this.seat = seat;
        this.schedule = schedule;
        this.platform = platform;
    }
    public TicketInfo(TrainDetails train, PassengerInfo passenger, Seat seat, Schedule schedule, double price) {
        this.train = train;
        this.passenger = passenger;
        this.seat = seat;
        this.schedule = schedule;
        this.price = price;
    }

    //Printing the Ticket
    public void getDetails(TrainDetails train, PassengerInfo passenger, Seat seat, Schedule schedule, Platform platform) {
        System.out.println(train.getInfo()+"  Time:" + schedule.getTime() + "\tPassenger:" + passenger.getName() +"\tAge:" + passenger.getAge() + "\tSeat No:" + seat.getNumber() + seat.getSection() + "\tPlatform: " + platform.getNumber());
    }
    //Overloading two Static methods with different implementations
    public static void ticketPrice(TrainDetails train, PassengerInfo passenger, Seat seat) {
        System.out.println("Regular Ticket");
    }
    public static void ticketPrice(TrainDetails train, PassengerInfo passenger, Seat seat, double price) {
        System.out.println("Discounted Ticket- $" + price + " less");
    }
}

