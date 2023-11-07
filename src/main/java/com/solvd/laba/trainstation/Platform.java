package com.solvd.laba.trainstation;

public class Platform {
    private final String platformNumber;

    protected Platform(String platformNumber) {
        this.platformNumber = platformNumber;
    }

    protected String getPlatformNumber() {
        return platformNumber;
    }
    @Override
    public String toString() {
        return "Platform{" +
                "platformNumber='" + platformNumber + '\'' +
                '}';
    }
}
