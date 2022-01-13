package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ItemSortTest {

    @Test
    public void whenItemsAscByName() {
        Item one = new Item(1, "Bee");
        Item two = new Item(2, "Ant");
        Item three = new Item(3, "Zebra");
        Item four = new Item(4, "Yak");

        List<Item> list = new ArrayList<>();
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        List<Item> expected = List.of(two, one, four, three);
        Collections.sort(list, new ItemAscByName());
        assertThat(list, is(expected));
    }

    @Test
    public void whenItemsDescByName() {
        Item one = new Item(1, "Rachel");
        Item two = new Item(2, "Monica");
        Item three = new Item(3, "Phoebe");
        Item four = new Item(4, "Joey");
        Item five = new Item(5, "Chandler");
        Item six = new Item(6, "Ross");

        List<Item> list = new ArrayList<>();
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        list.add(five);
        list.add(six);

        List<Item> expected = List.of(six, one, three, two, four, five);
        Collections.sort(list, new ItemDescByName());
        assertThat(list, is(expected));
    }
}