package com.solvd.laba.trainstation;

interface Ticket {
    int calculateTicketPrice(int passengerAge);
    String allocateSeat();
    void printTicketInfo(String name,int ticket,String seat, Platform selectedPlatform);
}