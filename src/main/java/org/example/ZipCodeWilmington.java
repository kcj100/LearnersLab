package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public final class ZipCodeWilmington {
    private static ZipCodeWilmington INSTANCE;
    private static Students students;
    private static Instructors instructors;

    private ZipCodeWilmington() {
        INSTANCE = this;
        students = Students.getInstance();
        instructors = Instructors.getInstance();
    }

    public void hostLecture(Educator educator, double numberOfHours) {
        educator.lecture(students.toArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours) {
        Instructor instructor = instructors.findById(id);
        Educator educator = Educator.getInstructorByInstructor(instructor);
        educator.lecture(students.toArray(), numberOfHours);
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> studyMap = new HashMap<>();
        for (Student student : students.toArray()) {
            studyMap.put(student, student.getTotalStudyTime());
        }
        return studyMap;
    }

    public static ZipCodeWilmington getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ZipCodeWilmington(); // Lazy initialization
        }
        return INSTANCE;
    }
}
