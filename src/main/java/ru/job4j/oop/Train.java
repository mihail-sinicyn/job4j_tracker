package ru.job4j.oop;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " перемещяется: по рельсам.");
    }

    @Override
    public void operate() {
        System.out.println(getClass().getSimpleName() + " - им управляет машинист.");
    }
}
