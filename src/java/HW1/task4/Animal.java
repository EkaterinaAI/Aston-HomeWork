package src.java.HW1.task4;

public class Animal {

    private String name;
    private int age;
    private String color;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Животное по кличке " + name + ", возраст - " + age + ", цвет - " + color;
    }
}
