package lab2.prob2A;

public class testClasses {
    public static void main(String[] args) {
        Student s = new Student("Bob");
        s.addGrade("Math", 90);
        s.addGrade("English", 80);
        System.out.println(s);
    }
}
