import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            FileWriter writer =
                    new FileWriter("students.txt");

            System.out.print("How many students? ");
            int n = sc.nextInt();

            sc.nextLine();

            for (int i = 1; i <= n; i++) {

                System.out.println("\nStudent " + i);

                System.out.print("Enter name: ");
                String name = sc.nextLine();

                System.out.print("Enter course: ");
                String course = sc.nextLine();

                System.out.print("Enter marks: ");
                double marks = sc.nextDouble();

                sc.nextLine();

                writer.write("Student " + i + "\n");
                writer.write("Name: " + name + "\n");
                writer.write("Course: " + course + "\n");
                writer.write("Marks: " + marks + "\n");
                writer.write("--------------------\n");
            }

            writer.close();

            System.out.println("\nStudent records saved successfully");

        } catch (IOException e) {

            System.out.println("Error while saving records");
        }

        sc.close();
    }
}