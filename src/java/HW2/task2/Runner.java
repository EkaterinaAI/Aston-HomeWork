package src.java.HW2.task2;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        List<String> hobbies = new ArrayList<>();
        hobbies.add("программирование");
        hobbies.add("чтение");
        hobbies.add("рисование");

        ImmutablePerson immutablePerson = new ImmutablePerson("Bob", 25, hobbies);
         /*
         доступа к name и age у immutablePerson нет, так как эти поля private и нет сеттеров
         immutablePerson.getHobbies().add("пение"); - UnsupportedOperationException, тк в геттере сделала список неизменяемым
         при попытке добавить в список hobbies еще одно значение для immutablePerson список останется исходным, тк скопировала в конструкторе исходный список
        */
        hobbies.add("плавание");

        System.out.println("Неизменяемый объект:");
        System.out.println(immutablePerson.toString());

        MutablePerson mutablePerson = new MutablePerson("Bob", 25, hobbies);

        System.out.println("Изменяемый объект до:");
        System.out.println(mutablePerson.toString());

        mutablePerson.setName("John");
        mutablePerson.setAge(40);
        hobbies.add("пение");

        System.out.println("Изменяемый объект после:");
        System.out.println(mutablePerson.toString());

    }
}
