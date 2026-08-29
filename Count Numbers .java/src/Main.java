import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(20);
        numbers.add(60);
        numbers.add(45);
        numbers.add(80);
        numbers.add(90);

        long count = numbers.stream()
                .filter(number -> number > 50)
                .count();

        System.out.println(
                "Numbers greater than 50: " + count
        );
    }
}