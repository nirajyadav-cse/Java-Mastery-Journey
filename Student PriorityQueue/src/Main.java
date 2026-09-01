import java.util.PriorityQueue;

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

        PriorityQueue<Student> students =
                new PriorityQueue<>(
                        (s1, s2) ->
                                Integer.compare(s2.marks, s1.marks)
                );

        students.offer(new Student("Niraj", 85));
        students.offer(new Student("Rahul", 72));
        students.offer(new Student("Aman", 92));
        students.offer(new Student("Rohit", 78));

        System.out.println("Students by highest marks:");

        while (!students.isEmpty()) {

            System.out.println(students.poll());
        }
    }
}