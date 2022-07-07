package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNegativeNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(332, -91, -235, 244, -474, 101, -499, 39, 170, -3);
        List<Integer> positive = numbers.stream()
                .filter(number -> number > 0)
                .collect(Collectors.toList());
                positive.forEach(System.out::println);
    }
}
/**/