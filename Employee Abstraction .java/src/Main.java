abstract class Employee {

    String name;

    Employee(String name) {

        this.name = name;
    }

    abstract void work();

    void displayName() {

        System.out.println("Employee Name: " + name);
    }
}

class Manager extends Employee {

    Manager(String name) {

        super(name);
    }

    @Override
    void work() {

        System.out.println(name + " is managing the team");
    }
}

class Developer extends Employee {

    Developer(String name) {

        super(name);
    }

    @Override
    void work() {

        System.out.println(name + " is writing code");
    }
}

public class Main {

    public static void main(String[] args) {

        Manager m1 = new Manager("Rahul");

        Developer d1 = new Developer("Niraj");

        m1.displayName();
        m1.work();

        System.out.println();

        d1.displayName();
        d1.work();
    }
}