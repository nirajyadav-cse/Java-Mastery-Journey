class Student {

    String name;
    int age;
    String course;

    Student(String name, int age, String course) {

        this.name = name;
        this.age = age;
        this.course = course;
    }

    void displayDetails() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("Niraj", 21, "CSE");

        s1.displayDetails();
    }
}