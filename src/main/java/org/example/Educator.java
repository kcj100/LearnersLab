package org.example;

public enum Educator implements Teacher {
    INSTRUCTOR_MIKAILA(new Instructor(4L, "Mikaila")),
    INSTRUCTOR_MRSRAWLS(new Instructor(10L, "Mrs. Rawls"));

    private final Instructor instructor;
    private double timeWorked;

    Educator(Instructor instructor) {
        this.instructor = instructor;
        Instructors.getInstance().add(instructor);
        this.timeWorked = 0.0;
    }

    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
        timeWorked += numberOfHours;
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
        timeWorked += numberOfHours;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public static Educator getInstructorByInstructor(Instructor instructor) {
        for (Educator educator : values()) {
            if (educator.instructor.equals(instructor)) {
                return educator;
            }
        }
        throw new IllegalArgumentException("Unknown instructor: " + instructor.getName());
    }

    public double getTimeWorked() {
        return timeWorked;
    }
}
