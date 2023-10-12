package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class People implements Iterable<Person> {
    List<Person> personList = new ArrayList<>();

    public void add(Person person) {
        personList.add(person);
    }

    public Person findById(long id) {
        return personList.stream()
                .filter(person -> person.getId() == id)
                .findAny()
                .orElseThrow(() ->
                        new NoSuchElementException(("Person with id " + id + " not found")));
    }

    public boolean contains(Person person) {
        return personList.contains(person);
    }

    public void remove(Person person) {
        personList.remove(person);
    }

    public void remove(long id) {
        personList.removeIf(person -> person.getId() == id);
    }

    public void removeAll() {
        personList.clear();
    }

    public int count() {
        return personList.size();
    }

    public Person[] toArray() {
        return personList.toArray(new Person[0]);
    }


    @Override
    public Iterator<Person> iterator() {
        return personList.iterator();
    }
}
