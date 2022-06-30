package com.ianpetts;

public class Motorbike extends Vehicle {
    private int engineSize;
    private String model;
    private int mileage;

    public Motorbike(String type, String make, int id, String color, int wheels, int seats, int engineSize, String model, int mileage) {
        super(type, make, id, color, wheels, seats);
        setEngineSize(engineSize);
        setModel(model);
        setMileage(mileage);
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

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Motorbike -> " + make;
    }
}
