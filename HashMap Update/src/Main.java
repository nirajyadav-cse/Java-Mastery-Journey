import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Niraj");
        students.put(102, "Rahul");
        students.put(103, "Aman");

        System.out.println("Before update: " + students);

        students.put(102, "Rohit");

        System.out.println("After update: " + students);
    }
}