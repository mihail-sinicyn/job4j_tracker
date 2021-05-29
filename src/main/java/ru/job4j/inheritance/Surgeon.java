package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    public Surgeon() {
    }

    public Surgeon(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public void giveAnesthesia() {
    }

    public void toDisinfect() {
    }

    public void toLiverTransplantation() {
    }

    public static void main(String[] args) {
        Surgeon surgeon = new Surgeon();
        surgeon.giveAnesthesia();
        surgeon.toDisinfect();
        surgeon.toLiverTransplantation();
    }
}
