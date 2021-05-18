package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball bun = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        hare.tryEat(bun);
        bun.escape();
        wolf.tryEat(bun);
        bun.escape();
        fox.tryEat(bun);
        fox.gobble(bun);
    }
}
