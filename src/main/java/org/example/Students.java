package org.example;

import java.util.Random;

public final class Students extends People {

    private static final Students INSTANCE = new Students();

    private Students(){
        Random random = new Random();
        INSTANCE.add(new Person(random.nextLong(), "Andy Zhang"));
        INSTANCE.add(new Person(random.nextLong(), "Jordan Mitchell"));
        INSTANCE.add(new Person(random.nextLong(), "Ki Chan"));
    }

    public static Students getInstance() {
        return INSTANCE;
    }
}
