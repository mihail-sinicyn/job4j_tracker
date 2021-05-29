package ru.job4j.inheritance;

public class Doctor extends Profession{

    private String specialization;

    public Doctor() {
    }

    public Doctor(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
        this.specialization = specialization;
    }

    public void toDiagnosis() {
    }
}
