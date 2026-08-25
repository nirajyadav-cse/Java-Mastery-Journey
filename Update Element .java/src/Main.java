import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Before update: " + numbers);

        numbers.set(1, 100);

        System.out.println("After update: " + numbers);
    }
}
