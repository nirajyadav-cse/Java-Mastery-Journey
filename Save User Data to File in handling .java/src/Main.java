import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your course: ");
        String course = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {

            FileWriter writer =
                    new FileWriter("student.txt");

            writer.write("Name: " + name + "\n");
            writer.write("Course: " + course + "\n");
            writer.write("Age: " + age);

            writer.close();

            System.out.println("Student data saved");

        } catch (IOException e) {

            System.out.println("Error while saving data");
        }

        sc.close();
    }
}