package ru.job4j.inheritance;

public class Dentist extends Doctor {

    public Dentist() {
    }

    public Dentist(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public void cariesTreatment() {
    }

    public static void main(String[] args) {
        Dentist dentist = new Dentist();
        dentist.cariesTreatment();
    }

    public void addingNewPacient(Pacient pacient) {
    }
}
