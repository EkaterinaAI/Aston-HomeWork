package src.java.HW1.task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Ищук Екатерина
 * Задание 1: Создайте несколько классов с разными полями, конструкторами, методами
 */

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Кеша", 2, "зеленый");

        List<String> commands = new ArrayList<>();
        commands.add("Сидеть");
        commands.add("Дай лапу");
        commands.add("Голос");

        Dog dog = new Dog("Марти", 6, "бежевый", commands);
        Animal dog2 = new Dog("Изи", 3, "черный", commands);


        System.out.println(animal.toString());
        System.out.println(dog.toString());
        System.out.println(dog2.toString());

        //dog2 не имеет доступа к методу voice()
        dog.voice();
    }
}
