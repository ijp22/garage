package com.ianpetts;

public class Boat extends Vehicle {
    private int engineSize;
    private String model;
    private int length;
    private int nauticalMileage;

    public Boat(String type, String make, int id, String color, int wheels, int seats, int engineSize, String model, int length, int nauticalMileage) {
        super(type, make, id, color, wheels, seats);
        setEngineSize(engineSize);
        setModel(model);
        setLength(length);
        setNauticalMileage(nauticalMileage);
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getNauticalMileage() {
        return nauticalMileage;
    }

    public void setNauticalMileage(int nauticalMileage) {
        this.nauticalMileage = nauticalMileage;
    }

    @Override
    public String toString() {
        return "Boat -> " + make;
    }
}
