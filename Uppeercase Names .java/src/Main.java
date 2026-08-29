import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Niraj");
        names.add("Rahul");
        names.add("Aman");
        names.add("Rohit");

        System.out.println("Names in uppercase:");

        names.stream()
                .map(name -> name.toUpperCase())
                .forEach(name -> System.out.println(name));
    }
}