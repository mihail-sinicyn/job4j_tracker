package ru.job4j.tracker;

import java.time.LocalDateTime;

public class Item {
    private int id;
    private String name;
    /*
        Поле типа LocalDateTime, присваиваем имя created.
        Сразу проинициализируем это поле текущей датой и временем, используя статический метод now()
    */
    private LocalDateTime created = LocalDateTime.now();

    public Item() {
    }

    public Item(String name) {
        this.name = name;
    }

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getLocalDateTime() { /* добавляем геттер, чтобы получить доступ к созданному полю */
        return created;
    }
}