package com.practice;
import java.time.LocalDate;

public class TrainStationMain {

    public static void main(String[] args){

        // Passenger details
        PassengerInfo passenger1 = new PassengerInfo("Dhiya", LocalDate.of(1990, 6, 20));
        PassengerInfo passenger2 = new PassengerInfo("Krish", LocalDate.of(2000, 8, 23));

        // Train Details
        TrainDetails train1 = new TrainDetails("Local Train", LocalDate.now());
        TrainDetails train2 = new TrainDetails("Express Train", LocalDate.now());

        StationInfo station = new StationInfo("\tCENTRAL STATION");
        station.addTrain(train1);
        station.addTrain(train2);

        Platform platform1 = new Platform(3);
        train1.setPlatform(platform1);
        Platform platform2 = new Platform(1);
        train2.setPlatform(platform2);

        Coach train1coach = new Coach(10);
        train1.addCoach(train1coach);
        Coach train2coach = new Coach(15);
        train2.addCoach(train2coach);

        Seat train1seat = new Seat(10, 'B');
        train1coach.addSeat(train1seat);
        Seat train2seat = new Seat(20, 'A');
        train2coach.addSeat(train2seat);

        Schedule train1schedule = new Schedule(LocalDate.now(), "08:00am", "1:00pm");
        train1.setSchedule(train1schedule);
        Schedule train2schedule = new Schedule(LocalDate.now(), "09:00am", "10:00am");
        train2.setSchedule(train2schedule);

        //Generating tickets for two different trains
        System.out.println("TRAIN TICKETS");

        TicketInfo ticket1 = new TicketInfo(train1, passenger1, train1seat, train1schedule);
        ticket1.getDetails(train1, passenger1, train1seat, train1schedule );
        TicketInfo.ticketPrice(train1, passenger1, train1seat);

        TicketInfo ticket2 = new TicketInfo(train2, passenger2, train2seat,train2schedule, 10.0);
        ticket2.getDetails(train2, passenger2, train2seat, train2schedule);
        TicketInfo.ticketPrice(train2, passenger2, train2seat, 10.0);

    }
}
