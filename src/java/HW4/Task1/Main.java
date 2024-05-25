package src.java.HW4.Task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Создала коллекцию ArrayList
        List<String> countryList = new ArrayList<>();

        //Добавила 3 страны в список
        countryList.add("Russia");
        countryList.add("Germany");
        countryList.add("England");

        //Вывела countryList в консоль через forEach
        for (String country : countryList) {
            System.out.println(country);
        }

        //Заменила 2 элемент
        countryList.set(2, "USA");

        //Вывела countryList в консоль через forEach
        for (String country : countryList) {
            System.out.println(country);
        }

        //Удалила 2 элемент и удалила элемент со значением "Germany"
        countryList.remove(2);
        countryList.remove("Germany");

        //Вывела countryList в консоль через forEach
        for (String country : countryList) {
            System.out.println(country);
        }

        //Узнала индекс элемента со значением "Russia"
        System.out.println(countryList.indexOf("Russia"));

        //Проверила содержится ли элемент в колекции  со значением "Russia"
        System.out.println(countryList.contains("Russia"));
    }
}
