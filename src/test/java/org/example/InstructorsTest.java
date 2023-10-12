package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstructorsTest {
    @Test
    void test() {
        Instructor instructor = Educator.INSTRUCTOR_MIKAILA.getInstructor();
        Instructors actualInstructors = Instructors.getInstance();
        assertTrue(actualInstructors.contains(instructor));
    }
}