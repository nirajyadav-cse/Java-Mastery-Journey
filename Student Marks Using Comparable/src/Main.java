import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {

    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.marks, other.marks);
    }

    @Override
    public String toString() {
        return name + " - " + marks;
    }
}

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Niraj", 85));
        students.add(new Student("Rahul", 72));
        students.add(new Student("Aman", 92));
        students.add(new Student("Rohit", 78));

        Collections.sort(students);

        System.out.println("Students sorted by marks:");

        for (Student student : students) {
            System.out.println(student);
        }
    }
}