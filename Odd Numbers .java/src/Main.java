import java.util.ArrayList;

public class Main{

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);

        System.out.println("Odd Numbers:");

        numbers.stream()
                .filter(number -> number % 2 != 0)
                .forEach(number -> System.out.println(number));
    }
}