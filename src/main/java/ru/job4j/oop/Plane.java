package ru.job4j.oop;

public class Plane implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " перемещяется: по небу.");
    }

    @Override
    public void operate() {
        System.out.println(getClass().getSimpleName() + " - им управляет пилот.");
    }
}
