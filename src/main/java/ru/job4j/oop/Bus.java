package ru.job4j.oop;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " перемещяется: по шоссе.");
    }

    @Override
    public void operate() {
        System.out.println(getClass().getSimpleName() + " - им управляет шафёр.");
    }
}
