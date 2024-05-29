package src.java.HW5.Task2;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {

    private String name;
    private int age;
    private String department;
    private double salary;

    public Employee(String name, int age, String department, double salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", возраст, " + age + ", департамент: " + department + ", зарплата: " + salary;
    }

    @Override
    public int compareTo(Employee e) {
        if (this.getAge() > e.getAge()) return  1;
        else if (this.getAge() < e.getAge()) return -1;
        else return 0;
    }
}
