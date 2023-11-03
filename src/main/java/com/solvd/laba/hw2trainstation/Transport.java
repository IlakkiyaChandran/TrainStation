package com.solvd.laba.hw2trainstation;

abstract class Transport {
    protected String name;
    protected int number;

    public Transport(String name, int number) {
        this.name = name;
        this.number = number;
    }
    // Two abstract methods
    public abstract String getInfo();
    public abstract void additionalMethod();

}
