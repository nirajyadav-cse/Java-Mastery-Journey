
import java.util.ArrayList;

class StudentName {

    String name;
    int marks;

    StudentName(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " - " + marks;
    }
}

public class Main {

    public static void main(String[] args) {

        ArrayList<StudentName> students = new ArrayList<>();

        students.add(new StudentName("Niraj", 85));
        students.add(new StudentName("Rahul", 72));
        students.add(new StudentName("Aman", 92));
        students.add(new StudentName("Rohit", 78));

        students.sort(
                (s1, s2) -> s1.name.compareTo(s2.name)
        );

        System.out.println("Students sorted by name:");

        for (StudentName student : students) {
            System.out.println(student);
        }
    }
}