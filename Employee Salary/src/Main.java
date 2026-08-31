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
                (e1, e2) ->
                        Double.compare(e1.salary, e2.salary)
        );

        System.out.println("Employees sorted by salary:");

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}