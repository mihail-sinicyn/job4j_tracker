package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void ride() {
        System.out.println("Поехали");
    }

    @Override
    public void passengers(int sum) {
        System.out.println("Количество пасажиров: " + sum);
    }

    @Override
    public int refill(int total) {
        return total*59;
    }
}
