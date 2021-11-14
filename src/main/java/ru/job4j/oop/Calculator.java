package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int c) {
        return c - x;
    }

    public int multiply(int a) {
        return a * x;
    }

    public int divide(int b) {
        return b / x;
    }

    public int sumAllOperation(int d) {
        return sum(d) + minus(d) + multiply(d) + divide(d);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result1 = sum(10);
        System.out.println(result1);
        int result2 = minus(10);
        System.out.println(result2);
        int result3 = calculator.multiply(5);
        System.out.println(result3);
        int result4 = calculator.divide(10);
        System.out.println(result4);
        int result5 = calculator.sumAllOperation(10);
        System.out.println(result5);
    }
}
