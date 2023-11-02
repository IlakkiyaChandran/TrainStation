package com.solvd.laba.hw2trainstation;

public class StationInfo {
        private String stationName;
        private Platform platform;
        private TrainDetails[] trains = new TrainDetails[5];
        private int trainIndex = 0;

        public StationInfo(String stationName) {
            this.stationName = stationName;
        }
        public void addTrain(TrainDetails train) {
            if(trainIndex < trains.length) {
                this.trains[trainIndex++] = train;
            }
        }
        public String getName() {
            return stationName;
        }
    }


