class Employee {

    String name;
    int id;
    double salary;

}

public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee();

        e1.name = "Rahul";
        e1.id = 101;
        e1.salary = 50000;

        System.out.println("Name: " + e1.name);
        System.out.println("ID: " + e1.id);
        System.out.println("Salary: " + e1.salary);

    }
}