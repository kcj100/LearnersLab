package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PeopleTest {

    @Test
    void testAdd() {
        List<Person> expectedPersonList =
                new ArrayList<>(Arrays.asList(new Person[]{
                        new Person(1L, "John"),
                        new Person(2L, "Tim"),
                        new Person(3L, "Pat")}));
        People personList = new People();
        personList.add(new Person(1L, "John"));
        personList.add(new Person(2L, "Tim"));
        personList.add(new Person(3L, "Pat"));
        assertArrayEquals(expectedPersonList.toArray(new Person[0]), personList.toArray());
    }

    @Test
    void testRemove() {
        People personList = new People();
        Person person1 = new Person(1L, "John");
        personList.add(person1);
        personList.add(new Person(2L, "Tim"));
        personList.add(new Person(3L, "Pat"));
        personList.remove(person1);
        assertFalse(personList.contains(person1));
    }

    @Test
    void testFindById() {
        long expectedId = 123456789L;
        People people = new People();
        Person person1 = new Person(1L, "John");
        Person expectedPerson = new Person(expectedId, "Tim");
        people.add(person1);
        people.add(expectedPerson);
        assertEquals(expectedPerson.getId(), people.findById(expectedId).getId());
    }

}