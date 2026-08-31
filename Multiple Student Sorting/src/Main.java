import java.util.ArrayList;

class Student {

    String name;
    int age;
    int marks;

    Student(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " - Age: " + age
                + ", Marks: " + marks;
    }
}

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Niraj", 20, 85));
        students.add(new Student("Rahul", 19, 72));
        students.add(new Student("Aman", 21, 92));
        students.add(new Student("Rohit", 20, 78));

        // Sort by name
        students.sort(
                (s1, s2) -> s1.name.compareTo(s2.name)
        );

        System.out.println("Sorted by Name:");

        for (Student student : students) {
            System.out.println(student);
        }

        // Sort by age
        students.sort(
                (s1, s2) -> Integer.compare(s1.age, s2.age)
        );

        System.out.println("\nSorted by Age:");

        for (Student student : students) {
            System.out.println(student);
        }

        // Sort by marks
        students.sort(
                (s1, s2) -> Integer.compare(s1.marks, s2.marks)
        );

        System.out.println("\nSorted by Marks:");

        for (Student student : students) {
            System.out.println(student);
        }
    }
}