package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testImplementation() {
        Student student = new Student(1L, "John");
        assertTrue(student instanceof Learner);
    }

    @Test
    void testInheritance() {
        Student student = new Student(1L, "John");
        assertTrue(student instanceof Person);
    }

    @Test
    void testLearn() {
        Student student = new Student(1L, "John");
        student.learn(5.0);
        student.learn(2.0);
        Double expectedTotalStudyTime = 7.0;
        assertEquals(expectedTotalStudyTime, student.getTotalStudyTime());
    }
}