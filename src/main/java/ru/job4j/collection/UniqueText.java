package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String version: origin) {
            check.add(version);
        }
        for (String version: text) {
            if (!check.contains(version)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}