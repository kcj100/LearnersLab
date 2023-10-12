package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EducatorTest {


    @Test
    void testTeach() {
        Learner student = new Student(1L, "John");
        Educator educator = Educator.INSTRUCTOR_MIKAILA;
        double expectedHours = 2.0;
        educator.teach(student, expectedHours);
        assertEquals(expectedHours, student.getTotalStudyTime());
    }

    @Test
    void testLecture() {
        Students students = Students.getInstance();
        Educator educator = Educator.INSTRUCTOR_MRSRAWLS;
        double totalHours = 12;
        int numberOfStudents = students.count();
        double expectedHoursPerStudent = totalHours / numberOfStudents;
        double expectedTotalHoursPerStudent = expectedHoursPerStudent
                + students.getPeople().get(0).getTotalStudyTime();
        educator.lecture(Students.getInstance().toArray(), totalHours);
        students.getPeople()
                .forEach(student -> assertEquals(expectedTotalHoursPerStudent, student.getTotalStudyTime()));
    }

}