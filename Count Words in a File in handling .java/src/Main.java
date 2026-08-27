import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main{

    public static void main(String[] args) {

        int wordCount = 0;

        try {

            BufferedReader reader =
                    new BufferedReader(
                            new FileReader("student.txt")
                    );

            String line;

            while ((line = reader.readLine()) != null) {

                line = line.trim();

                if (!line.isEmpty()) {

                    String[] words = line.split("\\s+");

                    wordCount += words.length;
                }
            }

            reader.close();

            System.out.println("Total words: " + wordCount);

        } catch (IOException e) {

            System.out.println("Error while reading file");
        }
    }
}