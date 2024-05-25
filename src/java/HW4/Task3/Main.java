package src.java.HW4.Task3;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<Person> personSet = new HashSet<>();

        Person person1 = new Person("Bob", 25);
        Person person2 = new Person("Mike", 30);
        Person person3 = new Person("Kate", 18);

        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);

        for (Person person : personSet) {
            System.out.println(person);
        }

        personSet.remove(person2);
        personSet.remove(person1);

        System.out.println(personSet);

    }
}
