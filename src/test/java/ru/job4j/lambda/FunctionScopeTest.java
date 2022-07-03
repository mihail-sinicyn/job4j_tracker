package ru.job4j.lambda;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FunctionScopeTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        FunctionScope function = new FunctionScope();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenQuadraticResults() {
        FunctionScope function = new FunctionScope();
        List<Double> result = function.diapason(3, 6, x -> Math.pow(x, 2) + 2 * x + 1);
        List<Double> expected = Arrays.asList(16D, 25D, 36D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExponentialFunctionThenExponentialResults() {
        FunctionScope function = new FunctionScope();
        List<Double> result = function.diapason(2, 6, x -> Math.pow(2, x) - x + 1);
        List<Double> expected = Arrays.asList(3D, 6D, 13D, 28D);
        assertThat(result, is(expected));
    }
}/**/