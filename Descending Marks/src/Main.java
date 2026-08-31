import java.util.ArrayList;

class Student {

    String name;
    int marks;

    Student(String name, int marks) {
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

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Niraj", 85));
        students.add(new Student("Rahul", 72));
        students.add(new Student("Aman", 92));
        students.add(new Student("Rohit", 78));

        students.sort(
                (s1, s2) ->
                        Integer.compare(s2.marks, s1.marks)
        );

        System.out.println("Marks from highest to lowest:");

        for (Student student : students) {
            System.out.println(student);
        }
    }
}