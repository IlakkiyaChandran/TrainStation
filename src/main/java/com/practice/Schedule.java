package com.practice;
import java.time.LocalDate;
public class Schedule {
        private LocalDate date;
        private String startTime;
        private String endTime;

        public Schedule(LocalDate date, String startTime, String endTime) {
            this.date = date;
            this.startTime = startTime;
            this.endTime = endTime;
        }

        public LocalDate getDate() {
            return date;
        }

        public String getStartTime() {
            return startTime;
        }

        public String getEndTime() {
            return endTime;
        }
}
