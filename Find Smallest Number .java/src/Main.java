import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(25);
        numbers.add(10);
        numbers.add(75);
        numbers.add(40);
        numbers.add(60);

        int smallest = numbers.get(0);

        for (int number : numbers) {

            if (number < smallest) {
                smallest = number;
            }
        }

        System.out.println("Numbers: " + numbers);
        System.out.println("Smallest number: " + smallest);
    }
}