package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null && !users.get(user).contains(account)) {
            users.get(user).add(account);
        }
    }

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