package com.practice;

public class StationInfo {
        private String name;
        private TrainDetails[] trains = new TrainDetails[10];
        private int trainIndex = 0;

        public StationInfo(String name) {
            this.name = name;
        }

        public void addTrain(TrainDetails train) {
            if(trainIndex < trains.length) {
                this.trains[trainIndex++] = train;
            }
        }
        public String getName() {
            return name;
        }
    }


