package com.solvd.laba.hw2trainstation;

import java.time.LocalDate;
import java.util.Scanner;

public class TrainStationMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display available trains
        System.out.println("Available Trains:");
        TrainDetails train1 = new TrainDetails("Local Train", LocalDate.now());
        TrainDetails train2  = new TrainDetails("Express Train", LocalDate.now());
        System.out.println("1. " + train1);
        System.out.println("2. " + train2);

        Platform platform1 = new Platform(1); // Platform for train1
        Platform platform2 = new Platform(2); // Platform for train2
        // Set the platforms for the trains
        train1.setPlatform(platform1);
        train2.setPlatform(platform2);

        System.out.print("Select a train (1 or 2): ");
        int selectedTrainNumber = scanner.nextInt();
        TrainDetails selectedTrain = (selectedTrainNumber == 1) ? train1 : train2;

        System.out.print("Enter the number of passengers: ");
        int numPassengers = scanner.nextInt();

        // Create an array to store Passenger objects
        PassengerInfo[] passengers = new PassengerInfo[numPassengers];

        // Populate the array with Passenger objects
        for (int i = 0; i < numPassengers; i++) {
            System.out.println("Passenger " + (i + 1));
            System.out.print("Enter passenger name: ");
            String name = scanner.next();
            System.out.print("Enter passenger age: ");
            int age = scanner.nextInt();
            // Create a new Passenger object and add it to the array
            passengers[i] = new PassengerInfo(name, age);
        }

        System.out.println("Passenger Details:");
        for (PassengerInfo passenger : passengers) {
            System.out.println(passenger);
        }

        System.out.println("TRAIN TICKETS:");

        StationInfo station = new StationInfo("CENTRAL STATION");
        station.addTrain(train1);
        station.addTrain(train2);

        System.out.println(station.getName());

        LocalDate fixedDate = LocalDate.now(); // Fixed date
        String fixedTime = "08:00"; // Fixed time

        for (int i = 0; i < numPassengers; i++) {
            System.out.println("Ticket " + (i + 1));

            // Auto-select a coach and seat
            Coach selectedCoach = selectedTrain.getCoaches()[i % selectedTrain.getCoaches().length];
            Seat selectedSeat = selectedCoach.getSeats()[i % 100]; // Assuming 100 seats per coach

            Schedule selectedSchedule = new Schedule(fixedDate, fixedTime);

            Platform selectedPlatform = selectedTrain.getPlatform();

            //System.out.println("Passenger: " + passengers[i].getName());
            //System.out.println("Coach Number: " + selectedCoach.getNumber());

            // Check if selectedSeat is not null before accessing its properties
            if (selectedSeat != null) {
                //System.out.println("Seat Number: " + selectedSeat.getNumber() + selectedSeat.getSection());
            } else {
                System.out.println("Selected seat is null.");
            }

            //System.out.println("Platform Number: " + selectedPlatform.getNumber());

            TicketInfo ticket = new TicketInfo(selectedTrain, passengers[i], selectedSeat, selectedSchedule, selectedPlatform);
            ticket.getDetails(selectedTrain, passengers[i], selectedSeat, selectedSchedule, selectedPlatform);
        }
    }
}
