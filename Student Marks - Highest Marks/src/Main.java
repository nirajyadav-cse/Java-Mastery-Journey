import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("Niraj", 95);
        marks.put("Rahul", 78);
        marks.put("Aman", 92);
        marks.put("Rohit", 88);
        marks.put("Vivek", 75);

        String topStudent = "";
        int highestMarks = -1;

        for (Map.Entry<String, Integer> entry :
                marks.entrySet()) {

            if (entry.getValue() > highestMarks) {

                highestMarks = entry.getValue();
                topStudent = entry.getKey();
            }
        }

        System.out.println("Student Marks: " + marks);

        System.out.println(
                "Highest Marks: " + topStudent
                        + " = " + highestMarks
        );
    }
}