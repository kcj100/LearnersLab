package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testConstructor() {
        Person person = new Person(123456789L, "John");
        long expectedId = 123456789L;
        String expectedName = "John";
        assertEquals(expectedId, person.getId());
        assertEquals(expectedName, person.getName());
    }

    @Test
    void testSetName() {
        Person person = new Person(123456789L, null);
        String expectedName = "John";
        person.setName(expectedName);
        assertEquals(expectedName, person.getName());
    }
}