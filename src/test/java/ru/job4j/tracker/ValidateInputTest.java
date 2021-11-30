package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                Arrays.asList("one", "1")
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
    }

    @Test
    public void whenValidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                List.of("1")
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
    }

    @Test
    public void whenMultipleValidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                Arrays.asList("0", "1", "2")
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected0 = input.askInt("Enter menu:");
        assertThat(selected0, is(0));
        int selected1 = input.askInt("Enter menu:");
        assertThat(selected1, is(1));
        int selected2 = input.askInt("Enter menu:");
        assertThat(selected2, is(2));
    }

    @Test
    public void whenNegativeInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                List.of("-1")
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(-1));
    }
}