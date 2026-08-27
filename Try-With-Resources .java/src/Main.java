import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try (FileWriter writer =
                     new FileWriter("java.txt")) {

            writer.write("I am learning Java File Handling.");

            System.out.println("Data written successfully");

        } catch (IOException e) {

            System.out.println("Error occurred");
        }
    }
}