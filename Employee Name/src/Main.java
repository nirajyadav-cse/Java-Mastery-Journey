import java.util.ArrayList;

class Employee {

    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " - " + salary;
    }
}

public class Main {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Niraj", 45000));
        employees.add(new Employee("Rahul", 55000));
        employees.add(new Employee("Aman", 40000));
        employees.add(new Employee("Rohit", 65000));

        employees.sort(
                (e1, e2) -> e1.name.compareTo(e2.name)
        );

        System.out.println("Employees sorted by name:");

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}