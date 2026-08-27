import java.io.File;

public class Main {

    public static void main(String[] args) {

        File file = new File("student.txt");

        if (file.delete()) {

            System.out.println("File deleted successfully");

        } else {

            System.out.println("File could not be deleted");
        }
    }
}