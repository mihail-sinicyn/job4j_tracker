package ru.job4j.oop;

public class PolyUsageVehicles {
    public static void main(String[] args) {
        Vehicle boeing747 = new Plane();
        Vehicle yak130 = new Plane();
        Vehicle m62 = new Train();
        Vehicle amg5 = new Train();
        Vehicle paz3205 = new Bus();
        Vehicle liaz677 = new Bus();

        Vehicle[] vehicles = new Vehicle[]{boeing747, yak130, m62,amg5, paz3205, liaz677 };
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
            vehicle.operate();
        }
    }
}


