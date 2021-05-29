package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String language;

    public Programmer() {
    }

    public Programmer(String name, String surname, String education, String birthday, String languageOf) {
        super(name, surname, education, birthday);
        this.language = language;
    }

    public void technicalSupport() {
    }

    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        programmer.technicalSupport();
    }
}
