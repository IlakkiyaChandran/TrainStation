package com.solvd.laba.trainstation;
import java.util.Objects;
public class Passenger implements Boarding {
    protected String name;
    protected int age;
    protected Passenger(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public void startBoarding() {

        System.out.println("Passenger " + getName() + " started boarding.");
    }

    @Override
    public void endBoarding() {

        System.out.println("Passenger " + getName() + " completed boarding.");
    }
    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}



