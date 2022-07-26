package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> nameCheck = (person) -> person.getName().contains(key);
        Predicate<Person> surNameCheck = (person) -> person.getSurname().contains(key);
        Predicate<Person> phoneCheck = (person) -> person.getPhone().contains(key);
        Predicate<Person> addressCheck = (person) -> person.getAddress().contains(key);
        var combine = nameCheck.or(surNameCheck).or(phoneCheck).or(addressCheck);
        var result = new ArrayList<Person>();
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}