package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void ride() {
    }

    @Override
    public void passengers(int sum) {
    }

    @Override
    public int refill(int total) {
        return total*59;
    }
}
