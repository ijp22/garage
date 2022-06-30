package com.ianpetts;

import java.util.ArrayList;

public class Garage {
    public ArrayList<Vehicle> vehicleList = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
        System.out.println("You added a " + vehicle + " to the garage!");
    }

    public void removeVehicle(Vehicle name) {
        int num = vehicleList.indexOf(name);

        if (num >= 0) {
            vehicleList.remove(num);
            System.out.println("You removed " + name + " from the Garage");

        } else {
            System.out.println("You can't remove a vehicle that does not exist!");
        }
    }


    public void removeAllVehicles() {
        vehicleList.clear();
        System.out.println("You removed all the vehicles from the garage!");
    }

    public void repairBill() {
        for (Vehicle vehicle : vehicleList) {
            double random = Math.random() * 1000 + 1;
            String rounded = String.format("%.0f", random);
            System.out.println("Your bill to repair your " + vehicle + " was £" + rounded);
        }
    }

    // Used Lambda as I knew the filter method existed.
    public void removeByType(String type) {
        vehicleList.removeIf(i -> (i.type.equals(type)));
        System.out.println("You removed all " + type + "'s from the garage!");
    }

    public void printVehicleList() {
        System.out.println("Vehicles currently in the garage:");
        for (Vehicle vehicle : vehicleList) {
            System.out.println(vehicle);
        }
    }

}
