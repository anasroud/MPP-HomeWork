package prob2A;

public class Student {
    String name;
    GradeReport gradeReport;

    Student(String name) {
        this.name = name;
        this.gradeReport = new GradeReport(this);
    }

    public void addGrade(String course, int grade) {
        gradeReport.addGrade(course, grade);
    }

    public int getGrade(String course) {
        return gradeReport.getGrade(course);
    }

    public String toString() {
        return name + " " + gradeReport;
    }
}
