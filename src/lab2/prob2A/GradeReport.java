package lab2.prob2A;

import java.util.HashMap;

public class GradeReport {
    Student student;
    HashMap<String, Integer> grades;

    GradeReport(Student student) {
        this.student = student;
        grades = new HashMap<>();
    }

    public void addGrade(String course, int grade) {
        grades.put(course, grade);
    }

    public int getGrade(String course) {
        return grades.get(course);
    }

    public String toString() {
        return student.name + ": " + grades;
    }
}
