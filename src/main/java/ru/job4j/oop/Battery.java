package ru.job4j.oop;

public class Battery {

    private int load;

    public Battery(int charge) {
        this.load = charge;
    }

    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery firstBattery = new Battery(43);
        Battery secondBattery = new Battery(57);
        System.out.println("firstBattery : "
                + firstBattery.load
                    + ". secondBattery : "
                        + secondBattery.load);
        firstBattery.exchange(secondBattery);
        System.out.println("firstBattery : "
                + firstBattery.load
                    + ". secondBattery : "
                        + secondBattery.load);
        secondBattery.exchange(firstBattery);
        System.out.println("firstBattery : "
                + firstBattery.load
                    + ". secondBattery : "
                        + secondBattery.load);
    }
}
