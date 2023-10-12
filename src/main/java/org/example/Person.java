package org.example;

import java.util.Objects;

public class Person {
    private final long id;
    private String name;

    public Person(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.getId() && Objects.equals(name, person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
