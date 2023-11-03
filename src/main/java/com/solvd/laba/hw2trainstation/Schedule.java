package com.solvd.laba.hw2trainstation;
import java.time.LocalDate;
public class Schedule {
        private LocalDate date;
        private String time;

        public Schedule(LocalDate date, String time) {
            this.date = date;
            this.time = time;
        }
        public LocalDate getDate() {
            return date;
        }

        public String getTime() {
            return time;
        }

}
