package ru.job4j.tracker;

import java.util.Comparator;

public class ItemDescByName implements Comparator<Item> {
    @Override
    public int compare(Item one, Item two) {
        return two.getName().compareTo(one.getName());
    }
}
