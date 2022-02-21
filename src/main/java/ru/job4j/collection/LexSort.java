package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] leftRow = left.split("\\.", 2);
        String[] rightRow = right.split("\\.", 2);
        return Integer.compare(Integer.parseInt(leftRow[0]), Integer.parseInt(rightRow[0]));
    }
}