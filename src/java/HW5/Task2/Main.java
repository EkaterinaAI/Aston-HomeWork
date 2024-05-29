package src.java.HW5.Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Bob", 35, "IT", 2500.2);
        Employee employee2 = new Employee("John", 23, "HR", 1300.8);
        Employee employee3 = new Employee("Jack", 32, "IT", 2700.4);
        Employee employee4 = new Employee("Charly", 41, "IT", 3500.4);
        Employee employee5 = new Employee("Naruto", 21, "HR", 1200.4);

        List<Employee> listOfEmployee = listOfEmployee(employee1, employee2, employee3, employee4, employee5);

        System.out.println("Все сотрудники: " + listOfEmployee);
        System.out.println("Сотрудники старше 30: " + listOfEmployeeMoreThen30(listOfEmployee));
        System.out.println("Количество сотрудников в IT отделе: " + countOfEmployeeIT(listOfEmployee));
        System.out.println("Сотрудник с максимальное ЗП: " + employeeMaxSalary(listOfEmployee));
        System.out.println("Сотрудники в HR отделе: " + listOfEmployeeHR(listOfEmployee));
        System.out.println("Средняя зарплата сотрудников: " + avgSalary(listOfEmployee));
    }

    //Создать список сотрудников
    private static List<Employee> listOfEmployee(Employee... e) {
        return Arrays.stream(e).collect(Collectors.toList());
    }

    //Найти всех сотрудников старше 30 лет и отсортировать их по возрасту
    private static List<Employee> listOfEmployeeMoreThen30(List<Employee> e) {
        List<Employee> listOfEmployeeMoreThen30 = new ArrayList<>();
        listOfEmployeeMoreThen30 = e.stream()
                                        .filter(employee -> employee.getAge() > 30)
                                        .sorted()
                                        .collect(Collectors.toList());
        return listOfEmployeeMoreThen30;
    }

    //Посчитать общее количество сотрудников в IT отделе
    private static long countOfEmployeeIT(List<Employee> e) {
        long countOfEmployee = e.stream()
                                    .filter(employee -> employee.getDepartment() == "IT")
                                    .count();
        return countOfEmployee;
    }

    //Найти сотрудника с макс ЗП
    private static List<Employee> employeeMaxSalary(List<Employee> e) {
        List<Employee> employeeWithMaxSalary = e.stream()
                                                    .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                                                    .limit(1)
                                                    .collect(Collectors.toList());
        return employeeWithMaxSalary;
    }

    //Получить список имен всех сотрудников, работающих в отделе HR и отсортировать их по имени
    private static List<Employee> listOfEmployeeHR(List<Employee> e) {
        List<Employee> listOfEmployeeHR = e.stream()
                                            .filter(employee -> employee.getDepartment() == "HR")
                                            .sorted(Comparator.comparing(Employee::getName))
                                            .collect(Collectors.toList());
        return listOfEmployeeHR;
    }

    //Рассчитать среднюю зарплату всех сотрудников
    private static double avgSalary(List<Employee> e) {
        double avgSalary = e.stream()
                            .mapToDouble(Employee::getSalary)
                            .average()
                            .orElse(Double.NaN);
        return avgSalary;
    }
}
