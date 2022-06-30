package com.ianpetts;

public abstract class Vehicle {
    String type;
    String make;
    int id;
    String color;
    int wheels;
    int seats;

    public Vehicle(String type, String make, int id, String color, int wheels, int seats) {
        this.type = type;
        this.make = make;
        this.id = id;
        this.color = color;
        this.wheels = wheels;
        this.seats = seats;
    }
}
