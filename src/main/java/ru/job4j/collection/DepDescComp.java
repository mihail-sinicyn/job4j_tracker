package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String str1, String str2) {
        String dep1 = str1.split("/")[0];
        String dep2 = str2.split("/")[0];
        int rsl = dep2.compareTo(dep1);
        return rsl == 0 ? str1.compareTo(str2) : rsl;
    }
}
