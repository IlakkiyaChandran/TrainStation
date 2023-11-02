package com.solvd.laba.hw2trainstation;

public class TicketInfo {
    private TrainDetails train;
    private PassengerInfo passenger;
    private Seat seat;
    private Schedule schedule;
    private double price;
    private Platform platform;


    //Two custom constructors
    public TicketInfo(TrainDetails train, PassengerInfo passenger, Seat seat, Schedule schedule, Platform platform) {
        this.train = train;
        this.passenger = passenger;
        this.seat = seat;
        this.schedule = schedule;
        this.platform = platform;
    }

    public TicketInfo(TrainDetails train, PassengerInfo passenger, Seat seat,Schedule schedule, double price) {
        this.train = train;
        this.passenger = passenger;
        this.seat = seat;
        this.schedule = schedule;
        this.price=price;
    }

    //Overloading two Static methods with different implementations
    public static void ticketPrice(TrainDetails train, PassengerInfo passenger, Seat seat ){
        System.out.println("Regular Ticket");
    }
    public static void ticketPrice(TrainDetails train, PassengerInfo passenger,Seat seat, double price ){
        System.out.println("Discounted Ticket- $"+price+" less");
    }
    public int getPlatformNumber() {
        Platform platform = train.getPlatform();
        if (platform != null) {
            return platform.getNumber();
        }
        return -1; // Return -1 if platform is not set
    }
    public void getDetails(TrainDetails train, PassengerInfo passenger, Seat seat, Schedule schedule, Platform platform) {
        if (schedule != null && passenger != null && seat != null && platform != null) {
            System.out.println("\tTime: " + schedule.getTime() + "\tPassenger: " + passenger.getName() + "\tSeat No: " + seat.getNumber() + seat.getSection() + "\tAge: " + passenger.getAge() + "\tPlatform: " + platform.getNumber());
        } else {
            System.out.println("One or more objects are null in getDetails method.");
        }
    }


}
