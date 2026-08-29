import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(25);
        numbers.add(75);
        numbers.add(10);
        numbers.add(90);
        numbers.add(45);

        int minimum = numbers.stream()
                .min(Integer::compareTo)
                .get();

        int maximum = numbers.stream()
                .max(Integer::compareTo)
                .get();

        System.out.println("Minimum: " + minimum);
        System.out.println("Maximum: " + maximum);
    }
}