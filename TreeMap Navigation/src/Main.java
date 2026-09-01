import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        TreeMap<Integer, String> students =
                new TreeMap<>();

        students.put(101, "Niraj");
        students.put(103, "Aman");
        students.put(105, "Rohit");
        students.put(107, "Rahul");
        students.put(109, "Vivek");

        System.out.println("TreeMap: " + students);

        System.out.println(
                "First Key: " + students.firstKey()
        );

        System.out.println(
                "Last Key: " + students.lastKey()
        );

        System.out.println(
                "Lower than 105: " + students.lowerKey(105)
        );

        System.out.println(
                "Higher than 105: " + students.higherKey(105)
        );
    }
}