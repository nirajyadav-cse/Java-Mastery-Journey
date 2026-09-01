import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        TreeMap<Integer, String> students =
                new TreeMap<>();

        students.put(103, "Aman");
        students.put(101, "Niraj");
        students.put(105, "Vivek");
        students.put(102, "Rahul");
        students.put(104, "Rohit");

        System.out.println("Student Records:");

        for (Integer rollNo : students.keySet()) {

            System.out.println(
                    rollNo + " - " + students.get(rollNo)
            );
        }
    }
}