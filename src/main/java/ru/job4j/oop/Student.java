package ru.job4j.oop;

public class Student {

    public void music() {
        System.out.println("Tra tra tra");
    }

    public void songRKelly() {
        System.out.println("I believe I can fly");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        petya.music();
        petya.music();
        petya.music();
        petya.songRKelly();
        petya.songRKelly();
        petya.songRKelly();
    }
}
