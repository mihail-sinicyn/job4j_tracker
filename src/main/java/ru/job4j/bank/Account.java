package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс применяется для описания модели счета клиента
 * @author  mihail-sinicyn
 * @version 1.0
 */
public class Account {
    /**
     * Реквизиты счета клиента
     */
    private String requisite;
    /**
     * баланс клиента
     */
    private double balance;

    /**
     * Создание счета и инициализацией полей
     * @param requisite реквизиты
     * @param balance баланс
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Метод применяется для получения реквизитов
     * @return возвращает реквизиты
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Метод применяется для обновления реквизитов
     * @param requisite параметр для обновленных реквизитов
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Метод применяется для возвращения баланса
     * @return возвращает баланс
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Метод применяется для обновления реквизитов
     * @param balance параметер для обновленного баланса
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
