package org.example;

import java.util.*;

public abstract class People<E extends Person> implements Iterable<E> {
    private List<E> people = new ArrayList<>();

    public void add(E person) {
        people.add(person);
    }

    public E findById(long id) {
        return people.stream()
                .filter(e -> e.getId() == id)
                .findAny()
                .orElseThrow(() ->
                        new NoSuchElementException(("Person with id " + id + " not found")));
    }

    public boolean contains(E person) {
        return people.contains(person);
    }

    public void remove(E person) {
        people.remove(person);
    }

    public void remove(long id) {
        people.removeIf(person -> person.getId() == id);
    }

    public void removeAll() {
        people.clear();
    }

    public int count() {
        return people.size();
    }

    public abstract E[] toArray();

    public List<E> getPeople() {
        return people;
    }

    @Override
    public Iterator<E> iterator() {
        return people.iterator();
    }
}
