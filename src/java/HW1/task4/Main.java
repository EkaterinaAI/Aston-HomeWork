package src.java.HW1.task4;

import src.java.HW1.task4.Animal;

/**
 * Ищук Екатерина
 * Задание 4: Реализуйте перегрузку методов в ваших классах и попробуйте вызвать разные версии перегруженных методов
 */

public class Main {

    public static void main(String[] args) {

        //перегрузку реализовывала в конструкторах
        Animal animalEmptyConstructor = new Animal();
        Animal animalNameConstructor = new Animal("Кеша");
        Animal animalNameAgeConstructor = new Animal("Кеша", 5);
        Animal animalFullConstructor = new Animal("Кеша", 5, "зеленый");

        System.out.println(animalEmptyConstructor.toString());
        System.out.println(animalNameConstructor.toString());
        System.out.println(animalNameAgeConstructor.toString());
        System.out.println(animalFullConstructor.toString());
    }
}
