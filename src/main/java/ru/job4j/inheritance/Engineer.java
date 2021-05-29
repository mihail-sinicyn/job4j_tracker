package ru.job4j.inheritance;

public class Engineer extends Profession{

    private String certification;

    public Engineer() {
    }
    public Engineer(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
        this.certification = certification;
    }

    public void toDesign() {
    }

    public static void main(String[] args) {
        Engineer engineer = new Engineer();
        engineer.toDesign();
    }

}
