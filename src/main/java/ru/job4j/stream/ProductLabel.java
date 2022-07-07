package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class ProductLabel {
    public List<String> generateLabels(List<Product> products) {
        return products.stream()
                .filter(prod -> prod.getStandard() - prod.getActual() >= 0)
                .filter(prod -> prod.getStandard() - prod.getActual() <= 3)
                .map(prod -> new Label(prod.getName(), 0.5f * prod.getPrice()))
                .map(Label::toString)
                .collect(Collectors.toList());
    }
}