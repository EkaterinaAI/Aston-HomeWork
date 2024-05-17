package src.java.HW1.task1;

import java.util.List;

public class Dog extends Animal {

    private List<String> commands;

    public Dog() {
    }

    public Dog(String name, int age, String color, List<String> commands) {
        super(name, age, color);
        this.commands = commands;
    }

    public List<String> getCommands() {
        return commands;
    }

    public void setCommands(List<String> commands) {
        this.commands = commands;
    }

    @Override
    public String toString() {
        return "Собака по кличке " + getName() + ", возраст - " + getAge() + ", цвет - " + getColor() + ", знает команды: " + commands;
    }

    public void voice() {
        System.out.println("Гав");
    }
}
