package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentsTest {
    @Test
    void test() {
        List<Student> expectedStudents = new ArrayList<>();
        expectedStudents.add(new Student(1L, "Andy Zhang"));
        expectedStudents.add(new Student(2L, "Jordan Mitchell"));
        expectedStudents.add(new Student(3L, "Ki Chan"));
        Students actualStudents = Students.getInstance();
        assertArrayEquals(expectedStudents.toArray(), actualStudents.toArray());
    }
}