package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс применяется для описания работы банковского сервиса - перевод денежных средств со структурой ключ-значение
 */
public class BankService {
    /**
     * Информация сохраняется с помощью HashMap (клиент это - ключ, счет - это значение)
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод применяется для получения на вход клиента (если такой клиент
     * отсутствует - его добавляют в хранилище)
     * @param user параметер для клиента, которого добавляют в хранилище
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод ищет по номеру паспорта клиента в нашей коллекции, и если находит, добавляет
     * ему новый счет
     * @param passport данные паспорта
     * @param account обьект счета
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null && !users.get(user).contains(account)) {
            users.get(user).add(account);
        }
    }

    /**
     * Метод принимает на вход паспорт и ищет клиента.
     * @param passport паспорт клиента
     * @return возвращает найденного клиента
     */
    public User findByPassport(String passport) {
        User user = null;
        for (User client : users.keySet()) {
            if (client.getPassport().equals(passport)) {
                user = client;
                break;
            }
        }
        return user;
    }

    /**
     * Метод принимает на вход паспорт клиента и реквизиты счета
     * По паспорту ищем клиента, если находим то
     * ищем у него счет с нужными реквизитами
     * @param passport паспорт клиента
     * @param requisite возвращаем найденный счет
     * @return возвращает найденный счет
     */
    public Account findByRequisite(String passport, String requisite) {
        Account account = null;
        User user = findByPassport(passport);
        if (user != null) {
            for (Account score : users.get(user)) {
                if (score.getRequisite().equals(requisite)) {
                    account = score;
                    break;
                }
            }
        }
        return account;
    }

    /**-
     * Метод принимает на вход паспорта, реквизиты и сумму перевода.
     * Осуществляет перевод денег между счетами клиента или между клиентами.
     * @param srcPassport клиент который переводит деньги
     * @param srcRequisite реквизиты счета откуда будут делать перевод
     * @param destPassport клиент который принимает деньги
     * @param destRequisite реквизиты счета куда будет делать перевод
     * @param amount сумма перевода
     * @return если перевод прошёл успешно то возвращается true, иначе false
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account account = findByRequisite(srcPassport, srcRequisite);
        Account score = findByRequisite(destPassport, destRequisite);
        if (account != null && score != null && account.getBalance() >= amount) {
            account.setBalance(account.getBalance() - amount);
            score.setBalance(score.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
