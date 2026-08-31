import java.util.ArrayList;
import java.util.Comparator;

class Employee {

    String name;
    int age;
    double salary;

    Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " - Age: " + age
                + ", Salary: ₹" + salary;
    }
}

public class Main {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Niraj", 21, 45000));
        employees.add(new Employee("Rahul", 24, 55000));
        employees.add(new Employee("Aman", 22, 40000));
        employees.add(new Employee("Rohit", 23, 65000));

        // Name ascending
        employees.sort(
                Comparator.comparing(employee -> employee.name)
        );

        System.out.println("Sorted by Name:");

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        // Age ascending
        employees.sort(
                Comparator.comparingInt(
                        (Employee employee) -> employee.age
                )
        );

        System.out.println("\nSorted by Age:");

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        // Salary ascending
        employees.sort(
                Comparator.comparingDouble(
                        (Employee employee) -> employee.salary
                )
        );

        System.out.println("\nSorted by Salary:");

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        // Salary descending
        employees.sort(
                Comparator.comparingDouble(
                        (Employee employee) -> employee.salary
                ).reversed()
        );

        System.out.println("\nSalary Descending:");

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}