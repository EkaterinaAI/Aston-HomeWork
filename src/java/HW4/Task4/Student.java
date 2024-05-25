package src.java.HW4.Task4;

import java.util.List;

public class Student {

    private String name;
    private String group;
    private int course;
    private List<Integer> rating;

    public Student(String name, String group, int course, List<Integer> rating) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public List<Integer> getRating() {
        return rating;
    }

    public void setRating(List<Integer> rating) {
        this.rating = rating;
    }

    public double avgRating() {
        double ratingSum = 0;

        for (int i = 0; i < getRating().size(); i++) {
            ratingSum += rating.get(i);
        }
        return ratingSum / getRating().size();
    }

    @Override
    public String toString() {
        return name + ", группа - " + group + ", курс - " + course + ", оценки " + rating + ", сумма оценок " + avgRating();
    }
}
