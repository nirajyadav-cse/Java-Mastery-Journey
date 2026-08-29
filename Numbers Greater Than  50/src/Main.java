import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(25);
        numbers.add(60);
        numbers.add(45);
        numbers.add(80);
        numbers.add(35);
        numbers.add(90);

        System.out.println("Numbers greater than 50:");

        numbers.stream()
                .filter(number -> number > 50)
                .forEach(number -> System.out.println(number));
    }
}