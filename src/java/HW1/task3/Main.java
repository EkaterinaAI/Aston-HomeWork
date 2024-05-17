package src.java.HW1.task3;

/**
 * Ищук Екатерина
 * Задание 3: Попробуйте различные варианты установки значений свойств объектов:
 *            через конструктор
 *            через сеттер
 *            через присваивание значений полям объекта
 */

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Кеша", 2, "зеленый");
        animal.setAge(5);
        animal.master = "Иван";

        System.out.println(animal.toString());

    }
}
