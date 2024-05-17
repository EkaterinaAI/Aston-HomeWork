package src.java.HW1.task2;

public class Animal {

    static {
        master = "У животного есть хозяин: ";
    }

    {
        System.out.println("Информация о животном:");
    }

    private String name;
    private int age;
    private String color;
    public static String master;

    public Animal() {
    }

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Животное по кличке " + name + ", возраст - " + age + ", цвет - " + color;
    }
}
