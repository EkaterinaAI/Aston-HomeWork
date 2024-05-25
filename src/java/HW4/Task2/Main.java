package src.java.HW4.Task2;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> countryList = new LinkedList<>();
        countryList.add("Russia");
        countryList.addFirst("Germany");
        countryList.addFirst("England");
        countryList.addLast("France");
        countryList.addLast("Georgia");

        //Вывела countryList в консоль через forEach
        for (String country : countryList) {
            System.out.println(country);
        }

        countryList.removeFirst();
        countryList.removeLast();

        System.out.println(countryList.get(0));
        System.out.println(countryList.get(countryList.size()-1));


    }
}
