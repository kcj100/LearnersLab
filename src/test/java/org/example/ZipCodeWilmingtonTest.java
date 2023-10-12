package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZipCodeWilmingtonTest {

    @Test
    void testHostLecture() {
        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();
        double hours = 10;
        zipCodeWilmington.hostLecture(4L, hours);
        double expectedHoursForEachStudent = hours / Students.getInstance().count();
        for (Student student : Students.getInstance().toArray()) {
            assertEquals(expectedHoursForEachStudent, student.getTotalStudyTime());
        }
    }

}