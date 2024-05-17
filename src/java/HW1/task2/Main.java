package src.java.HW1.task2;

import src.java.HW1.task2.Animal;

/**
 * Ищук Екатерина
 * Задание 2: Практикуйтесь в использовании статических и нестатических блоков инициализации
 */

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Кеша", 2, "зеленый");

        System.out.println(Animal.master + animal.toString());
    }
}
