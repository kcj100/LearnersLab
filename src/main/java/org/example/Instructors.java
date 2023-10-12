package org.example;

public class Instructors extends People<Instructor> {

    private static Instructors INSTANCE;

    private Instructors() {
        INSTANCE = this;
    }

    public static Instructors getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Instructors(); // Lazy initialization
        }
        return INSTANCE;
    }

    @Override
    public Instructor[] toArray() {
        return new Instructor[0];
    }
}

