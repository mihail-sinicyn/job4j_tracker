package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class Tracker {
    private final List<Item> items = new ArrayList<>();
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    public List<Item> findAll() {
        return items;
    }

    public List<Item> findByName(String key) {
        List<Item> findByName = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().equals(key)) {
                findByName.add(item);
            }
        }
        return findByName;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean sub = index != -1;
        if (sub) {
            item.setId(id);
            items.set(index, item);
        }
        return sub;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean del = index != -1;
        if (del) {
            items.remove(index);
        }
        return del;
    }
}