class Employee {

    String name;
    double salary;

    void work() {
        System.out.println(name + " is working");
    }
}

class Manager extends Employee {

    void manageTeam() {
        System.out.println(name + " is managing the team");
    }
}

public class Main {

    public static void main(String[] args) {

        Manager m1 = new Manager();

        m1.name = "Rahul";
        m1.salary = 70000;

        System.out.println("Name: " + m1.name);
        System.out.println("Salary: " + m1.salary);

        m1.work();
        m1.manageTeam();
    }
}