import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        numbers.add(35);

        System.out.println("Before removing even numbers: " + numbers);

        for (int i = numbers.size() - 1; i >= 0; i--) {

            if (numbers.get(i) % 2 == 0) {

                numbers.remove(i);
            }
        }

        System.out.println("After removing even numbers: " + numbers);
    }
}