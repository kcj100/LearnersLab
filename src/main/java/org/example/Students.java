package org.example;

import java.util.Random;

public final class Students extends People<Student> {
    private static Students INSTANCE;

    private Students() {
        INSTANCE = this; // Initialize INSTANCE when the constructor is called.
        INSTANCE.add(new Student(1L, "Andy Zhang"));
        INSTANCE.add(new Student(2L, "Jordan Mitchell"));
        INSTANCE.add(new Student(3L, "Ki Chan"));
    }

    public static Students getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Students(); // Lazy initialization
        }
        return INSTANCE;
    }

    @Override
    public Student[] toArray() {
        return getPeople().toArray(new Student[0]);
    }
}
