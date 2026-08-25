import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

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