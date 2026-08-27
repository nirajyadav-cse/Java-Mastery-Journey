
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {

            FileWriter writer =
                    new FileWriter("student.txt");

            writer.write("Name: Niraj\n");
            writer.write("Course: CSE AI ML\n");
            writer.write("Subject: Java\n");
            writer.write("Day: 29");

            writer.close();

            System.out.println("Data written successfully");

        } catch (IOException e) {

            System.out.println("Error while writing file");
        }
    }
}