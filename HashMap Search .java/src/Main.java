
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Niraj");
        students.put(102, "Rahul");
        students.put(103, "Aman");
        students.put(104, "Rohit");

        System.out.print("Enter roll number: ");
        int rollNumber = sc.nextInt();

        if (students.containsKey(rollNumber)) {

            System.out.println(
                    "Student Name: " + students.get(rollNumber)
            );

        } else {

            System.out.println("Student not found");
        }

        sc.close();
    }
}