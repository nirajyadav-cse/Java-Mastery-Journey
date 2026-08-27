import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        int count = 0;

        try {

            BufferedReader reader =
                    new BufferedReader(
                            new FileReader("student.txt")
                    );

            while (reader.readLine() != null) {

                count++;
            }

            reader.close();

            System.out.println("Total lines: " + count);

        } catch (IOException e) {

            System.out.println("Error while reading file");
        }
    }
}