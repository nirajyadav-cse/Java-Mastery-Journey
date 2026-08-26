import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Niraj");
        students.put(102, "Rahul");
        students.put(103, "Aman");
        students.put(104, "Rohit");
        students.put(105, "Vivek");

        System.out.println("Student Records:");

        System.out.println(students);
    }
}