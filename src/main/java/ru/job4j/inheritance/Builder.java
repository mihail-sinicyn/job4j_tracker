package ru.job4j.inheritance;

public class Builder extends Engineer {
    public Builder() {
    }

    public Builder(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public void toConstruction() {
        System.out.println("to Construction");
    }
}
