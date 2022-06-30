package com.ianpetts;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Car", "Ford", 1, "Black", 4, 5, "Fiesta", 3, 10_000);
        Motorbike motorbike = new Motorbike("Motorbike", "Yamaha", 2, "Yellow", 2, 1, 1500, "XZY", 280_000);
        Boat boat = new Boat("Boat", "Sun Seeker", 3, "White", 0, 10, 20_000, "Cruiser", 30, 100_000);
        Boat boat2 = new Boat("Boat", "Dingy", 4, "Black", 0, 2, 0, "Inflatable", 10, 10_000);

        Garage garage = new Garage();
        garage.addVehicle(car);
        garage.addVehicle(motorbike);
        garage.addVehicle(boat);
        garage.addVehicle(boat2);

        System.out.println();

        garage.repairBill();

        System.out.println();

        garage.removeVehicle(car);

        System.out.println();

        garage.printVehicleList();

        System.out.println();

        garage.removeByType("Boat");

        System.out.println();

        garage.printVehicleList();

        System.out.println();

        garage.removeAllVehicles();

        System.out.println();

        garage.printVehicleList();
    }
}