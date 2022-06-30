package com.ianpetts;

public class Car extends Vehicle {
    private String model;
    private int doors;
    private int mileage;

    public Car(String type, String make, int id, String color, int wheels, int seats, String model, int doors, int mileage) {
        super(type, make, id, color, wheels, seats);
        setModel(model);
        setDoors(doors);
        setMileage(mileage);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Car -> " + make;
    }
}
