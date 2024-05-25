package src.java.HW4.Task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        List<Integer> rating1 = new ArrayList<>();
        List<Integer> rating2 = new ArrayList<>();
        List<Integer> rating3 = new ArrayList<>();

        rating1.add(random.nextInt(6));
        rating1.add(random.nextInt(6));
        rating1.add(random.nextInt(6));

        rating2.add(random.nextInt(6));
        rating2.add(random.nextInt(6));
        rating2.add(random.nextInt(6));

        rating3.add(random.nextInt(6));
        rating3.add(random.nextInt(6));
        rating3.add(random.nextInt(6));

        List<Student> listOfStudents = new ArrayList<>();

        Student student1 = new Student("Bob", "j-15", 2, rating1);
        Student student2 = new Student("Mike", "j-15", 1, rating2);
        Student student3 = new Student("Kate", "o-16", 1, rating3);

        listOfStudents.add(student1);
        listOfStudents.add(student2);
        listOfStudents.add(student3);

        System.out.println("Все студенты");
        for (Student student : listOfStudents) {
            System.out.println(student);
        }

        System.out.println("Просмотр студентов по конкретному курсу");
        printStudents(listOfStudents, 2);

        removeOrRaisingStudent(listOfStudents);

        System.out.println("Студенты после проверки среднего рейтинга");
        for (Student student : listOfStudents) {
            System.out.println(student);
        }
    }

    private static void removeOrRaisingStudent(List<Student> listOfStudents) {
        //Удаление студентов с рейтингом < 3
        Predicate<Student> isLessThan3 = student -> student.avgRating() < 3;
        listOfStudents.removeIf(isLessThan3);

        //Переход студента на следующий курс с рейтингом >= 3
        for (int i = 0; i < listOfStudents.size(); i++) {
            if (listOfStudents.get(i).avgRating() >= 3) {
                listOfStudents.get(i).setCourse(listOfStudents.get(i).getCourse() + 1);
            }
        }
    }

    private static void printStudents(List<Student> listOfStudents, int course) {
        for (int i = 0; i < listOfStudents.size(); i++) {
            if (listOfStudents.get(i).getCourse() == course) {
                System.out.println(listOfStudents.get(i));;
            }
        }
    }
}
