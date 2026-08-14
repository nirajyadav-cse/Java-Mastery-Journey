
class Student {

    String name;
    int age;
    String course;

}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Niraj";
        s1.age = 21;
        s1.course = "CSE ";

        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
        System.out.println("Course: " + s1.course);

    }
}