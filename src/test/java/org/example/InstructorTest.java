package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class InstructorTest {

    @Test
    void testImplementation() {
        Instructor instructor = new Instructor(1L, "Tim");
        assertTrue(instructor instanceof Teacher);
    }

    @Test
    void testInheritance() {
        Instructor instructor = new Instructor(1L, "Tim");
        assertTrue(instructor instanceof Person);
    }

    @Test
    void testTeach() {
        Instructor instructor = new Instructor(1L, "Tim");
        double expectedTotalStudyTime = 2.0;
        Student student = new Student(2L, "Pat");
        instructor.teach(student, 2.0);
        assertEquals(expectedTotalStudyTime, student.getTotalStudyTime());
    }

    @Test
    void testLecture() {
        Instructor instructor = new Instructor(1L, "Tim");
        Student[] students = new Student[]{
                new Student(2L, "Pat"),
                new Student(3L, "Jones"),
                new Student(4L, "Isaiah")};
        double totalStudyTime = 12.0;
        double expectedStudentTime = 4.0;
        instructor.lecture(students, totalStudyTime);
        Arrays.stream(students)
                .forEach(student -> assertEquals(expectedStudentTime, student.getTotalStudyTime()));
    }
}