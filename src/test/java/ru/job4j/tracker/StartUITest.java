package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class StartUITest {

    @Test
    public void whenCreateItem() {
        Tracker tracker = new Tracker();
        Output out = new StubOutput();
        Input in = new StubInput(
                Arrays.asList("0", "Item name", "1")
        );
        List<UserAction> actions = Arrays.asList(
                new CreateAction(out),
                new ExitAction(out)
        );
        new StartUI(out).init(in, tracker, actions);
        assertEquals(tracker.findAll().get(0).getName(), "Item name");
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Output out = new StubOutput();
        Item item = tracker.add(new Item("Replaced item"));
        String replacedName = "New item name";
        Input in = new StubInput(
                Arrays.asList("0", String.valueOf(item.getId()), replacedName, "1")
        );
        List<UserAction> actions = Arrays.asList(
                new ReplaceAction(out),
                new ExitAction(out)
        );
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Output out = new StubOutput();
        Item item = tracker.add(new Item("Deleted item"));
        Input in = new StubInput(
                Arrays.asList("0", String.valueOf(item.getId()), "1")
        );
        List<UserAction> actions = Arrays.asList(
                new DeleteAction(out),
                new ExitAction(out)
        );
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void whenExit() {
        Tracker tracker = new Tracker();
        Output out = new StubOutput();
        Input in = new StubInput(List.of("0"));
        List<UserAction> actions = List.of(
                new ExitAction(out)
        );
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. Exit Program" + ln
        ));
    }

    @Test
    public void whenReplaceItemTestOutputIsSuccessfully() {
        Tracker tracker = new Tracker();
        Output out = new StubOutput();
        Item one = tracker.add(new Item("test1"));
        String replaceName = "New Test Name";
        Input in = new StubInput(
                Arrays.asList("0", String.valueOf(one.getId()), replaceName, "1")
        );
        List<UserAction> actions = Arrays.asList(
                new ReplaceAction(out),
                new ExitAction(out)
        );
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu." + ln
                        + "0. Edit item" + ln
                        + "1. Exit Program" + ln
                        + "=== Edit item ====" + ln
                        + "Заявка изменена успешно." + ln
                        + "Menu." + ln
                        + "0. Edit item" + ln
                        + "1. Exit Program" + ln
        ));
    }

    @Test
    public void showAllActionTestOut() {
        Tracker tracker = new Tracker();
        Output out = new StubOutput();
        Input in = new StubInput(
                Arrays.asList("0", "1")
        );
        List<UserAction> actions = Arrays.asList(
                new ShowAllAction(out),
                new ExitAction(out)
        );
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu." + ln
                        + "0. Show all items" + ln
                        + "1. Exit Program" + ln
                        + "=== Show all items ====" + ln
                        + "Хранилище еще не содержит заявок." + ln
                        + "Menu." + ln
                        + "0. Show all items" + ln
                        + "1. Exit Program" + ln
        ));
    }

    @Test
    public void findByNameActionTestOut() {
        Tracker tracker = new Tracker();
        Output out = new StubOutput();
        Input in = new StubInput(
                Arrays.asList("0", "test name", "1")
        );
        List<UserAction> actions = Arrays.asList(
                new FindByNameAction(out),
                new ExitAction(out)
        );
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu." + ln
                        + "0. Find item by name" + ln
                        + "1. Exit Program" + ln
                        + "=== Find items by name ====" + ln
                        + "Заявки с именем: test name не найдены." + ln
                        + "Menu." + ln
                        + "0. Find item by name" + ln
                        + "1. Exit Program" + ln
        ));
    }

    @Test
    public void findByIdActionTestOut() {
        Tracker tracker = new Tracker();
        Output out = new StubOutput();
        Input in = new StubInput(
                Arrays.asList("0", "17", "1")
        );
        List<UserAction> actions = Arrays.asList(
                new FindByIdAction(out),
                new ExitAction(out)
        );
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu." + ln
                        + "0. Find item by id" + ln
                        + "1. Exit Program" + ln
                        + "=== Find item by id ====" + ln
                        + "Заявка с введенным id: 17 не найдена." + ln
                        + "Menu." + ln
                        + "0. Find item by id" + ln
                        + "1. Exit Program" + ln
        ));
    }

    @Test
    public void findByNameActionTestItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test"));
        Output out = new StubOutput();
        Input in = new StubInput(
                Arrays.asList("0", String.valueOf(item.getName()), "1")
        );
        List<UserAction> actions = Arrays.asList(
                new FindByNameAction(out),
                new ExitAction(out)
        );
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu." + ln
                        + "0. Find item by name" + ln
                        + "1. Exit Program" + ln
                        + "=== Find items by name ====" + ln
                        + item + ln
                        + "Menu." + ln
                        + "0. Find item by name" + ln
                        + "1. Exit Program" + ln
        ));
    }

    @Test
    public void findByIdActionTestItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test"));
        Output out = new StubOutput();
        Input in = new StubInput(
                Arrays.asList("0", String.valueOf(item.getId()), "1")
        );
        List<UserAction> actions = Arrays.asList(
                new FindByIdAction(out),
                new ExitAction(out)
        );
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu." + ln
                        + "0. Find item by id" + ln
                        + "1. Exit Program" + ln
                        + "=== Find item by id ====" + ln
                        + item + ln
                        + "Menu." + ln
                        + "0. Find item by id" + ln
                        + "1. Exit Program" + ln
        ));
    }
}

