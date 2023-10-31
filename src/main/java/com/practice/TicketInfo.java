package com.practice;

public class TicketInfo {
    private TrainDetails train;
    private PassengerInfo passenger;
    private Seat seat;
    private Schedule schedule;

    //Two custom constructors
    public TicketInfo(TrainDetails train, PassengerInfo passenger, Seat seat, Schedule schedule) {
        this.train = train;
        this.passenger = passenger;
        this.seat = seat;
        this.schedule= schedule;
    }
    public TicketInfo(TrainDetails train, PassengerInfo passenger, Seat seat,Schedule schedule, double price) {
        this.train = train;
        this.passenger = passenger;
        this.seat = seat;
        this.schedule = schedule;
    }
    public static int ticketCount=0;
    public static int getNumberOfTickets() {
        return ticketCount;
    }
    //Overloading two Static methods with different implementations
    public static void ticketPrice(TrainDetails train, PassengerInfo passenger, Seat seat ){
        System.out.println("Regular Ticket");
    }
    public static void ticketPrice(TrainDetails train, PassengerInfo passenger,Seat seat, double price ){
        System.out.println("Discounted Ticket- $"+price+" less");
    }
    public void getDetails(TrainDetails train, PassengerInfo passenger, Seat seat, Schedule schedule ) {
        System.out.println( train.getName() +" Time:"+ schedule.getStartTime()+ " Passenger: " + passenger.getName() + " Seat No:" + seat.getNumber() + seat.getSection());
    }

}
