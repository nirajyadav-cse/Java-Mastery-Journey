import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("Niraj");
        names.add("Rahul");
        names.add("Aman");
        names.add("Rohit");
        names.add("Vivek");

        System.out.println("Student Names:");

        for (String name : names) {
            System.out.println(name);
        }
    }
}