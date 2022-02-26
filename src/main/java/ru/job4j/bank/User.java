package ru.job4j.bank;

import java.util.Objects;

/**
 * Данный класс является клиентом класса BankService.
 *
 * @author mihail-sinicyn
 * @version 1.0
 */
public class User {
    /**
     * Паспорт клиента
     */
    private String passport;
    /**
     * Имя клиента
     */
    private String username;

    /**
     * Метод для создания клиента с инициализацией его данных
     * @param passport Паспорт клиента
     * @param username Имя клиента
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Метод возвращает паспорт клиента
     * @return паспорт
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Метод для обновления паспорта клиента
     * @param passport новый паспорт клиента
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Метод для получения имени клиента
     * @return Имя клиента
     */
    public String getUsername() {
        return username;
    }

    /**
     * Метод для обновления имени клиента
     * @param username новое имя клиента
     */
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
