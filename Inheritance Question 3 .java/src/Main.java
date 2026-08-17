class Person {

    String name;
    int age;

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {

    String course;

    void study() {
        System.out.println(name + " is studying " + course);
    }
}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Niraj";
        s1.age = 21;
        s1.course = "CSE ";

        s1.displayPerson();
        s1.study();
    }
}