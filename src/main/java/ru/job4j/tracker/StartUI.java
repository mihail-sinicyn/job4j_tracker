package ru.job4j.tracker;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item dateTime = new Item(); /* создаём один объект Item */

        /* передаем строку, которая содержит образец согласно которому будет произведено форматирование даты */
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");

        /* вызываем геттер поля created и выводим отформатированное время на консоль */
        System.out.println("Текущие дата и время после форматирования: " + dateTime.getLocalDateTime().format(formatter));
    }
}

