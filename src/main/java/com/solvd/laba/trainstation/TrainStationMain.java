package com.solvd.laba.trainstation;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class TrainStationMain {
    private static final Platform[] platforms;
    private static final Train[] availableTrains;

    //Static block with static member initialization
    static {
        System.out.println("TrainStationMain class has been initialized.");
        platforms = new Platform[5]; // 5 platforms
        availableTrains = new Train[2];

        for (int i = 0; i < platforms.length; i++) {
            platforms[i] = new Platform("Platform " + (i + 1));
        }

        availableTrains[0] = new PassengerTrain("Dallas - Houston Express");
        availableTrains[1] = new PassengerTrain("Austin - Dallas Express");

        // Initialize schedules for available trains
        for (Train train : availableTrains) {
            Schedule schedule = train;
            if (train.getName().equals("Dallas - Houston Express")) {
                schedule.createSchedule("Departure: 08:00 AM from Dallas, Arrival: 10:00 AM in Houston");
            } else if (train.getName().equals("Austin - Dallas Express")) {
                schedule.createSchedule("Departure: 12:00 PM from Austin, Arrival: 02:00 PM in Dallas");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display the list of available trains
        System.out.println("DALLAS UNION STATION - Available Trains:");
        for (int i = 0; i < availableTrains.length; i++) {
            System.out.println((i + 1) + ". " + availableTrains[i].getName());
        }

        // Prompt the user to choose a train
        System.out.print("Select a train (1 or 2): ");
        int selectedTrainIndex = scanner.nextInt() - 1;

        if (selectedTrainIndex >= 0 && selectedTrainIndex < availableTrains.length) {

            Train selectedTrain = availableTrains[selectedTrainIndex];

            // Collect passenger details
            System.out.print("Enter passenger name: ");
            String passengerName = scanner.next();
            System.out.print("Enter passenger age: ");
            int passengerAge = scanner.nextInt();

            // Randomly select a platform
            Random rand = new Random();
            int platformIndex = rand.nextInt(platforms.length);
            Platform selectedPlatform = platforms[platformIndex];

            //Booking Ticket and Printing the Ticket
            System.out.println("-------------------------------------------------------------------------");
            TrainStation station=new TrainStation("DALLAS UNION STATION...","Dallas");
            station.welcomeMessage();

            selectedTrain.bookTicket(passengerName, passengerAge, selectedPlatform);
            System.out.println("--------------------------------------------------------------------------");

            // Use polymorphism with interfaces
            Boarding boarding = new Passenger(passengerName, passengerAge);
            LuggageHandler luggageHandler = (LuggageHandler) selectedTrain;

            // Call the boarding and luggage handling methods
            boarding.startBoarding();
            luggageHandler.checkLuggage();

            //Util class and method
            TrainStationUtil.displayFarewellMessage(station);
        }
        else {
            System.out.println("Invalid train selection.");
        }
    }
}