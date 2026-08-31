import java.util.ArrayList;
import java.util.Collections;

class NumberValue implements Comparable<NumberValue> {

    int value;

    NumberValue(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(NumberValue other) {
        return Integer.compare(this.value, other.value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}

public class Main {

    public static void main(String[] args) {

        ArrayList<NumberValue> numbers = new ArrayList<>();

        numbers.add(new NumberValue(50));
        numbers.add(new NumberValue(10));
        numbers.add(new NumberValue(40));
        numbers.add(new NumberValue(20));
        numbers.add(new NumberValue(30));

        Collections.sort(numbers);

        System.out.println("Sorted Numbers: " + numbers);
    }
}