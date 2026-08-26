import java.util.HashMap;
import java.util.Map;

public class Main{

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Niraj");
        students.put(102, "Rahul");
        students.put(103, "Aman");
        students.put(104, "Rohit");

        System.out.println("Student Records:");

        for (Map.Entry<Integer, String> entry :
                students.entrySet()) {

            System.out.println(
                    "Roll No: " + entry.getKey()
                            + ", Name: " + entry.getValue()
            );
        }
    }
}