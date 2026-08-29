import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("Squares:");

        numbers.stream()
                .map(number -> number * number)
                .forEach(number -> System.out.println(number));
    }
}