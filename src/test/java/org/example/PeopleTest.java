package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PeopleTest {

    private Students students; // Declare a field to hold the Students instance

    @BeforeEach
    void setUp() {
        students = Students.getInstance(); // Initialize a new Students instance before each test
    }

    @AfterEach
    void tearDown() {
        students.removeAll(); // Clean up the students after each test
    }

    @Test
    void testAdd() {
        students.add(new Student(5L, "Julio Rodriguez"));
        assertEquals(students.count(), 4);
    }

    @Test
    void testRemove() {
        students.remove(1L);
        assertEquals(students.count(), 0);
    }

    @Test
    void testFindById() {
        Student expectedStudent = new Student(2L, "Jordan Mitchell");
        students.add(expectedStudent);
        Student actualStudent = (Student) Students.getInstance().findById(expectedStudent.getId());
        assertEquals(expectedStudent, actualStudent);
    }

}