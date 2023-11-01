package com.solvd.laba.hw2trainstation;
import java.time.LocalDate;

// This class contains Train details
public class TrainDetails {
    private String trainname;
    private Platform platform;
    private Coach[] coaches=new Coach[15];
    private int coachIndex = 0;
    private Schedule schedule;
    private LocalDate departureDate;

    public TrainDetails(String trainname, LocalDate departureDate) {
        this.trainname = trainname;
        this.departureDate = departureDate;
    }

    public void addCoach(Coach coach) {
        if(coachIndex < coaches.length) {
            this.coaches[coachIndex++] = coach;
        }
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public String getName() {
        return trainname;
    }

}
