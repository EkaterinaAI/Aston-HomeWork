package src.java.HW2.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutablePerson {

    private final String name;
    private final int age;
    private final List<String> hobbies;

    public ImmutablePerson(String name, int age, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = new ArrayList<>(hobbies);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getHobbies() {
        return Collections.unmodifiableList(hobbies);
    }

    @Override
    public String toString() {
        return name + ", " + age + " " + hobbies;
    }
}
