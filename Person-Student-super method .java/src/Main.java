class Person {

    String name = "Person";
}

class Student extends Person {

    String name = "Student";

    void displayNames() {

        System.out.println("Student name: " + name);

        System.out.println("Parent name: " + super.name);
    }
}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.displayNames();
    }
}